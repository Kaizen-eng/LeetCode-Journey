# LeetCode 3978 — Unique Middle Element

✦ **Difficulty:** Easy  
✦ **Language:** Java  
✦ **Day:** 380

## Problem

Given an integer array `nums` of odd length, return `true` if the middle element appears exactly once in the array. Otherwise, return `false`.

## Approach

✦ Find the middle element using:

`nums[nums.length / 2]`

✦ Traverse the array and count how many times the middle element occurs.

✦ If its frequency is exactly `1`, return `true`; otherwise, return `false`.

## Complexity

✦ **Time Complexity:** O(n)

✦ **Space Complexity:** O(1)

## Key Takeaway

The problem can be solved with a simple linear traversal while keeping track of the frequency of the middle element.
