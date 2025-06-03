/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

// Question link:--->  https://leetcode.com/problems/middle-of-the-linked-list/description/
class Solution {
    public ListNode middleNode(ListNode head) {
       ListNode tempNode = head;
       ListNode slow = head;
       ListNode fast = head;
       
       // edge case
       if(head.next == null){
          System.out.println("here headNode is the MidNode...");
          return head;
       }

       while(fast != null && fast.next != null){
         slow = slow.next;
         fast = fast.next.next;
        }
        return slow;
    }
}
