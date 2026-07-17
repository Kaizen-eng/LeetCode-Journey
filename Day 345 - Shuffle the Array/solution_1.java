class Solution {
    public int[] shuffle(int[] nums, int n) {

        int[] ans = new int[n * 2];
        int j = n;
        int idx = 0;

        for (int i = 0; i < n * 2; i++) {
            if (i % 2 == 0) {
                ans[i] = nums[idx];
                idx++;
            } else {
                ans[i] = nums[j];
                j++;
            }
        }

        return ans;
    }
}
