✦ LeetCode 832 — Flipping an Image

✦ Problem

Given an (m \times n) binary matrix, flip each row horizontally and then invert every bit.

- "0 → 1"
- "1 → 0"

✦ Approach — Two Pointers

✦ Traverse each row independently.

✦ Initialize "left = 0" and "right = row.length - 1".

✦ Swap the two elements while inverting both using XOR ("^ 1").

✦ Move the pointers inward until they cross.

✦ Return the modified matrix.

✦ Complexity Analysis

- Time Complexity: "O(m × n)"
- Auxiliary Space: "O(1)" — in-place modification.

✦ Implementations

- "Solution.java" — Java two-pointer solution.
- "solution.py" — Python two-pointer solution.
