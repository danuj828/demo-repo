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
    public List<Double> averageOfLevels(TreeNode root) {
        
        
        ArrayList<Double> list = new ArrayList<>();
        if(root == null) return list;
        
         Queue<TreeNode> q = new LinkedList<TreeNode>();
        
        q.add(root);
        while(!q.isEmpty()){
            double sum  = 0;
            int size = q.size();
            int index = 0;
            while(index < size){
                TreeNode node = q.remove();
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
                sum += node.val;
                index++;
            }
            list.add(sum/size);
        }
        return list;
    }
}
