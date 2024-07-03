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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n=postorder.length;
        return rBuildTree(postorder,0,n-1,inorder,0,n-1);
    }
    private TreeNode rBuildTree(int[] postorder,int psi,int pei,int[] inorder,int isi,int iei){
        if(isi>iei){
            return null;
        }
        int idx=isi;
        while(inorder[idx] != postorder[pei]){
            idx++;
        }
        int colse=idx-isi;
        TreeNode node=new TreeNode(postorder[pei]);
        node.left=rBuildTree(postorder,psi,psi+colse-1,inorder,isi,idx-1);
        node.right=rBuildTree(postorder,psi+colse,pei-1,inorder,idx+1,iei);
        return node;
    }
}