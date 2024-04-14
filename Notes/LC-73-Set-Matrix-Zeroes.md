# LeetCode Problem 73 - Set Matrix Zeroes

## Problem

![LeetCode 73](./images/LC-73-Problem.png)


![LeetCode-73 Constraint](./images/LC-73-Constraints.png)


## My First Approach 

> Time complexity O(m*n)

> Space complexity O(max(m,n)) 

### Intuition 

- Create two boolean array for marking row and coloum containing zero.
- Iterate over matrix if any value is zero mark row and col of boolean array as true.
- Iterate boolean array of row if true found set all value of particular row in matrix as zero and apply same for column boolean array

[Solution](../LeetCode/LC-73-Set-Matrix-Zeroes/BruteForceSolution.java)



## Optimal Solution ( Without extra space )

> Time Complexity O(m*n)

> Space Complexity O(1)


### Intuition 

- Using first row and first column of matrix to keep track of cells that need to be marked as zero.
- For 0th row we will be using matrix[0][0] if cell value is 0 
- For 0th column we will be using a variable col0 if cell value is 0
- Iterate over matrix from 1st index if any cell had zero mark 0th index of row and col as 0.
- Iterate over matrix from 1st index and set cell as zero if 0th row or 0th col is zero.
- if matrix[0][0] is zero means all cell of first row should be zero
- if col0 is zero means all cell of first column should be zero


[Solution](../LeetCode/LC-73-Set-Matrix-Zeroes/OptimalSolution.java)



