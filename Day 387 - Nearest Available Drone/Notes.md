# 📝 Notes — LeetCode 4024

## ✦ Key Observation

The important part of the problem is the **Manhattan distance**:

`|x1 - x2| + |y1 - y2|`

For each drone, we calculate its distance from the target and compare it with the drone's available range.

A drone is reachable only when:

`distance <= range`

---

## 🔍 What We Need To Check

For every drone:

1. Calculate Manhattan distance.
2. Check whether the drone can reach the target.
3. If reachable, compare its distance with the current minimum.

We do **not** need to sort the drones.

We also do **not** need to modify the input array.

---

## 🎯 Handling Ties

The problem requires the smallest index when multiple reachable drones have the same minimum distance.

Using:

`if (dist < nearest_dist)`

instead of:

`if (dist <= nearest_dist)`

automatically preserves the first drone encountered.

---

## 🧠 Pattern

This is a simple **minimum-tracking / one-pass traversal** problem.

Maintain:

- `nearest_dist` → smallest reachable distance found so far
- `idx` → index of the corresponding drone

Update them whenever a strictly smaller valid distance is found.

---

## ⏱️ Complexity

- Time: `O(n)`
- Space: `O(1)`

---

## ✦ Key Takeaway

When a problem asks for the minimum/maximum value satisfying a condition, a single traversal with a few tracking variables is often enough.
