package DSA;

public class DsaArrays {
    public static void main(String[] args) {
        // calc the sum of all the elements in the given array.
        int[] arr = {5,1,3};

        int sum =0;
        for(int i =0; i < arr.length;i++){
            sum += arr[i];
        }
        System.out.println("sum of the all elements of the array is:"+sum);
    }
}
