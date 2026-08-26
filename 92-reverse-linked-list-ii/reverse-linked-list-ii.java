class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
         ListNode leftnode =head;
         ListNode leftbeforenode=null;

         for(int i=1;i<left;i++){
             leftbeforenode=leftnode;
             leftnode=leftnode.next;
         }

         ListNode rightafternode=leftnode;

       for(int i=left;i<=right;i++){
            rightafternode=rightafternode.next;
         }

         ListNode rh=null,t=null,dh=leftnode;
         while(dh!=rightafternode){
              t=rh;
              rh=dh;
              dh=dh.next;
              rh.next=t;
         }
       
       if(leftbeforenode==null){
        head=rh;
       }else{
       leftbeforenode.next=rh;
       }
       leftnode.next=rightafternode;

       return head;
    }
}