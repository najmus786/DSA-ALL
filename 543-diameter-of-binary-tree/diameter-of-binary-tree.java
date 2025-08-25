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
class Info{
    int diam;
    int ht;
    Info(int diam,int ht){
        this.diam=diam;
        this.ht=ht;
    }
}
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        Info inf=diamOfTree(root);
        return inf.diam;
    }
    public Info diamOfTree(TreeNode root){
        if(root==null){
            return new Info(0,0);
        }
        Info lInfo=diamOfTree(root.left);
        Info rInfo=diamOfTree(root.right);
        int finalDiam=Math.max(lInfo.diam ,Math.max(rInfo.diam,lInfo.ht+rInfo.ht));
        int finalHt=Math.max(lInfo.ht,rInfo.ht)+1;
        return new Info(finalDiam,finalHt);
    }
}