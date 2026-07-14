# Day 342 - LeetCode 1929: Concatenation of Array

## 📌 Problem
Given an integer array `nums` of length `n`, return an array `ans` of length `2n` where:

- `ans[i] = nums[i]`
- `ans[i + n] = nums[i]`

---

## 💡 Approach 1: Two Loops

### Idea
- Create an answer array of size `2 * n`.
- Copy the original array.
- Copy the array again into the second half.

### Complexity

- Time: **O(n)**
- Space: **O(n)**

---

## ⚡ Approach 2: Single Loop (Modulo)

### Idea

Use one loop from `0` to `2 * n - 1`.

The modulo operator maps every index back to the original array.

```java
ans[i] = nums[i % n];
