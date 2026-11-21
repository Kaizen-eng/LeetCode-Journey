class Solution {

    public int countCommon(int[] arr1, int[] arr2) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr2) {
            set.add(num);
        }

        int count = 0;

        for (int num : arr1) {
            if (set.contains(num)) {
                count++;
            }
        }

        return count;
    }

    public int[] findIntersectionValues(int[] nums1, int[] nums2) {

        int count1 = countCommon(nums1, nums2);
        int count2 = countCommon(nums2, nums1);

        return new int[]{count1, count2};
    }
}
