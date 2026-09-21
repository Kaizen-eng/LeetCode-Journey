/*
 * LeetCode 2511: Maximum Enemy Forts That Can Be Captured
 * Day 411
 *
 * Approach 1: Two Pointers
 * Time: O(n)
 * Space: O(1)
 */

class Solution {
    public int captureForts(int[] forts) {
        int left = -1;
        int max = 0;

        for (int right = 0; right < forts.length; right++) {
            if (forts[right] != 0) {
                if (left != -1 && forts[left] != forts[right]) {
                    max = Math.max(max, right - left - 1);
                }

                left = right;
            }
        }

        return max;
    }
}
