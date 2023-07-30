class Solution {
    public int removeDuplicates(int[] nums) {
        //Better approach with space O(1)
        int i =0 ;
        
        for(int num : nums){
            if(i==0 || num > nums[i-1] ){
                nums[i++]=num;
            }
        }
        return i;
        
        /* Space complexity is O(n)
        int[] res = new int[nums.length];
        res[0]=nums[0];
        int cnt = 1 , j =1;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                res[j]=nums[i];
                cnt++;
                j++;
            }
        }
        for(int i = 0 ; i<cnt;i++)nums[i]=res[i];
        return cnt;
        
        */
        
    }
    
}
