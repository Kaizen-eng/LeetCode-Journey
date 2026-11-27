/*
 * LeetCode 925 — Long Pressed Name
 * Day 478
 * Difficulty: Easy
 *
 * Approaches: Two Pointers
 *
 * Time Complexity: O(n + m)
 * Auxiliary Space: O(1)
 */

class Solution {

    // Approach: Two Pointers

    public boolean isLongPressedName(String name, String typed) {

        int i = 0;
        int j = 0;

        while (j < typed.length()) {

            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            }
            else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            }
            else {
                return false;
            }
        }

        return i == name.length();
    }
