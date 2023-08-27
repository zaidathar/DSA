class Solution {

    public int[] productExceptSelf(int[] nums) {
       return approach2(nums); 

   }
    public int[] approach2(int[] nums) { // Beats 99.98% solution
        int len = nums.length;
        int[] left = new int[len];
        int[] right = new int[len];
        left[len-1] = right[0] = 1;
        int prod = 1;
        for(int i = 1; i < len ; i++){
            prod *= nums[i-1];
            right[i] = prod;
        }

        prod = 1; 

        for(int i = len-2; i >=0 ;i--){
            prod *= nums[i+1];
            left[i] = prod;
        }

        for(int i = 0; i<len; i++){
            nums[i] = left[i] * right[i];
        }
        
        return nums;
    }

    public int[] approach1(int[] nums) {
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
