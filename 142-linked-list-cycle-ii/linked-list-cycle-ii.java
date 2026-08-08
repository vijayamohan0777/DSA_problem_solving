 
public class Solution {
      public ListNode p1=null;
    boolean isCyclic(ListNode head){
        ListNode slow= head;
        ListNode fast= head;
         if(head==null) return false;
        while( fast.next!=null && fast.next.next!=null){
             slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                p1=slow;
                return true;
            }
        }
        return false;
    }
    public ListNode detectCycle(ListNode head) {
        
      if(isCyclic(head)){
        ListNode p2=head;
        while(p1!=p2){
            p1=p1.next;
            p2=p2.next;
        }
          return p1;
      }

      return null;
    }
}