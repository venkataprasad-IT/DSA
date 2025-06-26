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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return solve(root, targetSum);
    }

    static boolean solve(TreeNode root, int target){
        if(root == null) return false;

        if(root.left == null && root.right== null){
            if(target == root.val) {
                return true;
            }else{
                return false;
            }
        }

        boolean lh= solve(root.left, target- root.val);
        boolean rh= solve(root.right, target-root.val);

        return lh||rh;


    }
}