import java.util.ArrayList;

public class SimpleCollectionExample {
    public static void main(String[] args) {
        // ArrayList banaya jo Strings store karega
        ArrayList<String> fruits = new ArrayList<>();

        // Elements add kiye
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Sab fruits print kiye
        System.out.println("Fruits list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
