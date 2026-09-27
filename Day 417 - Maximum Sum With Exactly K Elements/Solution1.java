class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);

        int max = nums[nums.length - 1];
        int sum = max;

        for (int i = 1; i < k; i++) {
            max++;
            sum += max;
        }

        return sum;
    }
}
