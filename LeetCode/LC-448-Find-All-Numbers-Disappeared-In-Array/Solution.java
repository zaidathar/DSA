class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] arr = new int[nums.length+1];
        
        for(int i : nums){
            arr[i]++;
        }
      
        List<Integer> ls = new ArrayList<>();
        for(int i =1 ;i < arr.length;i++){
            if(arr[i]==0)ls.add(i);
        }
        return ls;
    }
}
