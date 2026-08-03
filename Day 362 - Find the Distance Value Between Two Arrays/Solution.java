class Solution {

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

        int count = 0;
        
        for ( int i = 0; i < arr1.length; i++ ) {

            boolean found = false;

            for ( int k = 0; k < arr2.length; k++ ) {
        
                if (Math.abs(arr1[i]-arr2[k]) <= d) {
                    found = true;
                    break;
                }
        
            }

            if (!found) count++;

        }
        
        return count;
    
    }

}
