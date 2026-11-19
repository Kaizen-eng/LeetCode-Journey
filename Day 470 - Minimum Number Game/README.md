# ✦ LeetCode Day 470 — 2974. Minimum Number Game

![Day](https://img.shields.io/badge/Day-470-blueviolet?style=for-the-badge)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=for-the-badge)
![Language](https://img.shields.io/badge/Java%20%7C%20Python-Implemented-orange?style=for-the-badge)

## ✦ Problem Overview

Given an integer array `nums` of even length, Alice and Bob play a game in rounds.

✦ Alice removes the minimum element from `nums`.

✦ Bob then removes the minimum remaining element.

✦ Bob appends his removed element to `arr` first, followed by Alice's removed element.

✦ The game continues until `nums` becomes empty.

**Objective:** Return the resulting array `arr`.

🔗 **Problem Link:** https://leetcode.com/problems/minimum-number-game/

## ✦ Approach — Sorting & Pair Swapping

✦ Sort the input array in ascending order.

✦ Process the sorted elements in pairs.

✦ For every pair:
- The first element represents Alice's selection.
- The second element represents Bob's selection.
- Append Bob's element first, followed by Alice's element.

✦ Repeat until all elements are processed.

## ✦ Example

**Input:**
`nums = [5, 4, 2, 3]`

**After Sorting:**
`[2, 3, 4, 5]`

**Pair Processing:**
- Round 1: `[2, 3]` → `[3, 2]`
- Round 2: `[4, 5]` → `[5, 4]`

**Output:**
`[3, 2, 5, 4]`

## ✦ Complexity Analysis

✦ **Time Complexity:** `O(n log n)` — Sorting the array.

✦ **Space Complexity:** `O(n)` — Storing the resulting array.

## ✦ Key Takeaway

A simple sorting operation followed by adjacent pair swapping efficiently reproduces the game's selection and insertion rules.

## ✦ Implementations

- `Solution.java` — Java implementation.
- `Solution.py` — Python implementation.

---

✦ **Day 470 — Another problem solved, another step forward!** 🚀
