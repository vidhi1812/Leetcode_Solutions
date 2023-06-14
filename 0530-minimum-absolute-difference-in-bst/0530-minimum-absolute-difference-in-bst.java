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
    
    int prev=-100000, minimum=Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        if(root == null)
            return minimum;
        
        getMinimumDifference(root.left);
        minimum=Math.min(minimum,root.val-prev);
    
        prev=root.val;
        getMinimumDifference(root.right);
        
        return minimum;
    }
}


 