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
    int m=0,pew=0;
    public int diameterOfBinaryTree(TreeNode root) {
        
        //int max = Integer.MIN_VALUE;
        height(root);
        return m;
        
    }
    public  int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        pew=left + right;
         m = Math.max(m,pew);
        return 1 + Math.max(left, right);
    }
}