class Solution {
    public boolean canTraverseAllPairs(int[] nums) {
        int len = nums.length;
        UnionFind uf = new UnionFind(len);

        Map<Integer, Integer> factorInd = new HashMap<>();

        for(int i = 0 ; i< len ; i++){
            int n = nums[i];
            int f = 2;

            while(f * f <= n){
                if(n%f ==0 ){
                    if(factorInd.containsKey(f)){
                        uf.union(i,factorInd.get(f));
                    }
                    else{
                        factorInd.put(f,i);
                    }

                    while(n%f == 0){
                        n/=f;
                    }
                }
                f++;
            }

            if(n > 1){
                if(factorInd.containsKey(n)){
                    uf.union(i,factorInd.get(n));
                }
                else{
                    factorInd.put(n,i);
                }
            }
        }

        return uf.cnt == 1;
        
    }

    private static class UnionFind{
        private int[] parent,rank;
        public int cnt;
        public UnionFind(int n){
            parent = new int[n];
            rank = new int[n];
            cnt = n;

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

            this.cnt--;
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
