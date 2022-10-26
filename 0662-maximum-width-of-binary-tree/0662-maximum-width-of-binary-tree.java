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
    public int widthOfBinaryTree(TreeNode root) {
        
        int width = 1;
        Queue<TreeNode> q = new LinkedList<>();
        root.val = 0;
        q.offer(root);
        
        while(!q.isEmpty()){
        
        int size = q.size();
        int start = q.peek().val;
        int end = 0;
        
        for(int i = 0; i<size; i++){
            TreeNode node = q.poll();
            
            if(node.left != null){
                node.left.val = (node.val * 2);
                q.offer(node.left);
            }
            if(node.right != null){
                node.right.val = (node.val * 2)+1;
                q.offer(node.right);
            }
            if(i == size-1){
                end = node.val;
            }
        }
        width = Math.max(width, end - start + 1);
        }
        return width;
    }
}