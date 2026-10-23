✦ LeetCode 1403 — Minimum Subsequence in Non-Increasing Order

✧ Problem Summary

Find the minimum-length subsequence whose sum is strictly greater than the sum of the remaining elements. Return the subsequence in non-increasing order.

✧ Approach — Greedy + Sorting

1. Sort the array in ascending order.
2. Calculate the total sum.
3. Traverse from right to left, selecting the largest elements.
4. Update the selected and remaining sums.
5. Stop when the selected sum exceeds the remaining sum.

✧ Example

Input: "nums = [4, 3, 10, 9, 8]"

Output: "[10, 9]"

Explanation: The selected sum is "19", while the remaining sum is "15". Since "19 > 15", the condition is satisfied with just two elements.

✧ Complexity

- Time: "O(n log n)"
- Auxiliary Space: Depends on the sorting implementation; the returned subsequence requires up to "O(n)" space.

✧ Implementations

- Java — "Solutions.java"
- Python — Greedy traversal using "reversed(nums)"

✦ Consistency beats complexity. One quest at a time!
