# Day 421 — LeetCode 2670: Distinct Difference Array

## Problem Overview

Given an integer array `nums`, construct an array `diff` where:

`diff[i] = distinct(nums[0..i]) - distinct(nums[i+1..n-1])`

Here, `distinct(arr)` represents the number of unique elements in the specified subarray.

**LeetCode:** [2670. Distinct Difference Array]\([https://leetcode.com/problems/](https://leetcode.com/problems/) find-distinct-difference-array/)

## Example

**Input**

```text
nums = [1, 2, 3, 4, 5]
```

**Output**

```text
[-3, -1, 1, 3, 5]
```

**Explanation**

At each index, count the distinct elements in the prefix ending at that index and subtract the distinct elements in the suffix beginning at the next index.

## Approach 1 — Brute Force

- Create separate prefix and suffix `HashSet` instances for every index.
- Count distinct elements on both sides.
- Store the difference in the result array.

**Time Complexity:** O(n²) expected
**Auxiliary Space:** O(n)

## Approach 2 — Optimized Prefix and Suffix Counting

- Traverse from right to left and precompute the number of distinct elements in each suffix.
- Clear the set and traverse from left to right.
- Maintain the distinct prefix count incrementally.
- Subtract `suffixCount[i + 1]` from the prefix count.

**Time Complexity:** O(n) expected
**Auxiliary Space:** O(n)

## Key Concepts

- Arrays
- HashSet
- Prefix and suffix processing
- Precomputation
- Time complexity optimization

## Learning Outcome

This problem demonstrates how precomputing suffix information and maintaining a running prefix count eliminates redundant traversals.

---

**Day 421 complete — Learn, optimize, and repeat! ✦**
