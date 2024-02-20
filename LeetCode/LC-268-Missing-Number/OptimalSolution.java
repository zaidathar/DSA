class OptimalSolution {
    public int missingNumber(int[] nums) {
       int sum = 0 , i = 0;

       for(i = 0; i<nums.length;i++){
           sum = sum^i^nums[i];
       }

       return sum ^ i;
    }
}
