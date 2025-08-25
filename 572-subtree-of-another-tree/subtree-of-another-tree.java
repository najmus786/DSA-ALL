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
    public void serialize(TreeNode root,StringBuilder sb){
        if(root==null){
            sb.append("# ");
            return ;
        }
        sb.append("(").append(root.val).append(") ");
        serialize(root.left,sb);
        serialize(root.right,sb);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        serialize(root,s1);
        serialize(subRoot,s2);
        return s1.toString().contains(s2.toString());
    }
}