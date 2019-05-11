/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head.next == null)   return head;
        while(head.next != null){
            reverseList(head.next);
            head = head.next;
        }
        
        
    }
}