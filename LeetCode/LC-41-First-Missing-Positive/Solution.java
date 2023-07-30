class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int posNum = 1 , prev = Integer.MIN_VALUE;
        for(int i:nums){
            if(i < 1)continue;
            if(i == prev)continue;
            if(i==posNum){
                posNum++;
                prev = i;
            }
            else break;
        }
        
        return posNum;
    }
}
