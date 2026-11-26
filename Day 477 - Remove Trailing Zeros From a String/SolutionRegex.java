class Solution {

    public String removeTrailingZeros(String num) {

        return num.replaceAll("0+$", "");
    }
}

// Regex: 0+$
// 0  -> Matches zero
// +  -> One or more occurrences
// $  -> End of the string

// Time Complexity: O(n) for this simple pattern
// Auxiliary Space: O(n) worst-case, including regex processing
