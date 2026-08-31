class Solution {
    public int fillCups(int[] amount) {
        int total = amount[0] + amount[1] + amount[2];

        int maxAmount = Math.max(
            amount[0],
            Math.max(amount[1], amount[2])
        );

        int minimumByTotal = (total + 1) / 2;

        return Math.max(maxAmount, minimumByTotal);
    }
}
