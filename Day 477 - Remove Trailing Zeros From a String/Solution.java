class Solution {

    public String removeTrailingZeros(String num) {

        int i = num.length() - 1;

        while (num.charAt(i) == '0') {
            i--;
        }

        return num.substring(0, i + 1);
    }
}

// Time Complexity: O(n)
// Auxiliary Space: O(1)
// n = Length of the input string
