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
        List<Double> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSize=queue.size();
            double averageLevel=0;
            for(int i=0;i<levelSize;i++){
                TreeNode CurrentNode=queue.poll();
                averageLevel+=CurrentNode.val;
                if(CurrentNode.left !=null){
                    queue.offer(CurrentNode.left);
                }
                if(CurrentNode.right !=null){
                    queue.offer(CurrentNode.right);
                }
            }
            averageLevel=averageLevel/levelSize;
            result.add(averageLevel);
        }
        return result;
    }
}