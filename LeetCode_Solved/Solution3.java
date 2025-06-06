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
// leetCode problem linke:--->  https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/
class Solution3 {
    public ListNode deleteMiddle(ListNode head) {
        ListNode tempNode = head;

        if(head == null || head.next == null){
            return null;
        }
        
        ListNode slow = head;
        ListNode fast = head;

        int countToRemove = 0;
        while(fast.next.next != null && fast.next.next.next != null ){
            slow = slow.next;
            fast = fast.next.next;
            countToRemove++;
        }

        for(int i=0; i<countToRemove;i++){
            tempNode = tempNode.next;
        }
        tempNode.next = tempNode.next.next;
        return head; 
    }
    
}
