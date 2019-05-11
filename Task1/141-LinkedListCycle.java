/*
*最先想到的是最简单的...就是用一个hashset来记录走过的路

还有一个牛逼的O(1)空间复杂度的解法，以不同的速度遍历总有相遇的一天
当然对我来说这是永远想不到的Orz
*/
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        while(head != null && head.next !=null){
            if(!set.add(head)) return true;
            head = head.next;
        }
        return false;
    }
}