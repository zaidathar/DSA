class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        Map<Integer , List<Integer> > mp = new HashMap();

        for(List<Integer> ls : edges){
            Integer key = ls.get(1);
            Integer value = ls.get(0);
            List<Integer> values = mp.get(key);
            List<Integer> valueMapValue = mp.get(value);
            if(values == null){
                values = new ArrayList<>();
                values.add(value);
                mp.put(key,values);
                
            }
            else{
                values.add(value);
            }

            if(valueMapValue == null){
                mp.put(value,new ArrayList<>());
            }

            
            
        }

        List<Integer> res = new ArrayList<>();

        for(Map.Entry<Integer , List<Integer>> me : mp.entrySet()){
            
            Integer key = me.getKey();
            List<Integer> values = me.getValue();
            // System.out.println(key +" --> "+values);
            if(values.size() == 0)res.add(key);
        }

        return res;
    }
}
