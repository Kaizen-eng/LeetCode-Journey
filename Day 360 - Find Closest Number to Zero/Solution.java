class Solution {
    public int findClosestNumber(int[] nums) {

        int res = nums[0];

        for (int num : nums) {

            if (Math.abs(num) < Math.abs(res)) {
                res = num;
            } 
            else if (Math.abs(num) == Math.abs(res) && num > res) {
                res = num;
            }

        }

        return res;
    }
}
