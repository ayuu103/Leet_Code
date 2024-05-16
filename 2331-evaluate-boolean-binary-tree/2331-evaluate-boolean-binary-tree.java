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
    public boolean tree(TreeNode root){
        if (root==null){
            return true;
        }
        else if(root.val==0){
            return false;
        }
        else if(root.val==1){
            return true;
        }
        else if(root.val==2){
            return tree(root.left) || tree(root.right); 
        }
        else {
            return tree(root.left) && tree(root.right); 
        }

    }

    public boolean evaluateTree(TreeNode root) {
        return tree(root);
    }
}