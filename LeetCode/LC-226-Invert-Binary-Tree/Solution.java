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
    public TreeNode invert(TreeNode root){
        
        if(root == null)return null;
        
        final TreeNode left = root.left, right = root.right;
        root.left = invert(right);
        root.right = invert(left);
        
        return root;
    }
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
        
    }
}