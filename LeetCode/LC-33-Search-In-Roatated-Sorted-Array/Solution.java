class Solution {
    public int search(int[] nums, int target) {
        int index = -1;

        int l = 0 , r = nums.length -1 ;

        while(l <= r){
            int mid = ( l + r )/2;

            if(nums[mid] == target ){
                index = mid;
                break;
            }


            if(  nums[l]  <= nums[mid]){
                if (target > nums[mid] | target < nums[l]){
                    l = mid + 1;
                }
                else{
                    r = mid - 1;
                }
            }
            else{
                if(target < nums[mid] | target > nums[r]){
                    r = mid - 1;
                }
                else{
                    l = mid + 1;
                }
            }
        }

        return index;
    }
}
