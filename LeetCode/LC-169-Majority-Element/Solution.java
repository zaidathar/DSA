class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int cnt = 1 , res = -1 , len =nums.length ;
        
        for(int i=1;i<len;i++){
            if(nums[i-1]==nums[i])cnt++;
            else{
                if(cnt > Math.ceil(len/2)){
                    res = nums[i-1];
                    cnt=1;
                    break;
                }
                cnt=1;
            }
        }
        if(cnt >  Math.ceil(len/2)){
            res = nums[len-1];
        }
        return res;
    }
}