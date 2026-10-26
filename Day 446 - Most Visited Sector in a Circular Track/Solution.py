class Solution:
    def mostVisited(self, n: int, rounds: List[int]) -> List[int]:
        visits = [0] * (n + 1)

        for i in range(len(rounds) - 1):
            sector = rounds[i]

            while sector != rounds[i + 1]:
                visits[sector] += 1
                sector = sector % n + 1

        visits[rounds[-1]] += 1

        max_visits = max(visits[1:])
        return [
            sector
            for sector in range(1, n + 1)
            if visits[sector] == max_visits
        ]
