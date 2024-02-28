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
    int res = 0 , h = 0;
    public int findBottomLeftValue(TreeNode root) {
        findBottomLeftVal(root,1);
        return res;   
    }
    public void findBottomLeftVal(TreeNode root, int depth){
        if(h < depth){
            res = root.val;
            h = depth;
        }

        if(root.left != null)
            findBottomLeftVal(root.left,depth+1);
        if(root.right != null)
            findBottomLeftVal(root.right , depth+1);
    }
}
