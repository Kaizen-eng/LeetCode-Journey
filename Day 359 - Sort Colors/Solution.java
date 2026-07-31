class Solution {
    public void sortColors(int[] nums) {
        
        for ( int i = 1; i < nums.length; i++ ) {
            for ( int j = i; j < nums.length; j++ ) {

                if ( nums[i-1] >= nums[j] ) {
                    int temp = nums[j];
                    nums[j] = nums[i-1];
                    nums[i-1] = temp;
                }
                
            }
        }

    }
}
