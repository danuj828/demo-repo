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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
    //    Stack<TreeNode> s1 = new Stack<>();
    //    Stack<TreeNode> s2 = new Stack<>();
    //     s1.push(root1);
    //     s2.push(root2);
    //     while(!s1.isEmpty() && !s2.isEmpty()){
    //         if(helper(s1) != helper(s2)){
    //             return false;
    //         }
    //     }
    //     return s1.isEmpty() && s2.isEmpty();
    // }
    // public int helper(Stack<TreeNode> s){
    //     while(true){
    //         TreeNode node = s.pop();
    //         if(node.left != null){
    //             s.push(node.left);
    //         }
    //         if(node.right != null){
    //             s.push(node.right);
    //         }
    //         if(node.left == null && node.right == null){
    //             return node.val;
    //         }
    //     }
        
        return helper(root1).equals(helper(root2));
    }
    public String helper(TreeNode root){
        if(root == null){
            return "";
        }
        if(root.left == null && root.right == null){
            return root.val+"-";
        }
        return helper(root.left) + helper(root.right);
    }
}