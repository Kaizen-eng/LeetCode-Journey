class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> positiveValues = new HashSet<>();

        for (int num : nums) {
            if (num > 0) {
                positiveValues.add(num);
            }
        }

        return positiveValues.size();
    }
}
