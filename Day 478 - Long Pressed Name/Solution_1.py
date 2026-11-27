"""
LeetCode 925 — Long Pressed Name
Day 478
Difficulty: Easy

Approaches: Two Pointers

Time Complexity: O(n + m)
Auxiliary Space: O(1)
"""


class Solution:

    # Approach : Two Pointers

    def isLongPressedName(self, name: str, typed: str) -> bool:

        i = 0
        j = 0

        while j < len(typed):

            if i < len(name) and name[i] == typed[j]:
                i += 1
                j += 1

            elif j > 0 and typed[j] == typed[j - 1]:
                j += 1

            else:
                return False

        return i == len(name)
