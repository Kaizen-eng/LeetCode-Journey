# 2917. Find the K-or of an Array

**Day 455 of LeetCode Daily Challenge**

## Problem
Given an integer array `nums` and an integer `k`, return the K-or of `nums`.

The K-or is the integer formed by setting each bit to `1` if that bit is set in at least `k` elements of the array.

Otherwise, that bit remains `0`.

## Example

**Input:**
```text
nums = [7, 12, 9, 8, 9, 15], k = 4
```

**Output:**
```text
9
```

**Explanation:**

The bit at position 0 appears in 4 numbers, while the bit at position 3 appears in 5 numbers. Both satisfy the condition `count >= k`.

Therefore, the resulting binary number is `1001`, which equals `9`.

## Approach — Bit Manipulation

1. Initialize `answer = 0`.
2. Iterate through each bit position from 0 to 30.
3. Count how many elements have the current bit set using bitwise AND.
4. If the count is at least `k`, set that bit in the answer using bitwise OR.
5. Return the final answer.

## Complexity Analysis

- **Time Complexity:** O(31 × N) = O(N), where N is the length of the array.
- **Space Complexity:** O(1), as only a constant amount of extra space is used.

## Key Concepts
- Bit Manipulation
- Bitwise AND (`&`)
- Bitwise OR (`|`)
- Binary Representation

**Language:** Java & Python
