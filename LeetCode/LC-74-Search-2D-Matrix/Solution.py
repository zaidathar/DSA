def binarySearch(arr , l , r , target):
    if l <= r :
        mid = (l+r)//2
        if arr[mid] == target :
            return mid
        elif arr[mid] > target:
            return binarySearch(arr,l,mid-1,target)
        else:
            return binarySearch(arr,mid+1,r,target)
    return -1;

class Solution:
    
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        for arr in matrix:
            if arr[0] > target:
                break
            ind = binarySearch(arr, 0, len(arr)-1, target)
            if ind != -1:
                return True
        return False