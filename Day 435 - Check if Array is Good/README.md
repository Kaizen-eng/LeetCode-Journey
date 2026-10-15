# ✦ LeetCode 2784 — Check if Array Is Good

## ✦ Problem
Determine whether an array is good.

For an array of length `n + 1`:
- Every integer from `1` to `n - 1` must appear exactly once.
- The integer `n` must appear exactly twice.

## ✦ Approach: Frequency Counting
1. Calculate `n = nums.length - 1`.
2. Count the frequency of every element.
3. Verify that `n` occurs twice.
4. Verify that each number from `1` to `n - 1` occurs once.
5. Return `true` if all conditions hold; otherwise, return `false`.

## ✦ Example

**Input:** `nums = [1, 3, 3, 2]`

**Output:** `true`

**Explanation:** Every number from `1` to `2` occurs once, and `3` occurs twice.

## ✦ Complexity
- **Time:** `O(n)`
- **Auxiliary Space:** `O(1)` — fixed-size frequency array.

## ✦ Key Takeaway
Frequency counting makes it easy to validate an array's required element pattern.

**Day 435 → CLEARED ✦**
