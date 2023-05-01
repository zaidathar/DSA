/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        return dfs(root, 0 , 1 ,new ArrayList<Integer>() ,new ArrayList<Integer>());
    }

    public int dfs(TreeNode root , int val , int ord , List<Integer> s , List<Integer> e){
        if(root == null )return 0;
        if(s.size() == val){
            s.add(ord);
            e.add(ord);
        }
        else e.set(val, ord);
        int cur = e.get(val) - s.get(val) + 1;
        int left = dfs(root.left, val + 1, 2*ord, s, e);
        int right = dfs(root.right, val + 1, 2*ord + 1, s, e);
        return Math.max(cur, Math.max(left, right));
    }
}
