LeetCode 2760 — Longest Even Odd Subarray With Threshold

Day 430 / 1000+ ⭐

Problem

Find the length of the longest contiguous subarray that starts with an even number, alternates parity, and contains no element greater than the given threshold.

Approach — Single Pass

✦ Maintain a current valid subarray length and the longest length found.

✦ Reset when an element exceeds the threshold.

✦ Extend when the parity alternates.

✦ Start a new subarray whenever a valid even starting element is encountered.

Complexity

- Time: O(n)
- Space: O(1)

Key Takeaway

A single-pass state-tracking approach solves this problem efficiently without enumerating every possible subarray.
