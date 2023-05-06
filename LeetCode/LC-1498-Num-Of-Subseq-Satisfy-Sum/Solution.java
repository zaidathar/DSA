class Solution {
        public int numSubseq(int[] A, int target) {
        Arrays.sort(A);
        int res = 0, n = A.length, l = 0; 
        int r = n - 1, mod = 1000_000_007;
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 1 ; i < n ; ++i)
            dp[i] = dp[i - 1] * 2 % mod;
        while (l <= r) {
            if (A[l] + A[r] > target) {
                r--;
            } 
            else {
                res = (res + dp[r - l]) % mod;
                l++;
            }
        }
        return res;
    }
}
