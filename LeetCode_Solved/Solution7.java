public class Solution7{
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] result = new ListNode[k];

        int totalNodes = 0;
        ListNode temp = head;
        while (temp != null) {
            totalNodes++;
            temp = temp.next;
        }

        int partSize = totalNodes / k;      // Minimum size of each part
        int extra = totalNodes % k;         // First 'extra' parts will have one extra node

        // Step 3: Start splitting the list
        ListNode current = head;
        for (int i = 0; i < k; i++) {
            // Set the head for the current part
            result[i] = current;

            // Determine current part size: add 1 if this part should be longer
            int currentPartSize = partSize + (i < extra ? 1 : 0);

            // Traverse to the last node of the current part
            for (int j = 0; j < currentPartSize - 1; j++) {
                if (current != null) {
                    current = current.next;
                }
            }

            // If current is not null, disconnect the current part from the rest
            if (current != null) {
                ListNode nextPart = current.next; // Save the next part's head
                current.next = null;              // Break the link
                current = nextPart;               // Move to the next part
            }
        } // for loop till here

        // Return the array containing head of each part
        return result;
    }
}
