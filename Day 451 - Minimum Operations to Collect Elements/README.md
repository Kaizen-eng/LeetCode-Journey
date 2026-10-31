# ✦ Day 451 — 2869. Minimum Operations to Collect Elements

**Platform:** LeetCode  
**Difficulty:** Easy  
**Topics:** Array, Hash Set  
**Languages:** Java ☕ | Python 🐍

---

## ✦ Problem Summary

Given an integer array `nums` and an integer `k`, we can perform operations by removing elements from the end of the array.

Our objective is to collect all integers from `1` to `k` using the minimum number of operations.

Return the minimum number of operations required.

## ✦ Approach — Reverse Traversal

Instead of modifying the array, traverse it from right to left.

- Use a Boolean array to track collected elements.
- Maintain a counter for distinct required elements.
- Increment the operation count for every visited element.
- Ignore duplicates and elements greater than `k`.
- Return immediately when all `k` required elements are collected.

## ✦ Example

**Input:**
```text
nums = [3,1,5,4,2]
k = 2
```

**Traversal:**
```text
2 → 4 → 5 → 1
```

**Output:**
```text
4
```

The required elements `1` and `2` are collected after four operations.

## ✦ Complexity Analysis

| Complexity | Value | Explanation |
|---|---|---|
| Time | O(n + k) | Boolean array initialization and reverse traversal |
| Space | O(k) | Boolean array for tracking collected elements |

## ✦ Key Takeaway

Reverse traversal helps us simulate the removal process without actually modifying the array.

Tracking distinct elements ensures that duplicates do not affect our collection count.

---

**451 Days of Consistency. One Problem at a Time.** 🚀

*Keep Learning. Keep Building. Keep Growing.* ✦
