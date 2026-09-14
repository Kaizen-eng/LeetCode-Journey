import java.util.*;

class Solution1 {
    public List<Integer> targetIndices(int[] nums, int target) {

        Arrays.sort(nums);

        List<Integer> list = new ArrayList<>();

        for (int idx = 0; idx < nums.length; idx++) {
            if (nums[idx] == target) {
                list.add(idx);
            }
        }

        return list;
    }
}
