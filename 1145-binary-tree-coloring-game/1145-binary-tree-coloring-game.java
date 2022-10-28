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
    int leftchild;
    int rightchild;
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        leftchild = 0;
        rightchild = 0;
        count(root, x);
        int parentchild = n - (leftchild + rightchild + 1);
        int max = Math.max(parentchild, Math.max(leftchild, rightchild));
        return max > (n/2);
    }
    public int count(TreeNode root, int x){
        if(root == null){
            return 0;
        }
        int left = count(root.left, x);
        int right = count(root.right, x);
        if(root.val == x){
            leftchild = left;
            rightchild = right;
        } 
        return left + right + 1;
    }
}