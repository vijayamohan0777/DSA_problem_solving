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
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null){
            return head;
        }
        int n=0;
        ListNode t=new ListNode();
        t=head;
        while(t!=null){
            n++;
            t=t.next;
        }
         
         k=k%n;
        if(k==0){
            return head;
        }
         ListNode c= head;
       for(int i=0;i<n-k-1;i++){ //n-k-1  is important beacause at n-k new head is exist
             c=c.next;
       } 

       ListNode p=c.next;
       ListNode newhead=p;
        c.next=null;
       while(p.next!=null){
        p=p.next;
       } 

       p.next=head;

       return newhead;
    }
}  