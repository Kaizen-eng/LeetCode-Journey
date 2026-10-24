
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int previousIndex = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (previousIndex != -1 &&
                    i - previousIndex - 1 < k) {
                    return false;
                }

                previousIndex = i;
            }
        }

        return true;
    }
}
