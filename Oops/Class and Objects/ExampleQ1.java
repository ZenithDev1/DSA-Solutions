public class ExampleQ1 {
    public static void main(String [] args){
        // creating OBJECT p1 for class person
        Person p1 = new Person(33, "komal");

        // print name and ageof person 
        System.out.println(p1.name);
        System.out.println(p1.age);

    }
}
// create class Person
class Person{
    // create instance name
    String name;
     // crate instance age
    int age;

     // create Parametrized constructor
    Person(int age, String name){
        this.name = name;
        this.age = age;
    }
}
