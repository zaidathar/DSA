class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int row = n, col = n;
        
        int l = 0, r = col - 1, t = 0, b = row - 1;
        int val = 1;
        
        while (true) {
            for (int i = l; i <= r; i++){
                res[t][i] = val;
                val++;
            }
            t++;
            if (r < l || t > b) break;
            
            for (int i = t; i <= b; i++){
                res[i][r]=val;
                val++;
            }
            r--;
            if (r < l || t > b)break;
            
            for (int i = r; i >= l; i--){
                res[b][i] = val;
                val++;
            }
            b--;
            if (r < l || t > b)break;
            
            for (int i = b; i >= t; i--){
                res[i][l]= val;
                val++;
            }
            l++;
            if (r < l || t > b)break;
        }
        
        return res;
    }
}