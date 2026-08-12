class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
      int carry=0;
      ListNode head=null;
       ListNode temp=null;

      while(l1!=null || l2!=null|| carry!=0){
          int sum=carry;

          if(l1 != null){
             sum+=l1.val;
             l1=l1.next;
          }

          if(l2 != null){
            sum+=l2.val;
            l2=l2.next;
          }
         int value=sum%10;
          carry=sum/10;

          ListNode nn =new ListNode(value);
           if(head==null){
            head=nn;
            temp=head;
           }else{
           temp.next=nn;
           temp=nn;
           }  

      }

    //   ListNode rh=null;
    //   ListNode temp=head;

    //   while(temp!=null){
    //     temp=temp.next;
    //     head.next=rh;
    //     rh=head;
    //     head=temp;
    //   }
        return head;
    }
}