/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head;
        int i=0;
        while(p2.next != null){
            if(i % 2 == 0)  p2 = p2.next;
            else{
                p1 = p1.next;
                p2 = p2.next;
            }
            i++;
        }
        return (i % 2 == 1)? p1.next:p1;  
    }
}