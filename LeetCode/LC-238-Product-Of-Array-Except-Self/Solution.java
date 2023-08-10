class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] res = new int[size];
        // for prefix product
        res[0] = 1;
        for(int i = 1;i<size;i++){
            res[i]=nums[i-1]*res[i-1];
        }
        for(int i :res)System.out.print(i+" ");
        System.out.println();
        // for postfix product
        int post = 1;
        for(int i =size-1;i>=0;i--){
            res[i] *=post;
            post*=nums[i];
        }
        return res;
    }
}