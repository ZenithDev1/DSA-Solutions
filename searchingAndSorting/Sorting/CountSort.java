package DSA;
import java.util.*;

class CountSort{
    public static void main(String[] args) {
        
        int[] arr = {6,2,6,6,2,4};
        int n =arr.length-1;
        
        int max = 0;
        for(int i =0; i<=n; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Maximum number in arr: "+max);
        
        int [] Count = new int[max + 1];
        
        for(int i = 0; i<=n; i++){
            int element = arr[i];
            Count[element]++; // Increase count of this element from arr[i]
        }
        System.out.println(Arrays.toString(Count));
        
        
        int k = 0;
        for(int i = Count.length-1; i>=0; i--){
          int frequency = Count[i];
          for(int j = 1; j <=frequency; j++){
            arr[k]=i;
            k++;
          }  // j's loop till here
        }   // i's loop is till here
        System.out.println(Arrays.toString(arr)); // you can use for loop also
    }
}
