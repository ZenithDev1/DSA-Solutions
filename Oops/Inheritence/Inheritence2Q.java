public class Inheritence2Q {
    public static void main(String args[]){
    //    OopsInheritence5Q.java 17-02-25   
    HRManager e1 = new HRManager("Narendra_Modi");
    e1.addEmployee();
    e1.work();
    }

}
class Employee{
    String name;

    Employee(String name){
     this.name=name;
    }

    void work(){
      System.out.println("Employee is working");
    }

    void getSallery(){
        System.out.println("Sallery is recived");
    }
}
class HRManager extends Employee{
    
    HRManager(String name){
       super(name);
    }

    void work(){
        System.out.println("and why this new Employee isn't working.");
    }

    void addEmployee(){
        System.out.println( this.name+ " added as new Employee");
    }
}
//  solution of:- https://www.w3resource.com/java-exercises/java-inheritance-exercise-4.php
