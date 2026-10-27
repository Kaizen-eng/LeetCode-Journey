# LeetCode 2078 — Two Furthest Houses With Different Colors

**Day 447** | Difficulty: Easy

## Problem
Given an array `colors`, return the maximum distance between two houses with different colors.

The distance between houses at indices `i` and `j` is `|i - j|`.

## Approach
1. Scan from left to right to find the first house whose color differs from the last house.
2. Scan from right to left to find the first house whose color differs from the first house.
3. Calculate both distances and return the maximum.

## Example

**Input:** `colors = [1,1,1,6,1,1,1]`

**Output:** `3`

**Explanation:** Houses at indices `0` and `3` have different colors, and their distance is `3`.

## Complexity Analysis
- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

## Key Takeaway
The maximum distance can be found by checking the array's endpoints and performing at most two linear scans.

## Tags
`Array` `Greedy` `Two Pointers`

---

*Consistency beats perfection. One problem at a time, one day at a time.* 🚀
