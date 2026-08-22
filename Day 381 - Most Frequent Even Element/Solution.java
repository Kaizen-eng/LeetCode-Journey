class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        // Count frequency of every number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int answer = -1;

        // Find the most frequent even number
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();

            // Skip odd numbers
            if (num % 2 != 0) {
                continue;
            }

            // Higher frequency wins; on a tie, smaller number wins
            if (count > maxFreq ||
                (count == maxFreq && (answer == -1 || num < answer))) {
                maxFreq = count;
                answer = num;
            }
        }

        return answer;
    }
}
