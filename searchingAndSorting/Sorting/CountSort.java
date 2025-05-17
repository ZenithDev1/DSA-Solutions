package DSA;

public class CountSort {
    public static void main(String[] args) {
        int n =6;
        int[] arr = {6,2,6,6,2,4};
        int max = 0;
          // finding max
        for(int i = 0; i<= arr.length-1; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }System.out.println("Largest number of the array: "+max);


        int[] Count = new int[max +1 ];
       
        for (int i = 0; i<n; i++){
            int element = arr[i];
            Count[element]++;
        }

        int k=0;
        for(int i=max; i>=0; i--){
            int freq = Count[i];
            for(int j =1; j<=freq; j++){
                arr[k] = i;
                k++;
            }
        }

        System.out.println("pronting the sorted array in decreasing order");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
