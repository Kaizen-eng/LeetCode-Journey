/*
 * LeetCode 2511: Maximum Enemy Forts That Can Be Captured
 * Day 411
 *
 * Approach 2: Previous Non-Zero Index
 * Time: O(n)
 * Space: O(1)
 */

class Solution {
    public int captureForts(int[] forts) {
        int prev = -1;
        int max = 0;

        for (int i = 0; i < forts.length; i++) {
            if (forts[i] != 0) {
                if (prev != -1 && forts[prev] != forts[i]) {
                    max = Math.max(max, i - prev - 1);
                }

                prev = i;
            }
        }

        return max;
    }
}
