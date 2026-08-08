class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack <Integer> st=new Stack();
        ListNode temp=head;
        while( temp!=null){
            st.push(temp.val);
            temp=temp.next;
        }
    
        while(head!=null){
            if(st.pop() != head.val){
                return false;
            }
            head=head.next;
        }
        return true;
    }
}