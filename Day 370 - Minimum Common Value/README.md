# Day 370 - Minimum Common Value

## LeetCode 2540

### Problem
Given two sorted integer arrays `nums1` and `nums2`, return the minimum integer that appears in both arrays.

If there is no common integer, return `-1`.

### Approach
Since both arrays are sorted, we can use the Two Pointer technique.

- Start one pointer at the beginning of each array.
- If both elements are equal, return that value.
- If `nums1[i] < nums2[j]`, increment `i`.
- Otherwise, increment `j`.
- If either pointer reaches the end, there is no common value.

Because the arrays are sorted, the first common value found is guaranteed to be the minimum common value.

### Complexity

- Time: `O(n + m)`
- Space: `O(1)`

### Key Concept
**Two Pointers + Sorted Arrays**
