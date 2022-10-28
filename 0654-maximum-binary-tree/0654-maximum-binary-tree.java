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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return tree(nums, 0, nums.length-1);
    }
    
    public TreeNode tree(int[] nums, int low, int high){
        if(low > high){
            return null;
        }
        int max = low;
        for(int i = low+1; i<=high; i++){
            if(nums[max] < nums[i]){
                max = i;
            }
        }
        TreeNode root = new TreeNode(nums[max]);
        root.left = tree(nums, low, max-1);
        root.right = tree(nums, max+1, high);
        return root;
    }
}