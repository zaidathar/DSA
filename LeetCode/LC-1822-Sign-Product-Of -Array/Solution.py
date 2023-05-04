class Solution:
    
    def arraySign(self, nums: List[int]) -> int:
        def signFunc(x):
            if x == 0:
                return 0
            elif x < 0 :
                return -1
            else:
                return 1
        mul = 1
        for i in nums:
            mul *= i
        return signFunc(mul)
    