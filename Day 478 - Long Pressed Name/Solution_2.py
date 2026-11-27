"""
LeetCode 925 — Long Pressed Name
Day 478
Difficulty: Easy

Approaches: Two Pointers

Time Complexity: O(n + m)
Auxiliary Space: O(1)
"""

class Solution:

    # Approach : Character Group Comparison

    def isLongPressedNameGroupComparison(
        self, name: str, typed: str
    ) -> bool:

        i = 0
        j = 0

        while i < len(name) and j < len(typed):

            char = name[i]

            count_name = 0
            count_typed = 0

            while i < len(name) and name[i] == char:
                count_name += 1
                i += 1

            while j < len(typed) and typed[j] == char:
                count_typed += 1
                j += 1

            if count_typed < count_name:
                return False

        return i == len(name) and j == len(typed)
