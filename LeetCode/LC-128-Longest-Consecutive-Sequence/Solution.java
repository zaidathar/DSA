class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        int res = 0 ;
        Integer[] n = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        SortedSet<Integer> set = new TreeSet<Integer>(Arrays.asList(n));
        Iterator it = set.iterator();
        int prev = (int)it.next() , cnt = 1;
        while(it.hasNext()){
            int curr = (int)it.next();
            
            if( curr - prev == 1)cnt++;
            else{
                res = cnt > res ? cnt : res;
                cnt =1;
            }
            prev = curr ;
            
        }
         
        if(cnt > 0 )res = cnt > res ? cnt : res;
        return res;
    }
    
}