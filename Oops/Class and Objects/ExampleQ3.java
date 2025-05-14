class Car {
    private String brand;
    private int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // displayng car details
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

public class ExampleQ3 {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2020); 
        myCar.displayInfo(); 
    }
}
