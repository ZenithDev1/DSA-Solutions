import java.util.Scanner;

public class RectangleOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the pattern: ");
        int size = scanner.nextInt();

        for (int i = 1; i <= size; i++) {
            // for columns
            for (int j = 1; j <= size; j++) {
                System.out.print("* ");
            }
            //next line after printing columns
            System.out.println();
        }
    }
}
