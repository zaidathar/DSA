class Solution {
    private Set<List<Integer>> visited ;
    private int cnt;
    private int ROW,COL;

    public static int min(int a , int b , int c , int d){
        int[] arr = {a,b,c,d};
        Arrays.sort(arr);
        return arr[0];
    }

    public int dfs(int[][] grid,int row , int col){
        int res = 0;
        if(row < 0 || row == ROW || col < 0 || col == COL) {
            return 0;
        }
        if(grid[row][col] == 0 || visited.contains(Arrays.asList(row,col)) ){
            return 1;
        }

        visited.add(Arrays.asList(row,col));

        res = min(
            dfs(grid,row, col-1),
            dfs(grid,row, col+1),
            dfs(grid,row-1,col),
            dfs(grid,row+1, col)
        );

        cnt = res!=0 ? cnt+1 : 0;

        return res;
    }

    public int numEnclaves(int[][] grid) {
        ROW = grid.length;COL = grid[0].length;
        visited = new HashSet();

        int res = 0;

        for( int row = 0 ;row < ROW ;row++){
            
            for(int col = 0; col < COL ;col++){
                cnt = 0;
                if(grid[row][col] == 1 && !visited.contains(Arrays.asList(row,col)) )
                dfs(grid,row,col);
                res += cnt;
            }
        }

        return res;
    }
}