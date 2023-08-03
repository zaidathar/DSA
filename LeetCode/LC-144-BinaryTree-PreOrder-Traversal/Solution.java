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
    public void preOrderRec(TreeNode root,List<Integer> preOrder){
        if(root == null)return;
        preOrder.add(root.val);
        preOrderRec(root.left,preOrder);
        preOrderRec(root.right,preOrder);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preOrder= new ArrayList<>();
        preOrderRec(root,preOrder);
        return preOrder;
    }
    
}