class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int ind = len%2==0 ? len/2-1 : len/2;
        int res = 0;
        for(int num : nums){
            res+=Math.abs(nums[ind]-num);
        }
        return res;
    }
}
