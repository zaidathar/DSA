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
- Iterate boolean array of row if true found set all value of particular row in matrix as zero and apply same for coloumn boolean array

[Solution](../LeetCode/LC-73-Set-Matrix-Zeroes/BruteForceSolution.java)




