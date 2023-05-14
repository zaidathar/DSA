class Solution:
    def maxScore(self, nums: List[int]) -> int:
        dp = collections.defaultdict(int)
        def f(mask , opr):
            if dp[mask]:
                return dp[mask]
            
            dp[mask] = 0

            for i in range(len(nums)):
                for j in range( i+1 , len(nums)):
                    if (1 << i) & mask or ( 1<< j) & mask :
                        continue
                    
                    nMask = mask | ( 1 << i) | (1 << j)
                    score = opr * math.gcd(nums[i],nums[j])
                    dp[mask] = max( dp[mask] ,score +f(nMask , opr+1))
            return dp[mask]

        return f(0,1)
