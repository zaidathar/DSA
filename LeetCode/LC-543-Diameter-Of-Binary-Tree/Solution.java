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
    private int diameter;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
        findHeight(root);
        return diameter;
    }

    public int findHeight(TreeNode root){
        if(root == null)return 0;

        int leftH = findHeight(root.left);
        int rightH = findHeight(root.right);

        diameter = Math.max(diameter , leftH + rightH);

        return Math.max(leftH,rightH) + 1;
    }
}
