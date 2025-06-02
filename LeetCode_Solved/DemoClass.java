// remove nth node
// Question link:-->  https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
public class DemoClass{
    
    Node headNode;
    class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(headNode == null){
             headNode = newNode;
             return;
        }
        
        newNode.next = headNode;
        headNode = newNode;
    }
    
    public void printLinkedList(){
       Node tempNode = headNode;
       while(tempNode != null){
           System.out.print(tempNode.data+" ");
           tempNode = tempNode.next;
       }
    }

    public int size(){
        int count = 0;
        Node tempNode = headNode;

        while(tempNode != null){
             tempNode = tempNode.next;
             count++;
        }
        return count;
    }

    public void  removeNthFromEnd(int n) {
        int totalNode = size();
        int removeNode = totalNode - n;
        
        // only if we have to remoce the first node
        if(removeNode == 0){
           headNode = headNode.next;
        }

        int index = 0;
        Node tempNode = headNode;

        while(tempNode != null && index < removeNode -1 ){
            tempNode = tempNode.next;
            index++;
        }

        // removing(skipping the nth) the node
        if (tempNode != null && tempNode.next != null) {
            tempNode.next = tempNode.next.next;
        }
    }
    
    
    public static void main(String []args){
        DemoClass m1 = new DemoClass();
        
        m1.addFirst(5);
        m1.addFirst(4);
        m1.addFirst(3);
        m1.addFirst(2);
        m1.addFirst(1);
        System.out.println("Original LinkedList: ");
        m1.printLinkedList();

        m1.removeNthFromEnd(2);
        System.out.println();
        System.out.println("after removing required node from back: ");
        m1.printLinkedList();
    }
}
