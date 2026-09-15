class Solution {

    public int maximumCount(int[] nums) {

        int n = nums.length;

        int negative_count = lowerBound(nums, 0);
        int positive_count = n - lowerBound(nums, 1);

        return Math.max(negative_count, positive_count);
    }

    private int lowerBound(int[] nums, int target) {

        int left = 0;
        int right = nums.length;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid;
        }

        return left;
    }
}
