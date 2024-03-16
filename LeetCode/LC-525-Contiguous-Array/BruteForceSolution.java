class Solution {
    public int findMaxLength(int[] nums) {
       
        int max = 0 ;
        for( int i = 0 ; i < nums.length ; i++){
            
            int zCnt = nums[i] == 0 ? 1 : 0 ;
            int oCnt = nums[i] == 1 ? 1 : 0 ;
            for(int j = i+1; j < nums.length ; j++){
                if(nums[j]==0)zCnt++;
                else oCnt++;

                if(zCnt == oCnt){
                    max = Math.max(max , (j - i +1));
                }
            }
        }

        return max;
    }
}
