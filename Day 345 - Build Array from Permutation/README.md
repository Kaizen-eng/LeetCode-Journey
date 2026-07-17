# 1920. Build Array from Permutation

## Problem
Given a zero-based permutation array `nums`, build a new array `ans` such that:

ans[i] = nums[nums[i]]

Return the constructed array.

## Approach
- Create a new array of the same length.
- Traverse the original array once.
- For each index:
  - Store `nums[nums[i]]` into the answer array.
- Return the answer.

## Complexity

- Time: O(n)
- Space: O(n)
