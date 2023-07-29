class Solution {
    class Graph{
        int V;
        private LinkedList<Integer> adj[];
        Graph(int v){
            V = v;
            adj = new LinkedList[v];
            for(int i = 0;i<v ;i++)
                adj[i] = new LinkedList();
        }

        void addEdge(int v, int u){
            adj[v].add(u);
            adj[u].add(v);
        }

        int provincesCount(){
            boolean[] visited = new boolean[V];
            LinkedList<Integer> queue = new LinkedList();
            int result = 0;
            for(int i = 0 ;i < V ; i++){
                if(!visited[i]){
                    result++;
                    BFS(i, visited, queue);
                }
            }

            return result;
        }

        void BFS(int source, boolean[] visited, LinkedList<Integer> queue){
            visited[source] = true;
            queue.add(source);
            int result = 0;
            while(queue.size() != 0){
                int s = queue.poll();
                for(int node : adj[s]){
                    if(!visited[node]){
                        visited[node]=true;
                        queue.add(node);
                    }
                }
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int len = isConnected.length;
        Graph graph = new Graph(len);

        for(int i=0 ;i< len; i++){
            for(int j = 0; j < len; j++){
                if(isConnected[i][j] == 1)
                    graph.addEdge(i,j);
            }
        }

        return graph.provincesCount();
        
    }
}
