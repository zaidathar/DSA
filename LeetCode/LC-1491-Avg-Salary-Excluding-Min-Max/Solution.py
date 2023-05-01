class Solution:
    def average(self, salary: List[int]) -> float:
        minS,maxS = 10000000 , -1
        sumS = 0

        for i in salary:
            minS = i if i < minS else minS
            maxS = i if i > maxS else maxS
            sumS += i
        
        sumS -= (maxS + minS)

        return sumS/(len(salary) - 2);