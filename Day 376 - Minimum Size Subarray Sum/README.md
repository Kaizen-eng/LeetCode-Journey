# Day 376 - Minimum Size Subarray Sum

## Problem

Given an array of positive integers `nums` and a positive integer `target`, find the **minimum length of a contiguous subarray** whose sum is greater than or equal to `target`.

If no such subarray exists, return `0`.

## Approach

I used the **Sliding Window + Two Pointers** approach.

Since all elements in the array are positive:

- Expanding the window always increases the sum.
- Shrinking the window always decreases the sum.

So, I used two pointers:

- `L` → left boundary of the window
- `R` → right boundary of the window

For every `R`:

1. Add `nums[R]` to `sum`.
2. When `sum >= target`, the current window is valid.
3. Update the minimum window length.
4. Remove `nums[L]` from the sum and move `L` forward.
5. Continue shrinking while the window remains valid.

This allows us to find the smallest valid subarray efficiently.

## Complexity

- **Time:** `O(n)`
- **Space:** `O(1)`

## Key Insight

> Expand until the sum reaches the target, then shrink from the left as much as possible while keeping the window valid.

## Quest Status

**Day 376 — CLEARED ⚔️🔥**
