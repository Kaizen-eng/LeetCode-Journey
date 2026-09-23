class Solution {

    public boolean canBeIncreasing(int[] nums) {

        int n = nums.length;

        // Find the first violation.
        int violation = -1;

        for (int i = 1; i < n; i++) {
            if (nums[i - 1] >= nums[i]) {
                violation = i;
                break;
            }
        }

        // Already strictly increasing.
        if (violation == -1) {
            return true;
        }

        // Try removing nums[violation - 1].
        if (isIncreasingAfterRemoving(nums, violation - 1)) {
            return true;
        }

        // Try removing nums[violation].
        return isIncreasingAfterRemoving(nums, violation);
    }

    private boolean isIncreasingAfterRemoving(int[] nums, int skip) {

        int previous = -1;
        boolean hasPrevious = false;

        for (int i = 0; i < nums.length; i++) {

            if (i == skip) {
                continue;
            }

            if (hasPrevious && previous >= nums[i]) {
                return false;
            }

            previous = nums[i];
            hasPrevious = true;
        }

        return true;
    }
}
