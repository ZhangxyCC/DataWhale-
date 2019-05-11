/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode res = new ListNode(-1);
        ListNode p3 = res;
        while(p1 != null && p2 != null){
            if(p1.val < p2.val){
                p3.next = p1;
                p1 = p1.next;
            }else{
                p3.next = p2;
                p2 = p2.next;
            }
            p3 = p3.next;
        }
        
        while(p1 != null)  {
            p3.next = p1;
            p3 = p3.next;
            p1 = p1.next;
        }

         while(p2 != null)  {
            p3.next = p2;
            p3 = p3.next;
            p2 = p2.next;
        }
        
        return res.next;
    }
}