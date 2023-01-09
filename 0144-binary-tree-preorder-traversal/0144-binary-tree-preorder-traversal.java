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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        ArrayList<Integer> list = new ArrayList<>();
        print(root, list);
        return list;
    }
    public static void print(TreeNode root, ArrayList<Integer> list){
        if(root==null){
            return;
        }
        list.add(root.val);
        print(root.left, list);
        print(root.right, list);
    }
}