class Solution {
    
    public int firstMatchingIndex(String s) {
        
        int L = 0, R = s.length()-1;

        while ( L <= R ) {
            if (s.charAt(L) == s.charAt(R)) {
                return L;
            }
            L++;
            R--;
        }

        return -1;

    }

}
