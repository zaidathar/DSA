/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    Map<Integer , Node> track;
    private Node dfs(Node node , int val){
       if(node == null) return null;
       else if (track.containsKey(val))return track.get(val);
       else{
           Node res = new Node(val);
           track.put(val , res);
           for(Node n : node.neighbors){
               res.neighbors.add(dfs(n , n.val));
           }

           return res;
       }

    }
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        track = new HashMap();
        return dfs(node , node.val);
    }
}
