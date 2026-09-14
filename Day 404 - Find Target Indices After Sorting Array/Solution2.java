import java.util.*;

class Solution2 {
    public List<Integer> targetIndices(int[] nums, int target) {

        int smaller = 0;
        int equal = 0;

        for (int num : nums) {
            if (num < target) {
                smaller++;
            } else if (num == target) {
                equal++;
            }
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < equal; i++) {
            list.add(smaller + i);
        }

        return list;
    }
}
