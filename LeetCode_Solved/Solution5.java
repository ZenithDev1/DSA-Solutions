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
// Problem Link:---> https://leetcode.com/problems/merge-two-sorted-lists/
class Solution5 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode head = new ListNode(100);
        ListNode temp = head;

        if(temp1 == null) return temp2;
        if(temp2 == null) return temp1;
 
        while( temp1 != null && temp2 != null){
            if(temp1.val<temp2.val){
                ListNode a = new ListNode(temp1.val);
                temp.next = a;
                temp = a;
                temp1 = temp1.next;
            }else{
              ListNode a = new ListNode(temp2.val);
              temp.next = a;
              temp = a;
              temp2 = temp2.next;
            }
        }

        if(temp1 == null) temp.next = temp2;
        if(temp2 == null) temp.next = temp1;
        return head.next;
        

    }
}
