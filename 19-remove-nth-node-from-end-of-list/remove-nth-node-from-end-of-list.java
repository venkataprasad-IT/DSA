 class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;

        int l=0;
        ListNode temp= head;
        while(temp!= null){
            temp= temp.next;
            l++;
        }
        int j= l- n-1;

        if(n>= l) return head= head.next;

        else{
            temp= head;
            for(int i=1; i<=j; i++){
                temp= temp.next;
            }
            temp.next= temp.next.next;
            return head;
        }
    }
}