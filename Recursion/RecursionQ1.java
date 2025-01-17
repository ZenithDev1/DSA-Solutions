public class RecursionQ1 { 
    // this is our main() metho;
    public static void main(String[] args) {
      int result = sum(7);
      System.out.println(result);
    }
   
        // Writinf a Recursion function
  static int sum(int k) {
     if (k > 0) {
        return k + sum(k - 1);
       } else {
          return 0;
        }
    }
}
