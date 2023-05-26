class Solution {
    
    public int stoneGameII(int[] piles) {
        int[][][] dp = new int[2][piles.length + 1][piles.length + 1];
        for (int p = 0; p < 2; p++) {
            for (int i = 0; i <= piles.length; i++) {
                for (int m = 0; m <= piles.length; m++) {
                    dp[p][i][m] = -1;
                }
            }
        }
        return game(piles, dp, 0, 0, 1);
    }

    private int game(int[] piles, int[][][] dp, int p, int i, int m) {
        if (i == piles.length) {
            return 0;
        }
        if (dp[p][i][m] != -1) {
            return dp[p][i][m];
        }
        int result = p == 1 ? 1000000 : -1, s = 0;
        for (int x = 1; x <= Math.min(2 * m, piles.length - i); x++) {
            s += piles[i + x - 1];
            if (p == 0) {
                result = Math.max(result, s + game(piles, dp, 1, i + x, Math.max(m, x)));
            }
            else {
                result = Math.min(result, game(piles, dp, 0, i + x, Math.max(m, x)));
            }
        }
        return dp[p][i][m] = result;
    }
}
