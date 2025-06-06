/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

// LeetCode problem:--->  https://leetcode.com/problems/linked-list-cycle/
public class Solution4 {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        if(head == null || head.next == null) return false;

        while(fast != null){
            if(slow.next == null) return false;
            slow = slow.next;
            if(fast.next == null) return false;
            fast = fast.next.next;

            if(fast == slow) return true;
        }
        return false;
    }
}
