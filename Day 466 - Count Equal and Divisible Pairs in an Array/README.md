
# 2176. Count Equal and Divisible Pairs in an Array

**LeetCode Difficulty:** Easy  
**Day:** 466  
**Topics:** Array, Enumeration

## Problem Description

Given a 0-indexed integer array `nums` and an integer `k`, return the number of pairs `(i, j)` where:

- `0 <= i < j < nums.length`
- `nums[i] == nums[j]`
- `(i * j) % k == 0`

## Examples

**Example 1:**

Input:
```text
nums = [3,1,2,2,2,1,3], k = 2
```

Output:
```text
4
```

**Example 2:**

Input:
```text
nums = [1,2,3,4], k = 1
```

Output:
```text
0
```

## Approach: Brute Force

1. Initialize a counter `count = 0`.
2. Use an outer loop to select index `i`.
3. Use an inner loop starting from `i + 1` to select index `j`.
4. Check whether both elements are equal and their index product is divisible by `k`.
5. Increment the counter whenever both conditions are satisfied.
6. Return the final count.

## Complexity Analysis

- **Time Complexity:** O(n²) — We examine every possible pair of indices.
- **Space Complexity:** O(1) — Only a constant amount of extra space is used.

## Key Takeaway

Nested loops are useful when checking every possible pair while maintaining specific index constraints.
