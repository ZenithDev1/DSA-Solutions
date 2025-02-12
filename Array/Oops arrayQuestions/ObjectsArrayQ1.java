public class ObjectsArrayQ1 {
    public static void main(String[] args){
// easiest example of objects array creation
      
        // array of Student objects
        Student[] s = {
            new Student(1, "Ram"),
            new Student(2, "Shyam")
        };
        
        // Displaying student details
        for (Student s1 : s) {
            s1.display();
        }
    }
}
class Student {
    int id;
    String name;

    // Constructor to initialize students object
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to print details of student
    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}
