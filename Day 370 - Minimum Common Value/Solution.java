class Solution {

    public int getCommon(int[] nums1, int[] nums2) {

        int L = 0, R = 0;

        while ( L < nums1.length && R < nums2.length ) {
            
            if ( nums1[L] == nums2[R] ) {
                return nums1[L];
            }

            if ( nums1[L] < nums2[R] ) {
                L++;
            }
            
            else {
                R++;
            }

        }

        return -1;
        
    }

}
