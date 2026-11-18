class Solution {

    public int minimumSum(int[] nums) {

        int min_sum = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length - 2; i++) {

            for (int j = i + 1; j < nums.length - 1; j++) {

                for (int k = j + 1; k < nums.length; k++) {

                    if (nums[i] < nums[j] && nums[k] < nums[j]) {

                        min_sum = Math.min(
                            min_sum,
                            nums[i] + nums[j] + nums[k]
                        );
                    }
                }
            }
        }

        return min_sum == Integer.MAX_VALUE ? -1 : min_sum;
    }
}
