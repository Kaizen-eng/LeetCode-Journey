class Solution {

    public String thousandSeparator(int n) {

        String num = String.valueOf(n);
        StringBuilder sb = new StringBuilder();

        int count = 0;

        for (int i = num.length() - 1; i >= 0; i--) {

            sb.append(num.charAt(i));
            count++;

            if (count == 3 && i != 0) {
                sb.append('.');
                count = 0;
            }
        }

        return sb.reverse().toString();
    }
}

// Time Complexity: O(d)
// Space Complexity: O(d)
// d = Number of digits in n
