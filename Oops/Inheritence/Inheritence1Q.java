class Inheritence1Q {
    public static void main(String[] args) {
       // writing this program to demonstrate single-level inheritance :)
      // create an object of the subclass
      Dog labrador = new Dog();
  
      labrador.name = "Rohu";
      labrador.display();
  
      // call method of superclass
      // using object of subclass
      labrador.eat();
  
    }
  }
  
  class Animal {

    String name;
    public void eat() {
      System.out.println("I can eat");

    }
  }
  
  // inheriting Dog from Animal
  class Dog extends Animal {
  
    // new method in subclass
    public void display() {
      System.out.println("My name is " + name);
    }
  }
