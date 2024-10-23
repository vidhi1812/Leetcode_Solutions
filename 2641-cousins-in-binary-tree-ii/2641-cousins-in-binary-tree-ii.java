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
    class MTreeNode{
        long sibSum = 0l;
        TreeNode node = null;
        public MTreeNode(long sibSum, TreeNode node){
            this.sibSum = sibSum;
            this.node = node;
        }
    }
    public TreeNode replaceValueInTree(TreeNode root) {
        HashMap<Integer, Long> depthSumMp = new HashMap<>();

        Deque<MTreeNode> lvlQ = new ArrayDeque<>();

        lvlQ.offer(new MTreeNode(root.val, root));

        int currLvl = 0;

        depthSumMp.put(currLvl, root.val * 1l);

        while(!lvlQ.isEmpty()){
            int lvlSize = lvlQ.size();

            long nextLvlSum = 0l;

            while(lvlSize-->0){
              long sibSum = 0l;  

              MTreeNode currMNode = lvlQ.poll();

              TreeNode currNode = currMNode.node;

              if(currNode.left != null)sibSum += currNode.left.val;

              if(currNode.right != null)sibSum += currNode.right.val;

              if(currNode.left != null){
                nextLvlSum += currNode.left.val;
                lvlQ.offer(new MTreeNode(sibSum ,currNode.left));
              }

              if(currNode.right != null){
                nextLvlSum += currNode.right.val;
                lvlQ.offer(new MTreeNode(sibSum, currNode.right));
              }

              currNode.val = (int)(depthSumMp.get(currLvl) - currMNode.sibSum);
            }

            depthSumMp.put(++currLvl, nextLvlSum);
        }
        return root;
    }
}