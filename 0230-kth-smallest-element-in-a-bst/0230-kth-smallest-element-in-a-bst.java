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
    static int number = 0;
    static int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        count = k;
        helper(root);
        return number;
    }
    public void helper(TreeNode root){
        if(root.left != null){
            helper(root.left);
        }
        count--;
        if(count == 0){
            number = root.val;
            return;
        }
        if(root.right != null){
            helper(root.right);
        }
    }
}