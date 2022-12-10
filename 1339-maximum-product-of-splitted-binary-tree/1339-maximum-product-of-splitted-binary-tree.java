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
    long totalSum = 0, ans = 0;
    public int maxProduct(TreeNode root) {
        totalSum = helper(root);
        helper(root);
        return (int)(ans % (1e9 + 7));
    }
    public int helper(TreeNode root){
        if(root == null){
            return 0;
        }
        int sum = root.val + helper(root.left) + helper(root.right);
        ans = Math.max(ans, sum*(totalSum - sum));
        return sum;
    }
}