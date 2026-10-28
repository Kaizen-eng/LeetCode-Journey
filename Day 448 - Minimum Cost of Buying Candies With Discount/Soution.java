
class Solution {
    public int minimumCost(int[] prices) {
        Arrays.sort(prices);

        int totalCost = 0;
        int count = 0;

        for (int i = prices.length - 1; i >= 0; i--) {
            if (count % 3 != 2) {
                totalCost += prices[i];
            }
            count++;
        }

        return totalCost;
    }
}
