class Solution {
    int mod = 1000000007;
    int[] dp;
    public int recursiveCall(int cnt , int zero ,int one , int low , int high){
        if(cnt > high) return 0;
        if(dp[cnt] != -1)return dp[cnt];
        dp[cnt] = cnt >= low ? 1 : 0;
        dp[cnt] += (recursiveCall(cnt+zero,zero, one , low , high) + recursiveCall(cnt+one,zero, one , low , high))%mod;

        return dp[cnt];
        
    }
    public int countGoodStrings(int low, int high, int zero, int one) {
        dp = new int[high+1];
        Arrays.fill(dp,-1);

        return recursiveCall(0,zero,one,low,high);

    }
}
