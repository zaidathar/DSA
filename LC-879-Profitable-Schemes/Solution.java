class Solution {
    public int profitableSchemes(int G, int P, int[] group, int[] profit) {
        int[][] track = new int[P + 1][G + 1];
        track[0][0] = 1;
        int result = 0, mod = 1000000000 + 7;
        for (int k = 0; k < group.length; k++) {
            int g = group[k] ;
            int p = profit[k];
            for (int i = P; i >= 0; i--)
                for (int j = G - g; j >= 0; j--)
                    track[Math.min(i + p, P)][j + g] = (track[Math.min(i + p, P)][j + g] + track[i][j]) % mod;
        }
        for (int x : track[P]) result = (result + x) % mod;
        return result;
    }
}
