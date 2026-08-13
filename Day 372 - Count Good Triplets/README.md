# Day 372 - Count Good Triplets

## Problem

Given an integer array `arr` and three integers `a`, `b`, and `c`, count the number of good triplets `(i, j, k)` where:

- `0 <= i < j < k < arr.length`
- `|arr[i] - arr[j]| <= a`
- `|arr[j] - arr[k]| <= b`
- `|arr[i] - arr[k]| <= c`

A triplet is considered **good** only when all three conditions are satisfied.

## Approach

I used **Brute Force with Three Nested Loops**.

Since the constraints are small enough, we can directly check every possible combination of three indices.

- `i` starts from the beginning of the array.
- `j` starts from `i + 1`, ensuring `i < j`.
- `k` starts from `j + 1`, ensuring `j < k`.
- For every `(i, j, k)`, check the three given conditions using `Math.abs()`.
- If all three conditions are satisfied, increment the count.

This gives us a simple and direct solution without unnecessary optimization.

## Algorithm

1. Initialize `count = 0`.
2. Iterate `i` from `0` to `n - 1`.
3. Iterate `j` from `i + 1` to `n - 1`.
4. Iterate `k` from `j + 1` to `n - 1`.
5. Check:
   - `|arr[i] - arr[j]| <= a`
   - `|arr[j] - arr[k]| <= b`
   - `|arr[i] - arr[k]| <= c`
6. If all conditions are true, increment `count`.
7. Return `count`.

## Complexity

- **Time Complexity:** `O(n³)`
- **Space Complexity:** `O(1)`

## Key Takeaway

Not every problem needs an optimized approach.

When the constraints allow it, **brute force can be the cleanest and most reliable solution**.

The important part is understanding the conditions correctly and systematically checking every valid triplet.
