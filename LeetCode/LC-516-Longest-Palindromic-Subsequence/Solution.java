class Solution {
   int[][] track;
    String s;

    private int find(int left, int right) {
        if (left > right) return 0;

        if (track[left][right] != 0) return track[left][right];

        if (s.charAt(left) == s.charAt(right)) {
            int result = left == right ? 1 : 2;
            track[left][right] += result + find(left+1 , right-1);
        }
        else {
            track[left][right] = Math.max(
                find(left+1, right),
                find(left, right-1)
            );
        }

        return track[left][right];
    }

    public int longestPalindromeSubseq(String s) {
        int len = s.length();        
        track = new int[len][len];
        this.s = s;
        return find(0, len -1);
    }
    
}
