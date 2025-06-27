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
 import java.util.*;
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans= new ArrayList<>();
        if(root == null) return ans;
        solve(root, ans);
        return ans;
    }

    static void solve(TreeNode root, List<List<Integer>>ans){
        Queue<TreeNode>que  = new LinkedList<>();
        que.add(root);

        while(!que.isEmpty()){
            List<Integer> Lis= new ArrayList<>();
            int siz= que.size();
            for(int i=0; i< siz; i++){
                TreeNode curr= que.poll();
                Lis.add(curr.val);
                if(curr.left!= null) que.add(curr.left);
                if(curr.right!= null) que.add(curr.right);
            }
            ans.add(Lis);
        }
    }
}