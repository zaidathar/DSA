class Solution {
    public int numWays(String[] words, String target) {
        int wordSize = words[0].length();
        int targetSize = target.length();
        int[] track = new int[targetSize+1];
        track[0] = 1;
        int[][] c = new int[wordSize][26];
        int mod = 1000000007;

        for(String s : words){
            for(int i = 0 ; i < wordSize ; i++){
                c[i][s.charAt(i) - 'a']++;
            }
        }

        for (int i = 0; i < wordSize; i++) {
            for (int j = targetSize-1; j >= 0; j--) {
                track[j+1] += (int)((long)track[j] * c[i][target.charAt(j) - 'a'] % mod);
                track[j+1] %= mod;
            }
        }

        return track[targetSize];
    }
}
