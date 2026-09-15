# ✦ Day 405 — LeetCode 2529

## 2529. Maximum Count of Positive Integer and Negative Integer

Given a sorted array `nums`, return the maximum between the number of positive integers and the number of negative integers.

> **Note:** `0` is neither positive nor negative.

---

## ✦ Approaches

### ✦ Solution 1 — Linear Search

Traverse the entire array and count:

- Positive numbers → `num > 0`
- Negative numbers → `num < 0`
- Zero → ignored

Finally, return the maximum of the two counts.

### ✦ Solution 2 — Binary Search

Since the array is sorted, we can use **Binary Search** to find the boundaries between:

`Negative → Zero → Positive`

We use a `lowerBound()` function to find:

- The first index where `nums[i] >= 0`
- The first index where `nums[i] >= 1`

These positions allow us to calculate the negative and positive counts without traversing the entire array.

---

## ✦ Complexity

| Approach | Time | Space |
|----------|------|-------|
| Linear Search | O(n) | O(1) |
| Binary Search | O(log n) | O(1) |

---

## ✦ Key Takeaway

A sorted array often provides an opportunity to replace a complete traversal with **Binary Search**.

Always look for useful properties in the input before deciding on the final approach.

---

## ✦ Files

✦ `Solution1.java` — Linear Search approach  
✦ `Solution2.java` — Binary Search approach  
✦ `Notes.md` — Concepts, observations, and complexity analysis

---

## ✦ LeetCode

**Problem:** 2529. Maximum Count of Positive Integer and Negative Integer

**Difficulty:** Easy
