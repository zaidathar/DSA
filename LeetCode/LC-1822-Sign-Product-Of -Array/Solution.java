class Solution {
    
    // If we store product of array might exceed memory
    // If any number in array is 0 then product will be 0
    // Better to count negative number if count is even then product will positive

    public int arraySign(int[] nums) {
        int negativeCounter = 0;
        for(int n : nums){
            if (n==0)return 0;
            else if (n < 0){
                negativeCounter++;
            }
        }
        
        return negativeCounter % 2 != 0 ? -1 : 1;
    }
}