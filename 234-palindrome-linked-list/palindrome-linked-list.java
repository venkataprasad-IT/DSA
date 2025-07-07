/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 import java.util.*;
class Solution {
    public boolean isPalindrome(ListNode head) {
      //  if(st.size() == 1) return true;
        ListNode slow = head;
        ListNode fst = head;    
        Stack<Integer> st= new Stack<>();

        while(fst!= null && fst.next!= null){
            st.push(slow.val);
            slow = slow.next;
            fst = fst.next.next;
        }

        if(fst!= null) {
            slow = slow .next;
        } 

        while(slow!= null){
            if(slow.val != st.pop()){
                return false;
            }
          //  st.pop();
            slow= slow.next;
        }

        return true;
    }
}