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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Deque<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        boolean reverse=false;
        while(!queue.isEmpty()){
            int levelSize=queue.size();
            List<Integer> currentLevel=new ArrayList<>(levelSize);
            for(int i=0;i<levelSize;i++){
                if(!reverse){
                    TreeNode CurrentNode=queue.pollFirst();
                    currentLevel.add(CurrentNode.val);
                    if(CurrentNode.left !=null){
                        queue.addLast(CurrentNode.left);
                    }
                    if(CurrentNode.right !=null){
                        queue.addLast(CurrentNode.right);
                    }
                }
                else{
                    TreeNode CurrentNode=queue.pollLast();
                    currentLevel.add(CurrentNode.val);
                    
                    if(CurrentNode.right !=null){
                        queue.addFirst(CurrentNode.right);
                    }
                    if(CurrentNode.left !=null){
                        queue.addFirst(CurrentNode.left);
                    }
                }
                
            }
            reverse = !reverse;
            result.add(currentLevel);
        }
        return result;
    }
}