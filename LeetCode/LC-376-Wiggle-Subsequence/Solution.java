class Solution {
    public int wiggleMaxLength(int[] nums) {
        int len = nums.length;
        if(len == 0 )return 0;
        
        int[] f = new int[len];
        int[] b = new int[len];
        
        f[0]=b[0]=1;
        
        for(int i = 1; i< len ; i++){
            f[i] = nums[i] > nums[i-1] ? b[i-1]+1 : f[i-1];
            b[i] = nums[i] < nums[i-1] ? f[i-1]+1 : b[i-1];
        }
        
        return Math.max(f[len-1] , b[len-1]);
    }
}
