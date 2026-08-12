# Day 371 - Largest Positive Integer That Exists With Its Negative

## Problem

Given an integer array `nums` that does not contain any zeros, find the largest positive integer `k` such that both `k` and `-k` exist in the array.

If no such integer exists, return `-1`.

## Approach

I used **Sorting + Two Pointers**.

After sorting the array:

- `L` starts from the smallest element.
- `R` starts from the largest element.
- Calculate `nums[L] + nums[R]`.
- If the sum is `0`, the two numbers are negatives of each other, so `nums[R]` is a valid positive integer.
- If the sum is negative, increase `L` to make the sum larger.
- If the sum is positive, decrease `R` to make the sum smaller.

Because `R` starts at the largest value, the first valid pair we find gives the **largest positive integer**.

## Algorithm

1. Sort the array.
2. Initialize `L = 0` and `R = nums.length - 1`.
3. While `L < R`:
   - If `nums[L] + nums[R] == 0`, return `nums[R]`.
   - If the sum is less than `0`, increment `L`.
   - Otherwise, decrement `R`.
4. If no valid pair exists, return `-1`.

## Example

```text
Input:
[-1, 10, 6, 7, -7, 1]

After sorting:
[-7, -1, 1, 6, 7, 10]

-7 + 10 = 3  → move R
-7 + 7  = 0  → valid pair

Answer = 7
```
