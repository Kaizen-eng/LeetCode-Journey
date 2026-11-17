# ✦ LeetCode 3046 — Split the Array

![Day](https://img.shields.io/badge/Day-468-blueviolet?style=for-the-badge)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=for-the-badge)
![Language](https://img.shields.io/badge/Java%20%7C%20Python-Implemented-orange?style=for-the-badge)

## ✦ Problem Statement

You are given an integer array `nums` of even length.

Your task is to split the array into two arrays, `nums1` and `nums2`, such that:

- Both arrays have equal lengths.
- Each array contains distinct elements.
- Every element from the original array belongs to exactly one of the two arrays.

Return `true` if such a split is possible. Otherwise, return `false`.

🔗 **Problem Link:** [LeetCode 3046 — Split the Array](https://leetcode.com/problems/split-the-array/)

---

## ✦ Approach — Frequency Counting

We can solve this problem efficiently using a **HashMap**.

The key observation is that no number can appear more than twice in the original array.

- If a number appears once, it can be placed in either array.
- If a number appears twice, one occurrence must go into each array.
- If a number appears more than twice, a valid split becomes impossible.

Therefore, we traverse the array and maintain the frequency of every element.

If any element's frequency exceeds `2`, return `false`.

Otherwise, return `true` after completing the traversal.

---

## ✦ Example

**Input:**
```text
nums = [1, 1, 2, 2, 3, 4]
```

**Output:**
```text
true
```

**Explanation:**

One valid split is:

```text
nums1 = [1, 2, 3]
nums2 = [1, 2, 4]
```

Both arrays have equal lengths and contain distinct elements.

---

## ✦ Complexity Analysis

| Complexity | Value | Explanation |
|---|---|---|
| Time | O(n) | Single traversal of the array |
| Space | O(n) | HashMap stores element frequencies |

---

## ✦ Key Takeaway

**Frequency Counting** helps us determine whether a valid split exists without explicitly constructing the two arrays.

A number appearing more than twice makes the split impossible.

---

⭐ **Day 468 completed!**

*One problem at a time. One step closer to mastery.* ✦
