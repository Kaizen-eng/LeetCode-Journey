# Day 341 - Relative Sort Array

## 📌 Problem

**LeetCode 1122 - Relative Sort Array**

Given two arrays `arr1` and `arr2`, sort `arr1` such that:
- Elements appearing in `arr2` come first and follow the same relative order as in `arr2`.
- Remaining elements are placed at the end in ascending order.

---

## 💡 Approach

This solution uses a **HashMap** to store the frequency of each element in `arr1`.

### Algorithm

1. Count the frequency of every element using a `HashMap`.
2. Traverse `arr2` and place each element into the answer array according to its frequency.
3. Remove processed elements from the map.
4. Extract the remaining keys from the map.
5. Sort the remaining keys.
6. Append the remaining elements according to their frequencies.

---

## ⏱️ Time Complexity

- Building HashMap: **O(n)**
- Processing `arr2`: **O(m)**
- Sorting remaining keys: **O(k log k)**

Overall:

O(n + m + k log k)

where:
- **n** = size of `arr1`
- **m** = size of `arr2`
- **k** = number of distinct remaining elements

---

## 💾 Space Complexity

O(n)

---

## 🚀 Language

Java
