# ✦ LeetCode 1636 — Sort Array by Increasing Frequency

## ✦ Problem

Sort the elements of an array according to their frequency.

- Elements with **lower frequency** come first.
- If two elements have the **same frequency**, the **larger element** comes first.

## ✦ Approach

1. Use a `HashMap` to store the frequency of every number.
2. Convert the `int[]` into `Integer[]` so that we can use a custom comparator.
3. Sort the array using two conditions:
   - Frequency → ascending
   - Value → descending when frequencies are equal
4. Copy the sorted values back into the original `int[]`.

## ✦ Key Concept

```text
HashMap
   ↓
Count frequency
   ↓
Custom Comparator
   ↓
Frequency ↑
   ↓
Same frequency → Value ↓
```

## ✦ Complexity

- **Time:** O(n log n)
- **Space:** O(n)

## ✦ Day 398/∞
