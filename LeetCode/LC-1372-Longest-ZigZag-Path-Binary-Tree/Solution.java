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
    private int maxPath = 0;
    public void zigZagPath(TreeNode root,Character dir,int res){
        if(root == null)return;
        maxPath = Math.max(maxPath,res);
        zigZagPath(root.right , 'r' , dir == 'r' ? 1 : res+1);
        zigZagPath(root.left , 'l' , dir == 'l' ? 1 : res+1);
    }
    public int longestZigZag(TreeNode root) {
        if(root == null )return 0;

        zigZagPath(root,'r',0);
        zigZagPath(root,'l',0);

        return maxPath;
    }
}
