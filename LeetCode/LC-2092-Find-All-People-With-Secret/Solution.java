class Solution {
    public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {
        Map<Integer, List<Integer>> timeMap = new TreeMap<>();

        int mLen = meetings.length;

        for(int i = 0 ;i < mLen; i++){
            int time = meetings[i][2];
            timeMap.putIfAbsent(time, new ArrayList<>());
            timeMap.get(time).add(i);
        }

        UnionFind uf =new UnionFind(n);

        uf.union(0,firstPerson);

        for(int time : timeMap.keySet()){
            Set<Integer> pool = new HashSet();

            for(int mid : timeMap.get(time)){

                int[] meeting = meetings[mid];
              
                uf.union(meeting[0],meeting[1]);
                pool.add(meeting[0]);
                pool.add(meeting[1]);
            }

            for(int i : pool){
                if(!uf.connected(0,i)){
                    uf.reset(i);
                }
            }
        }

        List<Integer> res = new ArrayList<>();

        for(int i = 0; i< n ;i++){
            if(uf.connected(i,0))
                res.add(i);
        }

        return res;
    }


    private static class UnionFind{
        private int[] parent,rank;

        public UnionFind(int n){
            parent = new int[n];
            rank = new int[n];

            for(int i = 0; i<n;i++){
                parent[i]=i;
            }
        }

        public void union(int u , int v){
            int ultimatParentU = find(u);
            int ultimatParentV = find(v);
            if(ultimatParentU == ultimatParentV)
                return;

            if(rank[ultimatParentU] < rank[ultimatParentV]){
                parent[ultimatParentU] = ultimatParentV;
            }

            else{
                parent[ultimatParentV] = ultimatParentU;
                rank[ultimatParentU]++;
            }

        }

        public int find(int u){

            while(parent[u] != u){
                u = parent[parent[u]];
            }

            return u;
        }

        public boolean connected(int u, int v){
            
            return find(u) == find(v);
        }

        public void reset(int u){
            parent[u] = u;
            rank[u] = 0;
        }
    }
    
}
