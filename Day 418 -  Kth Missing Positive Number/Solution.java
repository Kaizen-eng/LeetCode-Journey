class Solution {

    public int findKthPositive(int[] arr, int k) {

        int count = 0;

        // Check missing numbers before the first element
        for (int i = 1; i < arr[0]; i++) {

            count++;

            if (count == k) {
                return i;
            }
        }

        // Check gaps between consecutive elements
        for (int i = 0; i < arr.length - 1; i++) {

            int missing = arr[i + 1] - arr[i] - 1;

            // kth missing number lies inside this gap
            if (count + missing >= k) {
                return arr[i] + (k - count);
            }

            count += missing;
        }

        // kth missing number lies after the last element
        return arr[arr.length - 1] + (k - count);
    }
}
