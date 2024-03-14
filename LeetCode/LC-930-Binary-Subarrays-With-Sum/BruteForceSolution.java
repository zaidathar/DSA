class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int res = 0 ;


        for(int i  =0 ; i < nums.length ; i++){
            int temp = nums[i] ; 
            res = temp == goal ? res +1 : res;
            for(int j = i+1 ; j < nums.length; j++){
                
                temp+=nums[j];
                res = temp == goal ? res +1 : res;
                if(temp > goal)break;

            }
        }

        return res;
    }
}
