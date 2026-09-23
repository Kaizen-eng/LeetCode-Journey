LeetCode 1909 — Remove One Element to Make the Array Strictly Increasing

Difficulty: Easy
Language: Java
Day: 413
Problem: "LeetCode 1909" (https://leetcode.com/problems/remove-one-element-to-make-the-array-strictly-increasing/)

Problem

Given a 0-indexed integer array "nums", return "true" if the array can be made strictly increasing after removing exactly one element.

If the array is already strictly increasing, return "true".

Approach

The array is strictly increasing when:

nums[i - 1] < nums[i]

for every valid "i".

First, find the first position where this condition fails.

If no violation exists, the array is already strictly increasing.

When a violation is found:

nums[i - 1] >= nums[i]

only two elements can potentially fix the problem:

- "nums[i - 1]"
- "nums[i]"

We virtually remove each candidate and check whether the remaining elements are strictly increasing.

There is no need to create a new array.

Example

Input:
nums = [1, 2, 5, 3, 5]

Violation:
5 >= 3

Remove 5:
[1, 2, 3, 5] → strictly increasing

Output:
true

Complexity

- Time: "O(n)"
- Space: "O(1)"

Key Takeaway

When a sorted-order condition is violated, focus on the elements directly involved in the first violation. Then verify that the proposed correction works for the entire remaining sequence.
