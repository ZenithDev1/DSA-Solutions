/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

// Question Linl:--->   https://leetcode.com/problems/intersection-of-two-linked-lists/description/
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
              ListNode tempA;
       ListNode tempB;

       tempA = headA;
       int sizeA = 0;
       while (tempA != null) { 
           sizeA++;
           tempA = tempA.next;
       }

       tempB = headB;
       int sizeB = 0;
       while (tempB != null) { 
           sizeB++;
           tempB = tempB.next;
        }

       tempA = headA;
       tempB = headB;

       if(sizeA > sizeB){
        int steps = sizeA - sizeB;
          for(int i =1; i <= steps; i++){
             tempA = tempA.next;
            }
        }else{
            int steps = sizeB - sizeA;
            for(int i =1; i <= steps; i++){
             tempB = tempB.next;
            }
        }


        while(tempA != tempB){
             tempA = tempA.next;
             tempB = tempB.next;
        }
        return tempA; 
    }
}
