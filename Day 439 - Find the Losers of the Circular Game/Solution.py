class Solution:
    def circularGameLosers(self, n: int, k: int) -> list[int]:
        visited = [False] * n

        current = 0
        turn = 1

        while not visited[current]:
            visited[current] = True
            current = (current + turn * k) % n
            turn += 1

        return [
            i + 1
            for i in range(n)
            if not visited[i]
        ]
