class Solution {
    public int findDuplicate(int[] nums) {
        int[] track = new int[nums.length + 1];
        int res = nums[0];
        for(int i = 0 ; i < nums.length ; i++){
            if(track[nums[i]] > 0){
                res = nums[i];
                break;
            }
            track[nums[i]]++;
        }

        return res;
    }
}
