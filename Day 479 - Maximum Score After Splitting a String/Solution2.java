/*
 * LeetCode Day 479
 * Problem: 1422. Maximum Score After Splitting a String
 * Difficulty: Easy
 * Approach 2: Prefix & Suffix Arrays
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public int maxScore(String s) {
        int n = s.length();

        int[] prefixZeros = new int[n];
        int[] suffixOnes = new int[n];

        // Build prefix zero counts.
        prefixZeros[0] =
            (s.charAt(0) == '0') ? 1 : 0;

        for (int i = 1; i < n; i++) {
            prefixZeros[i] = prefixZeros[i - 1];

            if (s.charAt(i) == '0') {
                prefixZeros[i]++;
            }
        }

        // Build suffix one counts.
        suffixOnes[n - 1] =
            (s.charAt(n - 1) == '1') ? 1 : 0;

        for (int i = n - 2; i >= 0; i--) {
            suffixOnes[i] = suffixOnes[i + 1];

            if (s.charAt(i) == '1') {
                suffixOnes[i]++;
            }
        }

        int maxScore = 0;

        // Evaluate every valid split.
        for (int i = 0; i < n - 1; i++) {
            int score = prefixZeros[i] + suffixOnes[i + 1];

            maxScore = Math.max(maxScore, score);
        }

        return maxScore;
    }
}
