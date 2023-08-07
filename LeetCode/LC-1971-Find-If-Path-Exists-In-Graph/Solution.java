class Solution {
    public ArrayList<Integer> adj[];
    public boolean[] vis;
    public void addEdge(int  u , int v){
        if(adj[u] ==null){
            adj[u] = new ArrayList<Integer>();
        }
        adj[u].add(v);
        if(adj[v] ==null){
            adj[v] = new ArrayList<Integer>();
        }
        adj[v].add(u);
    }
    
    public boolean isPathExist(int s , int d){
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(s);
        while(queue.size()!=0){
            s = queue.poll();
            ArrayList<Integer> ed = adj[s];
            
            for(Integer e: ed){
                if(e==d)return true;
                if(!vis[e]){
                    vis[e]=true;
                    queue.add(e);
                }
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(edges.length == 0)return true;
        adj = new ArrayList[n];
        for(int[] pair : edges){
            addEdge(pair[0],pair[1]);
        }
        vis = new boolean[n];
        
        return isPathExist(source,destination);
        
        
    }
}