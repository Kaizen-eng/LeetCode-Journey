class Solution {

    public int firstStableIndex(int[] nums, int k) {

        int stable_index = -1;

        for (int idx = 0; idx < nums.length; idx++) {

            int min = Arrays.stream(nums, idx, nums.length).min().getAsInt();
            int max = Arrays.stream(nums, 0, idx+1 ).max().getAsInt();

            if ( max - min <= k ) {

                stable_index = idx;
                break;

            }

        }

        return stable_index;
        
    }

}
