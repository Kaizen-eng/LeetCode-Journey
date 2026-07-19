class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {

        int current = 0, max = 0;

        for ( int i = 0; i < nums.length; i++ ) {

            current = (nums[i] == 1) ? current + 1 : 0;
            max = Math.max(current, max);

        }

        return max;
        
    }

}
