package DSA;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {3,5,1,9,6,4,7};

        int leftSide = 0;
        int rightSide = arr.length-1;
        int temp =0;

        System.out.println(Arrays.toString(arr));

        while(leftSide < rightSide){
           temp = arr[leftSide];
           arr[leftSide] = arr[rightSide];
           arr[rightSide] = temp;

           leftSide++;
           rightSide--;
        }    
       System.out.println(Arrays.toString(arr));
    }
}
