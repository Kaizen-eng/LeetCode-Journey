
# ✦ Day 436 — Sum of Integers with Maximum Digit Range

## Problem
Given an integer array `nums`, find the maximum digit range among all integers and return the sum of every integer having that range.

**Digit Range** = Largest Digit - Smallest Digit

## Approach
✧ Extract each digit using `% 10` and `/ 10`.
✧ Track the minimum and maximum digits.
✧ Calculate the digit range of each number.
✧ If the range exceeds the current maximum, update the maximum and reset the sum.
✧ If the range equals the maximum, add the number to the sum.

## Example
Input: `nums = [24, 68, 13, 57]`

| Number | Digit Range |
|---|---:|
| 24 | 2 |
| 68 | 2 |
| 13 | 2 |
| 57 | 2 |

Output: `162`

All numbers share the maximum digit range.

## Complexity
- Time: O(n × d)
- Auxiliary Space: O(1)

Here, `n` is the array length and `d` is the maximum number of digits in an integer.

## Key Learning
A running maximum and sum allow us to solve the problem in one array traversal without storing individual digit ranges.
