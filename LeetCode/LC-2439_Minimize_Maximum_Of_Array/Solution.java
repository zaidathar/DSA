class Solution {
    public int solution(int[] arr)
    {
        double total = arr[0];
        int res =  arr[0];
        for(int i= 1 ;i<arr.length;i++){
            total += arr[i];
            res = (int)Math.max(res, Math.ceil(total/(i+1)));
        }
        
        return res;
    }
    public int minimizeArrayValue(int[] nums) {
        return solution(nums);
        
    }
}
