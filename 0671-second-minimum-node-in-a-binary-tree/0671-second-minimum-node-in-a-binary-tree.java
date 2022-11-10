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
    public int findSecondMinimumValue(TreeNode root) {
        if(root.left == null) return -1;
        int left = -1;
        if(root.val != root.left.val){
            left = root.left.val;
        } else {
            left = findSecondMinimumValue(root.left);
        }
        int right = -1;
        if(root.val != root.right.val){
            right = root.right.val;
        } else {
            right = findSecondMinimumValue(root.right);
        }
        if(left == -1 || right == -1){
            return Math.max(left, right);
        } else {
            return Math.min(left, right);
        }
    }
}