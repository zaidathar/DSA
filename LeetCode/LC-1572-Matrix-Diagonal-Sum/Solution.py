class Solution:
    def diagonalSum(self, mat: List[List[int]]) -> int:
        n = len(mat)
        i,j=0,n-1
        sum,row = 0,0
        while row < n:
            if i==j :
                sum += mat[row][i]
            else:
                sum+= mat[row][i]
                sum += mat[row][j]
            i+=1
            j-=1
            row+=1
        return sum
        
