def bs(arr , l , r , val , target):
    if l <= r:
        mid = (l+r)//2
        if arr [mid] * val >= target:
            return bs(arr, l , mid -1,val , target)
        else:
            return bs(arr,mid+1,r,val,target)
    print(l)
    return l
class Solution:
    def successfulPairs(self, spells: List[int], potions: List[int], success: int) -> List[int]:
        #First Approach 
        # will going to sort potions and tranversing from back 
        # for sorting complexity will be O(nlogn)+O(n) for traversing
        # Given TLE

        #Second Approch
        #Sort potions and do binary search 

        potions.sort()
        res = []
        length = len(potions) - 1
        for i in spells:
            ind = bs(potions,0,length,i , success);
            if ind > length :
                counter = 0
            else:
                counter = length - ind +1
            res.append(counter)

        return res;