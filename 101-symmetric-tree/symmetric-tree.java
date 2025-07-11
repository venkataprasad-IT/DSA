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
    public boolean isSymmetric(TreeNode root) {
         return solve(root.left, root.right);
    }

    static boolean solve(TreeNode p,TreeNode q){
        if(p == null && q== null) return true;

        if( p!= null && q== null || q!= null && p== null || p.val!= q.val) {
            return false;
        }

        return solve(p.left, q.right)&& solve(p.right, q.left);
    }
}