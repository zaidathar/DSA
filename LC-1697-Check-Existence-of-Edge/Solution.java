class Solution {
    private int[] parent;
    private int[] size;
    private int[] weight;
    public boolean[] distanceLimitedPathsExist(int length, int[][] adjList, int[][] queries) {
    
        parent = new int[length];
        size = new int[length];
        weight = new int[length];
        for (int i = 0; i < length ; i++) {
            parent[i] = i;
            size[i] = 1;
        }

        Arrays.sort(adjList, Comparator.comparingInt(a -> a[2]));
        for (int[] edge : adjList) unionBySize(edge[0], edge[1], edge[2]);

        // Initialize answer array
        boolean[] answer = new boolean[queries.length];
        for (int i = 0 ; i < queries.length; i++)
            answer[i] = connected(queries[i][0], queries[i][1], queries[i][2]);

        return answer;
    }

    public boolean connected(int p, int q, int limit) {
        return find(p, limit) == find(q, limit);
    }

    private int find (int x, int limit) {
        while (x != parent[x]) {
            if (weight[x] >= limit) {
                break;
            }
            x = parent[x];
        }
        return x;
    }

    private void unionBySize (int x, int y, int limit) {
        int x_ref = find (x, Integer.MAX_VALUE);
        int y_ref = find (y, Integer.MAX_VALUE);
        if (x_ref != y_ref) {
        if (size[x_ref] < size[y_ref]) {
            parent[x_ref] = y_ref;
            weight [x_ref] = limit;
            size[y_ref] += size[x_ref];
        } else {
            parent[y_ref] = x_ref;
            weight[y_ref] = limit;
            size[x_ref] += size[y_ref];
          }
        }
    }
}