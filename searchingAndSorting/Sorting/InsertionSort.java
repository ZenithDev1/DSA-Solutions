package DSA;

public class InsertionSort{
    public static void main(String[] args){
         int[] arr = {51,61,01,69,96,7,11,8,71};

         int n = arr.length;

         for(int i =1; i<n; i++){
            int j = i-1;
            int currentElement = arr[i];
            
            while(j>=0 && arr[j]>currentElement){
               arr[j+1]= arr[j];
               j--;
            }
            arr[j+1]=currentElement;
         }
        System.out.println("Sorted array is: "+java.util.Arrays.toString(arr));
        }
}
