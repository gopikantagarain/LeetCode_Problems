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
        String res = "";
        int i = 0;
        while(i==0 && i<f.length() && i<s.length() && s.charAt(s.length()-1-i) == f.charAt(f.length()-1-i)){
                s.deleteCharAt(s.length()-1-i);
                f.deleteCharAt(f.length()-1-i); 
        }   
        for(int j = 0; j < s.length(); j++)
            res += "U";
        for(int j = f.length()-1; j >= 0; j--){
            res += f.charAt(j);
        }
        return res;
    }
}