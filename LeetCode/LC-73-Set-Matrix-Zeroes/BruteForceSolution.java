class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length, col = matrix[0].length;
        boolean[] rows = new boolean[row];
        boolean[] cols = new boolean[col];

        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                if( matrix[i][j] ==0){
                    rows[i]=true;
                    cols[j]=true;
                }
            }
        }

        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                if( rows[i] || cols[j] ){
                    matrix[i][j]=0;
                }
            }
        }

    }
}
