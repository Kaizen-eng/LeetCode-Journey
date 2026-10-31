class Solution {

    public int minOperations(List<Integer> nums, int k) {

        boolean[] collected = new boolean[k + 1];
        int count = 0;
        int operations = 0;

        for (int i = nums.size() - 1; i >= 0; i--) {
            int num = nums.get(i);
            operations++;

            if (num <= k && !collected[num]) {
                collected[num] = true;
                count++;
            }

            if (count == k) return operations;
        }

        return operations;
        
    }

}
