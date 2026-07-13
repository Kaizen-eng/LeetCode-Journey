import java.util.*;

class Solution {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int[] ans = new int[arr1.length];
        int index = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : arr2) {

            int freq = map.get(num);

            for (int i = 0; i < freq; i++) {
                ans[index++] = num;
            }

            map.remove(num);
        }

        List<Integer> remaining = new ArrayList<>(map.keySet());

        Collections.sort(remaining);

        for (int key : remaining) {

            int freq = map.get(key);

            for (int i = 0; i < freq; i++) {
                ans[index++] = key;
            }
        }

        return ans;
    }
}
