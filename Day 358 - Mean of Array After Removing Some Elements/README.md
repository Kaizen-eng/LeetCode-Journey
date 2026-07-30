# Day 358 - Mean of Array After Removing Some Elements

## Problem
Given an integer array, remove the smallest 5% and the largest 5% of elements, then return the mean of the remaining elements.

## Approach
- Sort the array.
- Compute the number of elements to remove using:

remove = n / 20

- Traverse from index `remove` to `n - remove - 1`.
- Calculate the sum and divide it by the number of remaining elements.

## Time Complexity
O(n log n)

## Space Complexity
O(1) (excluding sorting implementation)
