// Reverse String
// Difficulty: Easy
// Runtime: 0 ms
// Memory: 48.3 MB
// https://leetcode.com/problems/reverse-string/

class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;

        }

    }
}
