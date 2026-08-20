class Solution {
    public int[] limitOccurrences(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Calculate result size
        int size = 0;

        for (int frequency : map.values()) {
            size += Math.min(frequency, k);
        }

        // Build result
        int[] result = new int[size];
        int index = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int value = entry.getKey();
            int frequency = entry.getValue();

            int count = Math.min(frequency, k);

            for (int i = 0; i < count; i++) {
                result[index++] = value;
            }
        }

        // Maintain sorted order
        Arrays.sort(result);

        return result;
    }
}
