import java.util.*;

class Solution {

    public int[] sortEvenOdd(int[] nums) {

        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        // ✦ Separate values based on index parity
        for (int i = 0; i < nums.length; i++) {

            if (i % 2 == 0) {
                even.add(nums[i]);
            } else {
                odd.add(nums[i]);
            }
        }

        // ✦ Sort independently
        Collections.sort(even);
        odd.sort(Collections.reverseOrder());

        // ✦ Reconstruct the array
        int e = 0;
        int o = 0;

        for (int i = 0; i < nums.length; i++) {

            if (i % 2 == 0) {
                nums[i] = even.get(e++);
            } else {
                nums[i] = odd.get(o++);
            }
        }

        return nums;
    }
}
