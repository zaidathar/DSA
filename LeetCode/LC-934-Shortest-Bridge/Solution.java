class Solution {
    int size = 0;
    int[][] direction = {
            {0, 1},
            {1, 0},
            {0, -1},
            {-1, 0}
    };
    private void dfs(Set<Pair<Integer, Integer>> visited, int[][] grid, int r, int c) {
        if (isInvalid(r, c) || grid[r][c] == 0 || visited.contains(new Pair<>(r, c)))
            return;
        visited.add(new Pair<>(r, c));
        for (int[] dir : direction) {
            dfs(visited, grid, r + dir[0], c + dir[1]);
        }
    }

    public int shortestBridge(int[][] grid) {
        size = grid.length;

        Set<Pair<Integer, Integer>> visited = new HashSet<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    dfs(visited, grid, i, j);
                    return bfs(visited, grid);
                }
            }
        }

        return 0;
    }

    private int bfs(Set<Pair<Integer, Integer>> visited, int[][] grid) {
        int res = 0;
        Queue<Pair<Integer, Integer>> queue = new LinkedList<>(visited);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Pair<Integer, Integer> rC = queue.remove();
                int curR = rC.getKey();
                int curC = rC.getValue();
                for (int[] dir : direction) {
                    int newR = curR + dir[0], newC = curC + dir[1];
                    if (isInvalid(newR, newC) || visited.contains(new Pair<>(newR, newC)))
                        continue;
                    if (grid[newR][newC] == 1)
                        return res;
                    queue.add(new Pair<>(newR, newC));
                    visited.add(new Pair<>(newR, newC));
                }
            }
            res++;
        }
        return res;
    }

    

    private boolean isInvalid(int r, int c) {
        return r < 0 || c < 0 || r == size || c == size;
    }
}
