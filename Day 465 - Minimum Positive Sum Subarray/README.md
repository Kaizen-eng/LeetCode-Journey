# LeetCode 3364 - Minimum Positive Sum Subarray

**Day 465** of my LeetCode journey.

## Problem
Find the minimum positive sum among all contiguous
subarrays whose lengths are between `l` and `r`
(inclusive).

Return -1 if no valid positive sum exists.

## Example

Input:
nums = [1, 2, -1, 3]
l = 2
r = 3

Output:
1

Explanation:
The subarray [2, -1] has the minimum positive sum.

## Approach

1. Iterate through every possible starting index.
2. Generate subarrays with lengths between l and r.
3. Calculate each subarray's sum.
4. Ignore non-positive sums.
5. Maintain the minimum positive sum.

## Complexity

Python:
- Time: O(n * r²)
- Space: O(r)

Java:
- Time: O(n * r)
- Space: O(1)

## Languages
- Python
- Java

## Key Concepts
- Arrays
- Nested Loops
- Subarrays
- Python Slicing
- Running Sum

**Day 465 completed!**
