class Solution {
 
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer ,List<Integer>> mp = new HashMap<Integer,List<Integer>>();
        
        for(int i = 0;i < nums.length ; i++ ){
            List<Integer> ls = mp.get(nums[i]);
            if(ls==null){
                mp.put(nums[i],new ArrayList<Integer>(Arrays.asList(i)));
            }
            else{
                ls.add(i);
                mp.put(nums[i],ls);
            }
        }
        
        for(Map.Entry e : mp.entrySet()){
            List<Integer> ls = (List)e.getValue();
           
            for(int i = 1;i<ls.size();i++){
                if(Math.abs(ls.get(i)-ls.get(i-1)) <= k)return true;
            }
        }
        
        return false;
    }
}