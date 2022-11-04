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
    public TreeNode increasingBST(TreeNode root) {
       return helper(root, null);
    }
    public TreeNode helper(TreeNode root, TreeNode leftNode){
        if(root == null) return leftNode;
        TreeNode ans = helper(root.left, root);
        root.left = null;
        root.right = helper(root.right, leftNode);
        return ans;
    }
}