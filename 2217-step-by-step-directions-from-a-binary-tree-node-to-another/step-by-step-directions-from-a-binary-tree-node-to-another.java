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
    public boolean check(TreeNode root,int value, StringBuilder s){
        if(root == null)
            return false;
        if(root.val == value)
            return true;
        if(root.left != null && check(root.left,value,s))
            s.append("L");
        else if(root.right != null && check(root.right,value,s))
            s.append("R");
        return s.length() > 0;
        
    }
    public String getDirections(TreeNode root, int startValue, int destValue) {
        StringBuilder s = new StringBuilder();
        StringBuilder f = new StringBuilder();
        check(root,startValue,s);
        check(root,destValue,f);
         int i = 0;
        int max_i = Math.min(f.length(), s.length());
        while (i < max_i && s.charAt(s.length() - i - 1) == f.charAt(f.length() - i - 1))
            ++i;
        return "U".repeat(s.length() - i) + f.reverse().toString().substring(i);
    }
}