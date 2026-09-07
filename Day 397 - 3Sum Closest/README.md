# ✦ LeetCode 16 – 3Sum Closest

## Problem

Given an integer array `nums` and an integer `target`, find three integers
whose sum is closest to `target`.

Return the sum of those three integers.

## Approach

1. Sort the array.
2. Fix one element using a loop.
3. Use two pointers:
   - `left = i + 1`
   - `right = n - 1`
4. Calculate the current sum.
5. Compare its distance from `target` with the current `closest_sum`.
6. Update `closest_sum` if the current sum is closer.
7. Adjust the pointers:
   - If `sum < target`, move `left` forward.
   - If `sum > target`, move `right` backward.
   - If `sum == target`, return immediately.

## Complexity

- Time: `O(n²)`
- Space: `O(1)` excluding sorting space
