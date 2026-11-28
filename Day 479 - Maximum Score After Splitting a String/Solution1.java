/*
 * LeetCode Day 479
 * Problem: 1422. Maximum Score After Splitting a String
 * Difficulty: Easy
 * Approach 1: Brute Force
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */

class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int maxScore = 0;

        // Try every valid splitting position.
        for (int i = 1; i < n; i++) {
            int zeros = 0;
            int ones = 0;

            // Count zeros in the left substring.
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == '0') {
                    zeros++;
                }
            }

            // Count ones in the right substring.
            for (int j = i; j < n; j++) {
                if (s.charAt(j) == '1') {
                    ones++;
                }
            }

            // Update the maximum score.
            maxScore = Math.max(maxScore, zeros + ones);
        }

        return maxScore;
    }
}
