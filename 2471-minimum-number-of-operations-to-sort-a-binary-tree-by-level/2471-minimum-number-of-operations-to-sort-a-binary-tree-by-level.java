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
    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        int count = 0;
        
        while(!q.isEmpty()){
            int size = q.size();
            int[] arr1 = new int[size];
            int[] arr2 = new int[size];
            Map<Integer, Integer> map = new HashMap<>();
            int index = 0;
            for(int i = 0; i<size; i++){
                TreeNode node = q.poll();
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
                
                arr1[index] = node.val;
                arr2[index] = node.val;
                map.put(node.val, index);
                index++;
            }
            Arrays.sort(arr2);
            for(int i =0; i<size; i++){
                if(arr1[i] == arr2[i]){
                    continue;
                }
                int var = map.get(arr2[i]);
                int temp = arr1[i];
                arr1[i] = arr1[var];
                arr1[var] = temp;
                map.put(temp, var);
                count++;
            }
        }
        return count;
    }
}