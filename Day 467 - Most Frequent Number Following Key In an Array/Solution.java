class Solution {
    public int mostFrequent(int[] nums, int key) {
        int[] freq = new int[1001];

        int maxFreq = 0;
        int result = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key) {
                int target = nums[i + 1];

                freq[target]++;

                if (freq[target] > maxFreq) {
                    maxFreq = freq[target];
                    result = target;
                }
            }
        }

        return result;
    }
}
