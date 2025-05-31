public class LL { // practiced linkedlist
    public static void main(String[] args) {
        LL list = new LL();

        list.addFirst(5);
        list.addFirst(3);
        list.addFirst(21);
        list.addFirst(33);
        list.printLinkedList();
        System.out.println();
        list.addLast(34);
        list.printLinkedList();
        System.out.println();
        System.out.println("element is:"+list.printNodeAtIndex(2));
    }

    Node headNode;
    //Node tempNode; local declaration is suitable and safe
    Node tailNode;

    class Node{
      int data;
      Node next;

      // Constructor for NOde
      Node(int data) {
         this.data = data;
         this.next = null;
        }     
    }

    public void addFirst(int data){
      Node newNode = new Node(data);
        if (headNode == null) { // in case if list dont have any Node
             headNode = newNode;
             return; 
            }// if's scope thill here

        newNode.next = headNode;
        headNode = newNode;

    }

    public void addLast(int data){
        
       Node newNode = new Node(data);
         if(headNode == null){
             headNode = newNode;
             return;
         }
        
        Node tempNode = headNode;
        while (tempNode.next != null) { 
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
        // newNode.next = null;
        
    }

    public void printLinkedList(){
        if(headNode == null){
            System.out.println("List khali se mitrr...");
            return;
        }

       Node tempNode = headNode;
       while(tempNode != null){
          System.out.print(tempNode.data+" ");
          tempNode = tempNode.next;
        }
    }

    public int printNodeAtIndex(int indexNumber){
        Node tempNode = headNode;
        for (int i= 0; i<indexNumber; i++) {
            tempNode = tempNode.next;
        }
      return tempNode.data;
    }
}
