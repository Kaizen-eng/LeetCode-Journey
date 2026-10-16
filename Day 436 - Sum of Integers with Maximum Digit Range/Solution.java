
class Solution {
    public int maxDigitRange(int[] nums) {
        int maxRange = -1;
        int sum = 0;

        for (int num : nums) {
            int range = digitRange(num);

            if (range > maxRange) {
                maxRange = range;
                sum = num;
            } else if (range == maxRange) {
                sum += num;
            }
        }

        return sum;
    }

    private int digitRange(int num) {
        int minDigit = 9;
        int maxDigit = 0;

        do {
            int digit = num % 10;
            minDigit = Math.min(minDigit, digit);
            maxDigit = Math.max(maxDigit, digit);
            num /= 10;
        } while (num > 0);

        return maxDigit - minDigit;
    }
}
