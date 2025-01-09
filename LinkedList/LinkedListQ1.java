public class LinkedListQ1 {
     public static void main(String[] args){
      // so Guys this is our main method;     
      LinkedListQ1 list = new LinkedListQ1();
      list.addFirst("of");
      list.addFirst("Example");
      list.printList();

       // adding new data
      list.addLast("LinedList");
      list.printList();
    }

  // class Node
    class Node{
       String data;
       Node next;

       Node(String data){
           this.data = data;
       }
    } Node head;              // assuming as constant because we shouldnt move our header

  
    //  to add data in the first node
    public void addFirst(String data){
       Node newNode = new Node(data);
       if(head == null){
          head = newNode;
          return;
       }

       newNode.next = head;
       head = newNode;
    }

  
    // adding data in last node
    public void addLast(String data){
       Node newNode = new Node(data);
       if(head == null){
          head = newNode;
          return;
       } 

       Node currentNode = head;
       while(currentNode.next != null){
           currentNode = currentNode.next;
       }
       currentNode.next = newNode;
    }

  
    // for printing the our Linkefdlist 
    public void printList(){
       if(head == null){
           // this line will get printed only when our linkedlist have mo data
           System.out.println("List khali s");
       }
       
       Node currentNode = head;
       while(currentNode != null){
           System.out.print(currentNode.data + "--->");
           currentNode = currentNode.next;
       }
       System.out.println("NULL");
     }

}
