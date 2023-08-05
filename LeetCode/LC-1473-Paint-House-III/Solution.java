class Solution {
    public int[][][] dp;
    public int max =Integer.MAX_VALUE;
    public int help(int i , int l , int t , int[] houses, int[][] cost, int m, int n, int target){
        if(t > target )return max/2;
        if(i==m)return target == t? 0:max/2;
        if(dp[i][l][t] != 0 )return dp[i][l][t];
        else{
            int ans = max/2;
            if(houses[i]==0){
                for(int j = 0; j<n;j++){
                    ans = Math.min(ans,cost[i][j]+help(i+1,j+1,(l==j+1)?t:t+1,houses,cost,m,n,target));
                }
            }
            else{
                ans = Math.min(ans,help(i+1,houses[i],houses[i]==l ? t : t+1 ,houses,cost,m,n,target));
            }
             return dp[i][l][t]=ans;
        }
       
    }
    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        dp = new int[101][21][101];
        int ans = help(0,0,0,houses,cost,m,n,target);
        return ans == max/2 ? -1 :ans;
        
    }
}