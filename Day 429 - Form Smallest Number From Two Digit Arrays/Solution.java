
class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        boolean[] seen1 = new boolean[10];
        boolean[] seen2 = new boolean[10];

        int min1 = 10;
        int min2 = 10;

        for (int d : nums1) {
            seen1[d] = true;
            min1 = Math.min(min1, d);
        }

        for (int d : nums2) {
            seen2[d] = true;
            min2 = Math.min(min2, d);
        }

        // Find the smallest common digit.
        for (int d = 1; d <= 9; d++) {
            if (seen1[d] && seen2[d]) {
                return d;
            }
        }

        // No common digit: construct the smallest two-digit number.
        return Math.min(min1, min2) * 10
             + Math.max(min1, min2);
    }
}
