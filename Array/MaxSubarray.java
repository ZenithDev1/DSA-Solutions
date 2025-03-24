import java.io.*;
import java.util.*;
import java.util.Scanner;

public class MaxSubarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }        
        // Fiding maximum subarray sum 
        int maxSum = findMaxSubarraySum(nums);
        System.out.println(maxSum);

    }

    public static int findMaxSubarraySum(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0; // initializing with zero

        for (int num : nums) {
            currentSum += num;
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }
}
