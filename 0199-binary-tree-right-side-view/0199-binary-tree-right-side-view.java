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
    public List<Integer> rightSideView(TreeNode root) {
        
        
        ArrayList<Integer> list = new ArrayList<>();
        rightview(root, list, 0);
        return list;
        
        // Queue<TreeNode> queue = new LinkedList<TreeNode>();
        // List<Integer> list = new ArrayList<>();
        // if(root==null) return list;
        // queue.offer(root);
        // TreeNode x;
        // while(!queue.isEmpty()){
        //     int level = queue.size();
        //     ArrayList<Integer> ans = new ArrayList<>();
        //     for(int i = 0; i<level; i++){
        //         if(queue.peek().left != null){
        //             queue.offer(queue.peek().left);
        //         }
        //         if(queue.peek().right != null){
        //             queue.offer(queue.peek().right);
        //         }
        //         ans.add(queue.poll().val);
        //     }
        //     list.add(ans); 
        // }
        // return list;
        
    }
    
    public static void rightview(TreeNode root, ArrayList<Integer> list, int depth){
        if(root == null) return;
        
        if(depth == list.size()){
            list.add(root.val);
        }
        
        rightview(root.right, list, depth + 1);
        rightview(root.left, list, depth + 1);
        
    }
    
}