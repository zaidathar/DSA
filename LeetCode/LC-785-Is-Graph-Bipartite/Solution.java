class Solution {
    private boolean bfs(int node, int[][] graph, int[] vis) {
        if (vis[node] != 0)return true;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);

        vis[node] = -1;
        while (true) {
            if(queue.isEmpty())break;
            int currentNode = queue.remove();
            for (int n: graph[currentNode]) {
                if (vis[currentNode] == vis[n])return false;
                else if (vis[n] == 0) {
                    queue.add(n);
                    vis[n] = -vis[currentNode];
                }
            }   
        }

        return true;
    }

    public boolean isBipartite(int[][] graph) {
        int[] vis = new int[graph.length];
        for (int i = 0; i < graph.length; i++) 
            if (!bfs(i, graph, vis))
                return false;
        return true;
    }
    
}
