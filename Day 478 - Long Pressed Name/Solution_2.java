/*
 * LeetCode 925 — Long Pressed Name
 * Day 478
 * Difficulty: Easy
 *
 * Approaches: Character Group Comparison
 *
 * Time Complexity: O(n + m)
 * Auxiliary Space: O(1)
 */

class Solution {

// Approach: Character Group Comparison

public boolean isLongPressedNameGroupComparison( String name, String typed ) {

    int i = 0;
    int j = 0;

    while (i < name.length() && j < typed.length()) {

        char ch = name.charAt(i);

        int countName = 0;
        int countTyped = 0;

        while (i < name.length() && name.charAt(i) == ch) {
            countName++;
            i++;
        }

        while (j < typed.length() && typed.charAt(j) == ch) {
            countTyped++;
            j++;
        }

        if (countTyped < countName) {
            return false;
        }
    }

    return i == name.length() && j == typed.length();
}

}
