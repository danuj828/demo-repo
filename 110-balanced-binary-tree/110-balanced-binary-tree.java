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
   boolean isBal = true;
    public boolean isBalanced(TreeNode root) {
        // boolean isBal = true;
        height(root);
        return isBal;
    }
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        
        int gap = Math.abs(left - right);
        if(gap > 1){
            isBal = false;
        }
       int pew = Math.max(left, right) + 1;
       return pew;
    }
}