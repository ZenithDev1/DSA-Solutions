import java.util.Scanner;

public class Factorial {
     public static void main(String[] args) {
        //Get the number yto calculate factorial
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();
        
        long factorial = 1;

        //using for loop
        for (int i = 1; i <= number; i++) {
            factorial *= i;  // Multiply factirial byvalue of i
        }
        
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
