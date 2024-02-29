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
    public int MAX = Integer.MAX_VALUE;
    public int MIN = Integer.MIN_VALUE;

    public static boolean isEven(int val){
        return val % 2 == 0;
    }

    public boolean isEvenOddTree(TreeNode root) {
        if(root == null)return true;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int level = 0;

        while(!q.isEmpty()){
            int size = q.size();
            int val = isEven(level) ? MIN : MAX;

            for(int i = 0; i < size ;i++){
                
                TreeNode node = q.poll();

                if(isEven(level)){
                 if(isEven(node.val) || node.val <= val)
                    return false;
                }
                else {
                    if(!isEven(node.val) || node.val >= val)
                    return false;
                }
                
                val = node.val;
                if(node.left != null)
                    q.offer(node.left);
                if(node.right != null)
                    q.offer(node.right);
                
            }
            level++;

        }

        return true;
    }
}
