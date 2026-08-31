# LeetCode 2335 - Minimum Amount of Time to Fill Cups

## Problem

You have a water dispenser that can fill up to two cups at the same time,
but the cups must be of different types.

Given an integer array `amount` where:

- `amount[0]` = number of cold water cups
- `amount[1]` = number of warm water cups
- `amount[2]` = number of hot water cups

Return the minimum number of seconds needed to fill all the cups.

## Approach

There are two important constraints:

1. At most two cups can be filled in one second.
2. Two cups filled simultaneously must be of different types.

Therefore, the answer is:

`max(maxAmount, ceil(total / 2))`

where:

- `maxAmount` is the largest value in `amount`
- `total` is the total number of cups

For integer arithmetic in Java:

`ceil(total / 2) = (total + 1) / 2`

## Complexity

- Time Complexity: O(1)
- Space Complexity: O(1)

## Language

Java
