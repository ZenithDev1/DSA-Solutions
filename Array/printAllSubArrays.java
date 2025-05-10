package DSA;

public class printAllSubArrays {
    public static void main(String[] args) {
       int[] arr = {3,5,1,9,6,4,7};
       int n = arr.length;
       
       for(int i =0; i<n; i++){
          for(int j = i; j<n; j++){
             for(int k =i; k<=j; k++){
                System.out.print(arr[k] +" ");
              }                                      //3rd for loop till here
             System.out.println();
          }                                        //2nd for loop till here
       }                                          //1st for loop till here
    }
}
