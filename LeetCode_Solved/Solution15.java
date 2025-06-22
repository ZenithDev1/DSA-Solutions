class Solution15 {
 // LeetCode Problem Link:-->  https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int next = nums[(i + 1) % n]; // circular check
            if (nums[i] > next) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }

        return true;
    }
}
