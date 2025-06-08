class Solution52nd {
  // better then prevoius solution5( connected node accoding to the values)
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode head = new ListNode(2);
        ListNode temp = head;

        //edge case if any list is empty
       if (temp1 == null) return temp2;
       if (temp2 == null) return temp1;


        while(temp1 != null && temp2 != null){
            if(temp1.val < temp2.val){
                temp.next = temp1;
                temp = temp1;
                temp1 = temp1.next;
            }else{
                temp.next = temp2;
                temp = temp2;
                temp2 = temp2.next;
            }    
        }
        if(temp1== null){
            temp.next = temp2;
        }else{
            temp.next = temp1;
        }
        return head.next;
    }
}
