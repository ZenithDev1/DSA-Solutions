import java.util.Scanner;

public class Sayhii {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    

    System.out.println("Enter button number from 1 to 3: ");
    int button = sc.nextInt();

    switch(button){
       case 1: System.out.println("hello...");
       break;
       case 2: System.out.println("namaskar");
       break;
       case 3: System.out.println("bonjour");
       break;
       default: System.out.println("You entered an INVALID button");
    }
    }
}
