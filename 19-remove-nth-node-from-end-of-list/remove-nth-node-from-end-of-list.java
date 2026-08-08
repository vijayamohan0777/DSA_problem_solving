
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size =0;
        ListNode temp=head;
        ListNode dhead=head;

        while(temp!=null){
            temp=temp.next;
            size++;
        }
         n=size-n;
         if(n==0) return head.next;

          ListNode prev=null,dh=head;
         for (int i = 0; i < n ; i++) {
            prev=dh;
            dh = dh.next;
        }
          prev.next= dh.next;

          return head;

    }
}