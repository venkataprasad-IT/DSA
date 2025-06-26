 
class Solution {
    public int maxDepth(TreeNode root) {
        return solve(root);
    }


    static int solve(TreeNode root){
        if(root == null) return 0;

        int ld= solve(root.left);
        int rd= solve(root.right);
        return Math.max(ld, rd)+1;
    }
}