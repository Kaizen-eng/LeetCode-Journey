# Day 357 - Destination City

> **LeetCode 1436** | **Difficulty:** Easy

## 📝 Problem Statement

You are given an array `paths`, where `paths[i] = [cityA, cityB]` represents a direct path from `cityA` to `cityB`.

Return the **destination city**, which is the city without any outgoing path.

---

## 💡 Approach

The destination city is the only city that **never appears as a starting city**.

### Algorithm

1. Create a `HashSet` to store all starting cities.
2. Traverse the paths and insert every source city into the set.
3. Traverse the paths again.
4. If a destination city is **not present** in the set, return it.

---

## ✅ Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(n)`

---

## 🚀 Key Takeaway

When a problem asks questions like:

- Have I seen this before?
- Does this value exist?
- Is this element unique?

A **HashSet** is usually the right data structure because of its constant-time lookup.
