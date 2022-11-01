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
    public int deepestLeavesSum(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        int sum = 0;
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            sum = 0;
            for(int i = 0; i<size; i++){
                TreeNode current = q.poll();
                sum += current.val;
                if(current.left != null){
                    q.offer(current.left);
                }
                if(current.right != null){
                    q.offer(current.right);
                }
            }
        }
        return sum;
    }
}