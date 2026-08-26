# LeetCode 2210 — Count Hills and Valleys in an Array

## Problem

Given an integer array `nums`, count the number of hills and valleys.

An element is considered a **hill** if it is strictly greater than the nearest different values on both sides.

An element is considered a **valley** if it is strictly smaller than the nearest different values on both sides.

Consecutive elements with the same value are treated as one continuous section.

## Approach

Traverse the array from left to right while maintaining the previous different value.

For each position:

1. Skip the current element if it is equal to the next element.
2. Compare the current element with the previous different value and the next different value.
3. If the current value is greater than both, count a hill.
4. If the current value is smaller than both, count a valley.
5. Update the previous different value.

## Complexity

- **Time:** `O(n)`
- **Space:** `O(1)`

## Language

Java ☕
