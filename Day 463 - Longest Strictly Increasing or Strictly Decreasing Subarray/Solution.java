class Solution {
    public int longestMonotonicSubarray(int[] nums) {

        int increasing = 1;
        int decreasing = 1;
        int maximum = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > nums[i - 1]) {
                increasing++;
            } else {
                increasing = 1;
            }

            if (nums[i] < nums[i - 1]) {
                decreasing++;
            } else {
                decreasing = 1;
            }

            maximum = Math.max(maximum,
                               Math.max(increasing, decreasing));
        }

        return maximum;
    }
}
