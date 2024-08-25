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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> output= new ArrayList<>();
         traverse(root, output);
        return output;
    }
    
    public void traverse(TreeNode root, List<Integer> output){
        if(root != null){
            traverse(root.left,output);
            traverse(root.right,output);
        
        
            output.add(root.val);
        }  
    }
    
}