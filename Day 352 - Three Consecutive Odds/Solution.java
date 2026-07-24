class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {

        if ( arr.length < 3 ) return false;

        if ( arr.length == 3 ) {
            int count = 0, i = 0;
            if ( arr[i] % 2 == 1 && arr[i+1] % 2 == 1 && arr[i+2] % 2 == 1 ) count++;
            if ( count == 1 ) return true;
        }
        
        for ( int i = 0; i <= arr.length-3; i++ ) {
            int count = 0;
            if ( arr[i] % 2 == 1 && arr[i+1] % 2 == 1 && arr[i+2] % 2 == 1 ) count++;
            if ( count == 1 ) return true;
        }
        return false;
    }
}
