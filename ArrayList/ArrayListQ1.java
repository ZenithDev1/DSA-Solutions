import java.util.ArrayList;

public class ArrayListQ1{
    public static void main(String[] args){
    
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
           list.add(0);
           list.add(2);
           list.add(3);
        
           // print or access ArrayList ele
           list.get(0);
           list.get(1);
           list.get(2);

           System.out.println("List elements are: " +list);

           int element = list.get(0);
           System.out.println( "\na element in list: " +element);

           // adding elemnt on a certain position
           list.set(1,1);
           System.out.println( "\nlist after adding new element: " +list);

           // removing an ele from list
           list.remove(0);
           System.out.println( "\nlist after removing an element: " +list);

           //print the size of the list        
           int lenofList = list.size();
           System.out.println("\nlength of list is: " +lenofList +"\n");

           // print list elements with for loop
           for(int i = 0; i<list.size();i++){
               System.out.println("list_el. by forloop: "+list.get(i));
            }
            System.out.println("\nTopic ArrayList Done");
    }
}
