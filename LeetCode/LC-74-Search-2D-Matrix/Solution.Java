class Solution {
    public int binarySearch(int[] arr , int l , int r , int target){
        if ( l <= r){
            int mid = (l+r)/2;
            if (arr[mid] == target) return mid;
            else if(arr[mid] < target) return binarySearch(arr,mid+1,r,target);
            else return binarySearch(arr,l , mid-1,target);
        }
        return -1;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] arr : matrix){
            if(arr[0] > target)break;
            int ind = binarySearch(arr,0,arr.length-1 , target);
            System.out.println(ind);
            if (ind != -1 ) return true;
        }

        return false;
    }
}