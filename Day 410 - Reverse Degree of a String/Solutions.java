class Solution {

    public int reverseDegree(String s) {

        int rev_deg = 0, i = 0;

        while (i < s.length()) {

            int reversePosition = 26 - (s.charAt(i) - 'a');

            rev_deg += reversePosition * (i + 1);

            i++;
        }

        return rev_deg;
    }
}
