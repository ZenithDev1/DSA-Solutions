public class PrefixSum{
    public static void main(String[] args){
        int[] number= {2,5,8,4,9,1};              // array storing values

        int[] prefixSum = fixSum(number);         // calling our function
      
        for (int num : prefixSum) {               // Printing myresult
            System.out.print(num + " ");
        }   
    }
 
    public static int[] fixSum(int[] number) {    // writin ga funciton to get prefix
        int arrlen = number.length;
        int prefix[] = new int[number.length];    // storeing prefix sum

        prefix[0] = number[0];
      
        for(int i =1; i < arrlen;i++){
            prefix[i] = prefix[i -1 ] + number[i];   
        }
        return prefix;
    }
}
