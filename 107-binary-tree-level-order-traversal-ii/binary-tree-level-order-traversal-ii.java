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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        solve(ans, root);
        return ans;
    }

    static void solve(List<List<Integer>>ans , TreeNode root){
        //List<Integer> l= new ArrayList<>();
        Queue<TreeNode > que = new LinkedList<>();
        que.add(root);

        while(!que.isEmpty()){
            int sz= que.size();
            List<Integer> l= new ArrayList<>();

            for(int i=0; i<sz; i++){
                TreeNode curr=que.remove();
                l.add(curr.val);
                if(curr.left!= null) que.add(curr.left);
                if(curr.right!= null) que.add(curr.right);
            }
            ans.addFirst(l);
        }
    }
}