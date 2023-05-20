class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map< String, List< Pair<String,Double> > > adj = new HashMap<>();

        for (int i = 0; i < equations.size(); i++) {
            String a = equations.get(i).get(0);
            String b = equations.get(i).get(1);

            List<Pair<String, Double>> list = adj.getOrDefault(a, new ArrayList<>());
            list.add(new Pair(b, values[i]));
            adj.put(a, list);

            list = adj.getOrDefault(b, new ArrayList<>());
            list.add(new Pair(a, 1d/values[i]));
            adj.put(b, list);
        }

        double[] res = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            List<String> q = queries.get(i);
            res[i] = bfs(q.get(0), q.get(1), adj);
        }

        return res;
    }

    private double bfs(String src, String dst, Map< String, List< Pair<String,Double> > > adj) {
        if (!adj.containsKey(src) || !adj.containsKey(dst))
            return -1;

        Set<String> visited = new HashSet<>();
        Queue<Pair<String, Double>> queue = new LinkedList<>();
        queue.add(new Pair(src, 1d));

        while (!queue.isEmpty()) {
            Pair<String, Double> node = queue.remove();
            visited.add(node.getKey());
            if (node.getKey().equals(dst)) 
                return node.getValue();
            for (Pair<String, Double> child: adj.getOrDefault(node.getKey(), new ArrayList<>())) {
                if (visited.contains(child.getKey()))
                    continue;
                queue.add(new Pair<String , Double>(child.getKey(), node.getValue() * child.getValue()));
            }
        }
        
        return -1;
    }
}
