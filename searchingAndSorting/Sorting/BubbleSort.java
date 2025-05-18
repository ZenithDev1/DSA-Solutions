package DSA;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,5,3,9,7,2};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j <arr.length - 1 - i; j++) { // arr.length-1-i is bcz i don't need to go on lastindex
                if (arr[j] > arr[j + 1]) {  // assending and decending oder is completly your choice
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
