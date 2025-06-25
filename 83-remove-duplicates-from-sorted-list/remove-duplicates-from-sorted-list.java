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
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
       if(head == null) return head;

       ListNode temp= head;
       ListNode temp2;

       while(temp!= null){
        temp2=temp.next;
        while(temp2!= null && temp.val== temp2.val){
            temp2= temp2.next;
        }

        temp.next= temp2;
        temp= temp2;
       }

       return head;
    }
}