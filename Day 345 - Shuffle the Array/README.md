# 1470. Shuffle the Array

## Problem

Given an array in the form:

[x1,x2,...,xn,y1,y2,...,yn]

Return:

[x1,y1,x2,y2,...,xn,yn]

## Approach 1

- Iterate through every position.
- Fill even indices using the first half.
- Fill odd indices using the second half.

## Approach 2 (Cleaner)

- Create an answer array.
- Maintain one index for the answer array.
- Traverse the first half.
- Insert:
  - first-half element
  - corresponding second-half element

## Complexity

- Time: O(n)
- Space: O(n)
