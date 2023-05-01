class Solution(object):
    cnt = 0
    def numEnclaves(self, grid):
        ROW , COL = len(grid) , len(grid[0])
        global cnt
        visited = set()
        def dfs(row , col):
            res = 0
            global cnt
            if row < 0 or col < 0 or row == ROW or col == COL:
                return 0

            if grid[row][col] == 0 or (row , col) in visited:
                return 1
            

            visited.add((row,col))

            res = min(
                dfs(row,col-1),
                dfs(row, col +1 ),
                dfs(row-1 , col),
                dfs(row+1,col)
            )

            if res != 0 :
                cnt+=1
            else:
                cnt = 0
            return res
        
        res = 0
        for row in range(ROW):
            for col in range(COL):
                cnt = 0
                if grid[row][col] == 1 and (row,col) not in visited:
                    dfs(row,col)
                    res += cnt
        return res