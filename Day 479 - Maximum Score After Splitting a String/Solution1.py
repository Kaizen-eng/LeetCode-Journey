"""
LeetCode Day 479
Problem: 1422. Maximum Score After Splitting a String
Difficulty: Easy
Approach 1: Brute Force

Time Complexity: O(n^2)
Space Complexity: O(1)
"""

class Solution:
    def maxScore(self, s: str) -> int:
        n = len(s)
        max_score = 0

        # Try every valid splitting position.
        for i in range(1, n):
            zeros = 0
            ones = 0

            # Count zeros in the left substring.
            for j in range(i):
                if s[j] == '0':
                    zeros += 1

            # Count ones in the right substring.
            for j in range(i, n):
                if s[j] == '1':
                    ones += 1

            # Update the maximum score.
            max_score = max(max_score, zeros + ones)

        return max_score
