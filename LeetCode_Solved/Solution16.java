public class Solution16 {
 // LeetCode problem Link:-->  https://leetcode.com/problems/single-number/description/
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
