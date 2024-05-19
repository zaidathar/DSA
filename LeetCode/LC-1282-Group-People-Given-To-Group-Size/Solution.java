class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int n  = groupSizes.length;

        Map<Integer, List<List<Integer>>> map = new HashMap();

        for(int i = 0; i < n ; i++){
            int groupCnt = groupSizes[i];
            if(map.containsKey(groupCnt)){
                List<List<Integer>> groups = map.get(groupCnt);
                List<Integer> lastList = groups.get(groups.size()-1);
                if(lastList.size() < groupCnt){
                    lastList.add(i);
                }
                else{
                    List<Integer> newList = new ArrayList();
                    newList.add(i);
                    groups.add(newList);
                }
            }
            else{
                List<List<Integer>> groups = new ArrayList();
                List<Integer> newList = new ArrayList();
                newList.add(i);
                groups.add(newList);
                map.put(groupCnt , groups);
            }
        } 

        List<List<Integer>> res = new ArrayList();

        map.entrySet().forEach(entry -> {
            List<List<Integer>> groups = entry.getValue();
            groups.forEach(group -> {
                res.add(group);
            });
        });

        return res;
    }
}
