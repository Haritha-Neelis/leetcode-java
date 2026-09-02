// Remove Element
// Difficulty: Easy
// Runtime: 0 ms
// Memory: 43.6 MB
// https://leetcode.com/problems/remove-element/

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
