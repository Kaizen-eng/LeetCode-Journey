# ✦ LeetCode 1710 — Maximum Units on a Truck

> **Day 428** of the LeetCode journey 🚚📦

## ✦ Problem

You are given several types of boxes. Each box type contains:

- the number of boxes available
- the number of units in each box

A truck can carry at most `truckSize` boxes.

The goal is to **maximize the total number of units** loaded onto the truck.

## ✦ Approach

This problem is a classic **Greedy + Sorting** problem.

1. Sort the box types by **units per box in descending order**.
2. Start with the most valuable boxes.
3. Take as many boxes as the truck can currently carry.
4. Add their units to the answer.
5. Reduce the remaining truck capacity.
6. Stop when the truck is full.

The greedy choice works because every box occupies exactly one truck slot, so using available capacity on the boxes with the highest units per box always gives the best result.

## ✦ Complexity

- **Time:** `O(n log n)` — sorting the box types
- **Space:** `O(log n)` auxiliary space for sorting (implementation dependent)

## ✦ Java

See [`Solution.java`](Solution.java) for the complete implementation.

---

✦ **Praz-Luna Truck Simulator™ — cargo optimized.** 🚚💨
