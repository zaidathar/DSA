class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar = Integer.MIN_VALUE , maxTillHere = 0;
        
        for(int i : nums){
            maxTillHere +=i;
            if(maxSoFar < maxTillHere )maxSoFar = maxTillHere;
            if(maxTillHere < 0)maxTillHere = 0;
        }
        return maxSoFar;
    }
}