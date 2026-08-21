class Solution {

    public boolean isMiddleElementUnique(int[] nums) {

        int count = 0;

        for (int num : nums) {
            if (num == nums[nums.length / 2]) {
                count++;
            }
        }

        if (count == 1) {
            return true;
        }

        return false;
    }
}
