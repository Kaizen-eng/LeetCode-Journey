class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] suffixCount = new int[n + 1];
        int[] diff = new int[n];

        HashSet<Integer> seen = new HashSet<>();

        // Pass 1: Count distinct elements in every suffix
        for (int i = n - 1; i >= 0; i--) {
            seen.add(nums[i]);
            suffixCount[i] = seen.size();
        }

        // Pass 2: Count distinct elements in every prefix
        seen.clear();

        for (int i = 0; i < n; i++) {
            seen.add(nums[i]);
            diff[i] = seen.size() - suffixCount[i + 1];
        }

        return diff;
    }
}
