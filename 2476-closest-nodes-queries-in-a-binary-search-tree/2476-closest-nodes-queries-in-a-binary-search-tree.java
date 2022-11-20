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
    TreeMap<Integer, Integer> map = new TreeMap<>();
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        List<List<Integer>> list = new ArrayList<>();
        helper(root);
        Integer low = 0;
        Integer high = 0;
        
        for(int num: queries){
             low = map.containsKey(num) ? Integer.valueOf(num) : map.lowerKey(num);
            
             high = map.containsKey(num) ? Integer.valueOf(num) : map.higherKey(num);
            
            list.add(Arrays.asList(low == null ? -1 : low, high == null ? -1 : high));
        }
        return list;
    }
    public void helper(TreeNode root){
        if(root == null) return;
        map.put(root.val, 0);
        helper(root.left);
        helper(root.right);
    }
}