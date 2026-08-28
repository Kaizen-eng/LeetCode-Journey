# 🚁 LeetCode 4024 — Nearest Available Drone

## 🧩 Problem

You are given a 2D integer array `drones`, where:

- `drones[i][0]` = x-coordinate
- `drones[i][1]` = y-coordinate
- `drones[i][2]` = maximum travel range

You are also given a target coordinate `target = [tx, ty]`.

A drone can reach the target if its Manhattan distance from the target is less than or equal to its range.

Return the index of the reachable drone with the minimum Manhattan distance.

If multiple drones have the same minimum distance, return the smallest index.

If no drone can reach the target, return `-1`.

## 💡 Approach

For every drone:

1. Calculate its Manhattan distance from the target:
   `|x - tx| + |y - ty|`
2. Check whether the distance is within the drone's range.
3. If it is reachable and its distance is smaller than the current minimum, update the answer.
4. Use a strict `<` comparison so that in case of a tie, the earlier index remains selected.

## ⏱️ Complexity

- **Time:** O(n)
- **Space:** O(1)

## ✦ Key Takeaway

A single traversal is enough.

By maintaining the minimum distance and corresponding index, we can find the nearest reachable drone without sorting or using extra data structures.
