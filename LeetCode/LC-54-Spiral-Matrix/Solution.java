class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       List<Integer> res = new ArrayList<>();
        
        int row = matrix.length, col = matrix[0].length;
        
        int l = 0, r = col - 1, t = 0, b = row - 1;
        
        while (true) {
            for (int i = l; i <= r; i++)res.add(matrix[t][i]);
            t++;
            if (r < l || t > b) break;
            
            for (int i = t; i <= b; i++)res.add(matrix[i][r]);
            r--;
            if (r < l || t > b)break;
            
            for (int i = r; i >= l; i--)res.add(matrix[b][i]);
            b--;
            if (r < l || t > b)break;
            
            for (int i = b; i >= t; i--)res.add(matrix[i][l]);
            l++;
            if (r < l || t > b)break;
        }
        
        return res;
    }
}
