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
    public void inorder(TreeNode root,ArrayList<Integer> Inorderlist){
        if(root==null) return;
        inorder(root.left,Inorderlist);
        Inorderlist.add(root.val);
        inorder(root.right,Inorderlist);
    }
    public TreeNode constructTree(ArrayList<Integer> Inorderlist,int start,int end){
        if(start>end) return null;
        int mid=start+(end-start)/2;
        TreeNode root=new TreeNode(Inorderlist.get(mid));
        root.left=constructTree(Inorderlist,start,mid-1);
        root.right=constructTree(Inorderlist,mid+1,end);
        return root;

    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> Inorderlist=new ArrayList<>();
        inorder(root,Inorderlist);
        return constructTree(Inorderlist,0,Inorderlist.size()-1);

    }
}