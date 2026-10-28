class Solution:
    def minimumCost(self, prices: list[int]) -> int:
        prices.sort(reverse=True)

        total_cost = 0

        for i, price in enumerate(prices):
            if i % 3 != 2:
                total_cost += price

        return total_cost
