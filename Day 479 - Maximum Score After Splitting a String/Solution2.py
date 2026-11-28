"""
LeetCode Day 479
Problem: 1422. Maximum Score After Splitting a String
Difficulty: Easy
Approach 2: Prefix & Suffix Arrays

Time Complexity: O(n)
Space Complexity: O(n)
"""

class Solution:
    def maxScore(self, s: str) -> int:
        n = len(s)

        prefix_zeros = [0] * n
        suffix_ones = [0] * n

        # Build prefix zero counts.
        prefix_zeros[0] = int(s[0] == '0')

        for i in range(1, n):
            prefix_zeros[i] = prefix_zeros[i - 1]

            if s[i] == '0':
                prefix_zeros[i] += 1

        # Build suffix one counts.
        suffix_ones[-1] = int(s[-1] == '1')

        for i in range(n - 2, -1, -1):
            suffix_ones[i] = suffix_ones[i + 1]

            if s[i] == '1':
                suffix_ones[i] += 1

        max_score = 0

        # Evaluate every valid split.
        for i in range(n - 1):
            score = prefix_zeros[i] + suffix_ones[i + 1]
            max_score = max(max_score, score)

        return max_score
