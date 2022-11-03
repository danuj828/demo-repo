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
    public int sumEvenGrandparent(TreeNode root) {
        return getSum(root, null, null);
    }
    public int getSum(TreeNode curr, TreeNode parent, TreeNode gp){
        int sum = 0;
        
//         Base case.
        if(curr == null){
            return 0;
        }
        if(gp != null && gp.val % 2 == 0){
            sum += curr.val;
        }
        sum += getSum(curr.left, curr, parent);
        sum += getSum(curr.right, curr, parent);
        return sum;
    }
}