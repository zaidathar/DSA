class Solution {
    public long mostPoints(int[][] questions) {
        int l = questions.length;
        long[] dp = new long[l+1];

        for(int i = l-1 ;i > -1;i--){
            int p = questions[i][0];
            int q = questions[i][1];
            int target = Math.min(l , i + q + 1);
            dp[i] = Math.max(dp[i+1] , p + dp[target]);
        }

        return dp[0];

    }
}
