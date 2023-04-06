class Solution(object):
    def closedIsland(self, grid):
        n , m = len(grid) , len(grid[0])
        visited = set()

        def DFS( row , col):
            if row < 0 or col < 0 or row == n or col == m:
                return 0
            
            if grid[row][col] == 1 or (row,col) in visited:
                return 1

            visited.add((row,col))

            return min(
                DFS(row,col+1),
                DFS(row,col-1),
                DFS(row+1,col),
                DFS(row-1,col)
                )

        
        res = 0
        for i in range(n):
            for j in range(m):
                if grid[i][j] == 0 and (i,j) not in visited:
                    res += DFS(i,j)
                    

        return res
