
class Solution {
    public void reorderList(ListNode head) {
        ListNode slow=head,fast=head;
//find mid node and divide th list
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
            ListNode templ2=slow.next;
            slow.next=null;
//reverse list 2
       ListNode  list2=null;
       ListNode temp=null;
       while(templ2!=null){
         temp=templ2;
         templ2=templ2.next;
         temp.next=list2;
         list2=temp;
       }
// merge alternative
ListNode list1=head;
  while (list1 != null && list2 != null) {

            ListNode t1 = list1.next;
            ListNode t2 = list2.next;

            list1.next = list2;
            list2.next = t1;

            list1 = t1;
            list2 = t2;
        }
    }
}