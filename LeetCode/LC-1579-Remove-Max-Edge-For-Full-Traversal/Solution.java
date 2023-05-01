class Solution {
    public int maxNumEdgesToRemove(int n, int[][] edges) {
        Arrays.sort(edges, (a, b) -> Integer.compare(b[0], a[0]));
        
        DSU alice = new DSU(n + 1);
        DSU bob = new DSU(n + 1);
        int rEdge = 0, tEdge = 0;
        
        for(int[] e : edges) {
            if(e[0] == 3) {
                boolean vAlice = alice.union(e[1], e[2]);
                boolean vBob = bob.union(e[1], e[2]);
                
                if(vAlice) tEdge++;
                if(vBob) tEdge++;
                
                if(!vAlice || !vBob) rEdge++;
            } else if (e[0] == 1) {
                boolean vAlice = alice.union(e[1], e[2]);
                if(vAlice) 
                    tEdge++;
                else
                    rEdge++;
            } else {
                boolean vBob = bob.union(e[1], e[2]);
                if(vBob)  
                    tEdge++;   
                else
                    rEdge++;
            }
        }
        
        if(tEdge != 2 * n - 2) return -1;
                
        return rEdge;      
    }
}

class DSU {
    private int parent[];
    
    DSU(int n) {
        parent = new int[n];
        for(int i = 0; i < n; i++)
            parent[i] = i;
    }
    
    public int find(int x) {
        while(x != parent[x]) {
            parent[x] = parent[parent[x]];
            x = parent[x];
        }
        return x;
    }
    
    public boolean union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
            
        if(rootX == rootY) return false;
        
        parent[rootX] = rootY;
        return true;
    }
}