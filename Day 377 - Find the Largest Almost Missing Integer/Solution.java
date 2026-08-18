class Solution {
    public int largestInteger(int[] nums, int k) {

        int[] freq = new int[51];

        // Count frequency of every number
        for (int num : nums) {
            freq[num]++;
        }

        // Only one subarray exists
        if (k == nums.length) {
            int ans = 0;

            for (int num : nums) {
                ans = Math.max(ans, num);
            }

            return ans;
        }

        int ans = -1;

        // k == 1 → every element forms its own subarray
        if (k == 1) {
            for (int num = 1; num <= 50; num++) {
                if (freq[num] == 1) {
                    ans = num;
                }
            }

            return ans;
        }

        // 1 < k < nums.length
        // Only the first and last elements can be almost missing
        if (freq[nums[0]] == 1) {
            ans = Math.max(ans, nums[0]);
        }

        if (freq[nums[nums.length - 1]] == 1) {
            ans = Math.max(ans, nums[nums.length - 1]);
        }

        return ans;
    }
}
