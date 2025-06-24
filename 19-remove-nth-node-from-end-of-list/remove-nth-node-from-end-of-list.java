 class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode temp= head;
       int count= 1;
       while(temp.next!= null){
        temp= temp.next;
        count++;
       }

       temp= head;
       int j= count-n-1;
       if(n== count) {
        head = head.next;
        return head;
       }

       for(int i=1; i<=j; i++){
        temp= temp.next;
       }
       temp.next= temp.next.next;
       return head;
    }
}