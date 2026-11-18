# ✦ 2908. Minimum Sum of Mountain Triplets I

![Day](https://img.shields.io/badge/Day-469-blueviolet?style=for-the-badge)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=for-the-badge)
![Language](https://img.shields.io/badge/Java%20%7C%20Python-Implemented-orange?style=for-the-badge)

✦ **Problem Overview**

Given a 0-indexed integer array `nums`, find the minimum sum of a mountain triplet.

A triplet of indices `(i, j, k)` is considered a mountain if:

✦ `i < j < k`

✦ `nums[i] < nums[j]`

✦ `nums[k] < nums[j]`

Return the minimum possible sum of such a triplet. If no valid triplet exists, return `-1`.

✦ **Approach**

Use three nested loops to explore every possible combination of three indices.

✦ Fix the first index `i`.

✦ Iterate through the possible middle index `j`.

✦ Iterate through the possible third index `k`.

✦ Check whether `nums[j]` is greater than both `nums[i]` and `nums[k]`.

✦ Update the minimum sum whenever a valid mountain is found.

✦ **Complexity Analysis**

- Time Complexity: `O(n³)` — Exploring all possible triplets.
- Space Complexity: `O(1)` — Using constant extra space.

✦ **Key Learning**

A mountain triplet does not require consecutive indices. Only the condition `i < j < k` must be satisfied.

✦ **Day 469 — Another problem solved, another concept mastered!**
