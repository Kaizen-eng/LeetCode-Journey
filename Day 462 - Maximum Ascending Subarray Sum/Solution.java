class Solution {
    public int maxAscendingSum(int[] nums) {

        int curr_sum = nums[0];
        int pre_sum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > nums[i - 1]) {
                curr_sum += nums[i];
            }

            else {
                curr_sum = nums[i];
            }

            pre_sum = Math.max(curr_sum, pre_sum);
        }

        return pre_sum;
    }
}
