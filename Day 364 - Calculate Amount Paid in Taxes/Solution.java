class Solution {
    public double calculateTax(int[][] brackets, int income) {

        double tax = 0.0;
        int previousUpper = 0;

        for (int i = 0; i < brackets.length; i++) {

            int currentUpper = brackets[i][0];
            int percent = brackets[i][1];

            // If income doesn't reach this bracket, we're done.
            if (income <= previousUpper) {
                break;
            }

            int taxableAmount = Math.min(currentUpper - previousUpper,
                                         income - previousUpper);

            tax += taxableAmount * percent / 100.0;

            previousUpper = currentUpper;
        }

        return tax;
    }
}
