class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        int maxLen = 0;

        int f = 0 , j =0;

        // [1] k = 1
        while(f <= j){
            if(j == nums.length)break;

            if(freq.getOrDefault(nums[j],0) >= k ){
                freq.put(nums[f],freq.get(nums[f])-1);
                f++;
                continue;
            }

            freq.put(nums[j],freq.getOrDefault(nums[j],0)+1);
            int currLen = j - f + 1;
            j++;

            maxLen = maxLen > currLen ? maxLen : currLen;

        }

        return maxLen;
    }
}
