
class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);

        int remainingSum = 0;
        for (int num : nums) {
            remainingSum += num;
        }

        List<Integer> result = new ArrayList<>();
        int selectedSum = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            int num = nums[i];

            result.add(num);
            selectedSum += num;
            remainingSum -= num;

            if (selectedSum > remainingSum) {
                break;
            }
        }

        return result;
    }
}
