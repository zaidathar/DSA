class Solution {
    public int maxSubArray(int[] nums) {
        int len  = nums.length;
        int maxSum = 0;
        for(int i = 0 ; i < len ; i++){
            int sum = nums[i];
            maxSum = Math.max(maxSum,sum);
            for(int j = i+1 ; j < len ; j++){
                sum+=nums[j];
                maxSum = Math.max(maxSum,sum);
            }
        }

        return maxSum;
    }
}
