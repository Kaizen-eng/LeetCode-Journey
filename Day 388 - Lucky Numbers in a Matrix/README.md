# LeetCode 1380 - Lucky Numbers in a Matrix

## Problem
Find all lucky numbers in a matrix.

A lucky number is an element that is the minimum element in its row
and the maximum element in its column.

## Example

Input:
[
  [3, 7, 8],
  [9, 11, 13],
  [15, 16, 17]
]

Output:
[15]

## Approach

1. Find the minimum element of every row.
2. Find the maximum element of every column.
3. Traverse the matrix.
4. If an element is both:
   - the minimum of its row
   - the maximum of its column
   add it to the result.

## Complexity

- Time: O(m × n)
- Space: O(m + n)

## Language

Java
