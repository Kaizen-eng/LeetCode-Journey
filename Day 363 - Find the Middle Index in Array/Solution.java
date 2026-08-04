class Solution {

    public int findMiddleIndex(int[] nums) {

        int totalSum = 0;
        int leftSum = 0;
        int rightSum;

        for ( int num : nums ) {

            totalSum += num;
            
        }

        for ( int i = 0; i < nums.length; i++ ) {

            rightSum = totalSum - leftSum - nums[i];

            if (leftSum == rightSum) {
                return i;
            }

            else {
                leftSum += nums[i];
            }

        }

        return -1;
        
    }

}
