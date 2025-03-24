import java.io.*;

public class Targetsum{
    public static void targetSumfun(int[] arr, int targetSum) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { // +1 taken to get next element
                if (arr[i] + arr[j] == targetSum) { 
                    System.out.println(i + " " + j); // printing indexes
                    return; // Stops execution after finding the first pair
                }
            }
        }
        System.out.println("No pair found");
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11,15};  // array
        int targetSum = 9; // target
        targetSumfun(arr, targetSum);
    }   
}
