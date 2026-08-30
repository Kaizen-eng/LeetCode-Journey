# Notes - LeetCode 2022

## Core Idea

To construct an `m × n` matrix, the original array must contain exactly:

m × n elements

So first check:

original.length == m * n

If not, return an empty matrix.

## Index Mapping

For an element at index `i` in the 1D array:

row = i / n
column = i % n

Example:

original = [1, 2, 3, 4, 5, 6]
m = 2
n = 3

Result:

1  2  3
4  5  6

Index mapping:

i = 0 → [0][0]
i = 1 → [0][1]
i = 2 → [0][2]
i = 3 → [1][0]
i = 4 → [1][1]
i = 5 → [1][2]

## Important Point

`i / n` determines the row.

`i % n` determines the column.

## Complexity

Time: O(m × n)

Space: O(m × n)
