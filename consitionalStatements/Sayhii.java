import java.util.Scanner;

public class Sayhii {
    public static void main(String[] args) {
     // this program is written to Say hii in multipe languages   
    Scanner sc = new Scanner(System.in);
    

    System.out.println("Enter button number from 1 to 3: ");
    int button = sc.nextInt();

    if(button == 1){
        System.out.println("hello...");
    }else if (button == 2) {
        System.out.println("Namaskar...");
    }else if(button == 3 ){
        System.out.println("Bonjour");
    }else{
        System.out.println("Button number sahi de daalde bhai!!...");
    }

    }
}
