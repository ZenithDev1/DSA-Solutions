public class Inheritence3Q{
    public static void main(String args[]){
    // create object for car
    Vehical car1 = new Car("BMW",5908);
    
    car1.drive();
    }
}
// create Parent class Vehical
class Vehical{
    String vehicalName;
    int vehicalNumber;

    Vehical(String vehicalName, int vehicalNumber){
        this.vehicalName = vehicalName;
        this.vehicalNumber = vehicalNumber;
    }
    
    // create method drive
    void drive(){
        System.out.println("Repairing the vehical");
    }
}
//  creating child clas car
class Car extends Vehical{
    int carName;
    Car(String name,int number){
        super(name,number);
    }

    // overriding parent class's drive() method
    void drive(){
        System.out.println("Repairing the "+vehicalName);
    }
}

// solution at:- https://www.w3resource.com/java-exercises/java-inheritance-exercise-2.php
