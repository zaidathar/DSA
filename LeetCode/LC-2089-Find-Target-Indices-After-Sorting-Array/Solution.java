class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> ls = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==target)ls.add(i);
        }
        return ls;
    }
}