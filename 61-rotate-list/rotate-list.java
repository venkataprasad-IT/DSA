 
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp= head;
        int count= 1; 
        if(head == null ) return head;
        while(temp.next!= null){
            temp= temp.next;
            count++;
        }
        temp.next= head;

        k= k% count;
        if(k== count) return head;

        int j= count-k-1;
      //  temp= head;
      ListNode curr= head;
        for(int i=1; i<=j; i++){
          curr= curr.next;
        }
        ListNode ret= curr.next;
        curr.next= null;

        return ret;
    }
}