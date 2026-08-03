# Day 362 - Find the Distance Value Between Two Arrays

## 🔗 Problem
**LeetCode 1385 - Find the Distance Value Between Two Arrays**

## 📝 Problem Statement
Given two integer arrays `arr1` and `arr2`, and an integer `d`, return the distance value between the two arrays.

The distance value is defined as the number of elements in `arr1` such that there is **no** element in `arr2` where:

```
|arr1[i] - arr2[j]| <= d
```

---

## 💡 Approach

- Iterate through every element of `arr1`.
- For each element, check every element in `arr2`.
- If any element satisfies the distance condition, mark it using a boolean flag.
- Break immediately to avoid unnecessary comparisons.
- Count only those elements for which no such value exists.

---

## ⏱️ Complexity

- **Time Complexity:** `O(n × m)`
- **Space Complexity:** `O(1)`

---

## 🚀 Concepts Practiced

- Arrays
- Nested Loops
- Boolean Flag
- Early Exit (`break`)
- Problem Analysis
