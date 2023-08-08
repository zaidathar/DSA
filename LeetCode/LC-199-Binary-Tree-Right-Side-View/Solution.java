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
    public  List<Integer> ls;
    public void rightSide(TreeNode node,int depth){
        if(node==null)return;
        if(ls.size()==depth)ls.add(node.val);
        rightSide(node.right,depth+1);
        rightSide(node.left,depth+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        ls = new ArrayList<Integer>();
        rightSide(root,0);
        return ls;
    }
}