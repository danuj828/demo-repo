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
    public boolean checkTree(TreeNode root) {
        
        if(root == null){
            return false;
        }
        
        int sum = 0, res = 0;
        int a = sum + root.left.val;
        int b = sum + root.right.val;
        
        res = a+b;
        if(res == root.val){
            return true;
        } else {
            return false;
        }
        
    }
}