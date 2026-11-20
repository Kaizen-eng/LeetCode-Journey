# ✦ LeetCode Day 471 — 3200. Maximum Height of a Triangle

![Day](https://img.shields.io/badge/Day-471-blueviolet?style=for-the-badge)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=for-the-badge)
![Language](https://img.shields.io/badge/Java%20%7C%20Python-Implemented-orange?style=for-the-badge)
![Topic](https://img.shields.io/badge/Topic-Greedy%20%7C%20Simulation-ff69b4?style=for-the-badge)

## ✦ Problem Overview

You are given two integers:

- `red` — Number of red balls.
- `blue` — Number of blue balls.

Build a triangle where:

✦ The first row contains 1 ball.

✦ Every subsequent row contains one more ball than the previous row.

✦ Each row must contain balls of only one colour.

✦ Adjacent rows must have different colours.

**Objective:** Return the maximum possible height of the triangle.

🔗 **Problem Link:** https://leetcode.com/problems/maximum-height-of-a-triangle/

## ✦ Approach — Greedy Simulation

The key observation is that the number of balls required increases by one after every successful row.

✦ Start by assuming Red is used in the first row.

✦ Alternate between Red and Blue for every subsequent row.

✦ Check whether the selected colour has enough balls to complete the current row.

✦ If enough balls are available, deduct the required number of balls and increase the row requirement.

✦ Stop when the selected colour cannot complete the next row.

✦ Repeat the simulation starting with Blue.

✦ Return the maximum height from both simulations.

## ✦ Example

**Input:**
`red = 7, blue = 3`

**Starting with Red:**

- Row 1 → Red (1 ball)
- Row 2 → Blue (2 balls)
- Row 3 → Red (3 balls)
- Row 4 → Blue (4 balls) — Not enough balls.

**Maximum Height:** 3

## ✦ Complexity Analysis

✦ **Time Complexity:** `O(√(red + blue))` — Each simulation builds rows with progressively increasing ball requirements.

✦ **Auxiliary Space Complexity:** `O(1)` — Only a few variables are used.

## ✦ Key Takeaways

- Greedy simulation can simplify problems involving progressively increasing requirements.
- Always consider both possible starting colours.
- Use a boolean variable to alternate between two states.
- Check resource availability before performing an operation.

## ✦ Implementations

- `Solution.java` — Java implementation using a helper method.
- `Solution.py` — Python implementation using a helper function.

---

✦ **Day 471 — Think logically. Simulate carefully. Keep progressing!** 🚀
