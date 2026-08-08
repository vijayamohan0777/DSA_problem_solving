
public class Solution {
    ListNode p2=null;

    boolean isCyclic(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        if(head==null){ 
            return false;
        }

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                p2=slow;
                return true;
            }
        }
          return false;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode lastA=headA;
        while(lastA.next!=null){
            lastA=lastA.next;
        }
        lastA.next=headB;
     
         if(isCyclic(headA)){
            ListNode p1=headA;
            while(p1!=p2){
                p1=p1.next;
                p2=p2.next;
            }
            lastA.next=null;
            return p1;
         }
         lastA.next=null;
         return null;
    }
}