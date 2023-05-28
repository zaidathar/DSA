class Solution {
    int[][] dp;
    private int find(int sInd, int eInd, int[] cuts, int left, int right){
        if(left > right)return 0;
        if(dp[left][right] != -1)return dp[left][right];

        int cost = Integer.MAX_VALUE;

        for(int i = left ; i<=right ; i++){
            int leftCost = find(sInd , cuts[i], cuts, left, i-1);
            int rightCost = find( cuts[i],eInd , cuts, i+1, right);
            int curCost = (eInd - sInd) + leftCost + rightCost;

            cost = Math.min(cost, curCost);

        }

        return dp[left][right] = cost;
    }
    public int minCost(int n, int[] cuts) {
        dp = new int[cuts.length][cuts.length];

        for(int[] row : dp){
            Arrays.fill(row, -1);
        }

        Arrays.sort(cuts);
        return find(0, n, cuts , 0, cuts.length-1);
    }
}
