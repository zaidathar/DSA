class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int row = 0 , i = 0 , j = n-1 ,sum = 0;

        while(row < n){
            if(i==j){
                sum+=mat[row][i];
            }
            else{
                sum+=(mat[row][i] + mat[row][j]);
            }
            i++;j--;
            row++;
        }

        return sum;

    }
}
