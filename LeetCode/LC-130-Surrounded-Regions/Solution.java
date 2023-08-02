class Solution {
    public void capture(int i , int j , char[][] board){
        if(i<0 || i>=board.length ||
           j<0 || j>=board[0].length || 
           board[i][j]!='O')return;
        
        board[i][j] = 'T';
        capture(i+1,j,board);
        capture(i-1,j,board);
        capture(i,j+1,board);
        capture(i,j-1,board);
        
    }
    
    public void solve(char[][] board) {
        int row = board.length , col = board[0].length;
        
        for(int i = 0;i<col;i++){
            if(board[0][i]=='O')capture(0,i,board);
            if(board[row-1][i]=='O')capture(row-1,i,board);
        }
        
        for (int i = 0; i < row; i++) {
            if (board[i][0] == 'O') capture(i, 0,board);
            if (board[i][col-1] == 'O') capture(i, col - 1,board);
        }
        
        for(int i = 0;i<row;i++){
            for(int j =0 ;j<col;j++){
                if(board[i][j]=='O')board[i][j]='X';
                if(board[i][j]=='T')board[i][j]='O';
                
            }
        }
    }
}