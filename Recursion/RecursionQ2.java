import java.util.Scanner;
//reverse counting from number n
public class RecursionQ2{
     static int printCounting(int n1){
        if(n1 >= 0){
            System.out.println(n1);
            printCounting(n1 - 1);
            }
            return 1;
         }
        

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("enter num from where you wants counting: ");
    int num = sc.nextInt();

    int number = printCounting(num);
    System.out.println(number);

    }
}
