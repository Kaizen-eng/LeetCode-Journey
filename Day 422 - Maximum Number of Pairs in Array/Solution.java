import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] numberOfPairs(int[] nums) {
        Set<Integer> unmatched = new HashSet<>();
        int pairs = 0;

        for (int num : nums) {
            if (unmatched.contains(num)) {
                unmatched.remove(num);
                pairs++;
            } else {
                unmatched.add(num);
            }
        }

        return new int[] { pairs, unmatched.size() };
    }
}
