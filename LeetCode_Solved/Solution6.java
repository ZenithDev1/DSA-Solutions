class Solution6 {
    public ListNode oddEvenList(ListNode head) {
      // leetcode problem link:--> https://leetcode.com/problems/odd-even-linked-list/description/
        if (head == null || head.next == null) return head;
        //caseTwo head: 2-->1-->3-->5-->6-->4-->7-->null
        ListNode oddHeadNode = head;
        ListNode oddTempNode = head;

        ListNode evenHeadNode = head.next;
        ListNode evenTempNode = oddTempNode.next;
        


        while(evenTempNode != null && evenTempNode.next != null){
           oddTempNode.next = evenTempNode.next;
           oddTempNode = oddTempNode.next;
           evenTempNode.next = evenTempNode.next.next;
           evenTempNode = evenTempNode.next;
        }
        //evenTempNode.next = null;
        oddTempNode.next = evenHeadNode;
        return oddHeadNode;
    }
}
