class Solution {
    public int numberOfArrays(String s, int k) {
        int[] track = new int[s.length()];
        Arrays.fill(track, -1);
        return dfs(s, k, 0, track);
    }

    public int dfs(String str, long k, int i, int[] track) {
        if (i == str.length()) {
            return 1;
        }
        if (str.charAt(i) == '0') return 0;
        if (track[i] != -1) return track[i];

        int res = 0;
        long num = 0;
        for (int j = i; j < str.length(); j++) {
            num = num * 10 + str.charAt(j) - '0';
            if (num > k) break;
            res = (res + dfs(str, k, j + 1, track)) % 1000000007;
        }
        return track[i] = res;
    }

    
}
