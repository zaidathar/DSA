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


        for(int i= 0 ; i < row ; i++){
            if(rows[i]){
                for(int c = 0 ; c < col ; c++){
                    matrix[i][c]=0;
                }
                rows[i]=false;
            }
        }

        for(int i= 0 ; i < col ; i++){
            if(cols[i]){
                for(int r = 0 ; r < row ; r++){
                    matrix[r][i]=0;
                }
                cols[i]=false;
            }
        }
    }
}
