public class Solution13 {
 //LeetCode problem link:-->  https://leetcode.com/problems/max-consecutive-ones/?envType=problem-list-v2&envId=array
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;

        for (int num : nums) {
            if (num == 1) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }

        return maxCount;
    }
}
