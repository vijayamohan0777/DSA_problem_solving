/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
        //override the after value not delete
        node.val=node.next.val;

        //change the address of removing node
        node.next=node.next.next;
    }
}