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
    public int maxD = 0;
    public void depth(TreeNode root,int cnt){
        if(root == null)return;
        cnt++;
        maxD = maxD<cnt ? cnt : maxD;
        
        depth(root.left,cnt);
        depth(root.right,cnt);
    }
    public int maxDepth(TreeNode root) {
        depth(root,0);
        return maxD;
    }
}