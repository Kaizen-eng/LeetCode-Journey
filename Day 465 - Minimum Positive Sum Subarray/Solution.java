class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int minimum = Integer.MAX_VALUE;
        int n = nums.size();

        for (int i = 0; i < n; i++) {

            int sum = 0;

            for (int j = i; j < Math.min(i + r, n); j++) {

                sum += nums.get(j);

                int length = j - i + 1;

                if (length >= l && sum > 0) {
                    minimum = Math.min(minimum, sum);
                }
            }
        }

        return minimum == Integer.MAX_VALUE ? -1 : minimum;
    }
}
