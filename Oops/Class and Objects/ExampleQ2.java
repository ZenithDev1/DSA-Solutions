//;learning this ketywords uses
public class ExampleQ2 {
    public static void main(String args[]){
       // create object for class Circle
       Circle c1 = new Circle(6);

       System.out.println("Area of circle is: "+c1.calArea());
       System.out.println("\nCircumference of the circle is: "+c1.calCircumference());
    }
}
// create class Circle
class Circle{
    int radius;
    float pi;
     
    //create constructor
    Circle(int radius){
     this.radius=radius;
     pi=3.14f;
    }

    //create a function to calculte area  
    float calArea(){
       float area=this.radius*this.radius;
        return area;
    }

    // create function to calculate circumference 
    float calCircumference(){
        float crm= this.radius*2*pi;
        return crm;
    }
}
