class Solution {

    public int findMaxK(int[] nums) {

        int L = 0;
        int R = nums.length - 1;

        Arrays.sort(nums);

        while (L < R) {

            if (nums[L] + nums[R] == 0) {
                return nums[R];
            }

            if (nums[L] + nums[R] < 0) {
                L++;
            }

            else {
                R--;
            }
        }

        return -1;
    }
}
