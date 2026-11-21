# ✦ Day 472 - 2956. Find Common Elements Between Two Arrays

![Day](https://img.shields.io/badge/Day-472-blueviolet?style=for-the-badge)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=for-the-badge)
![Language](https://img.shields.io/badge/Language-Java-orange?style=for-the-badge)
![Topic](https://img.shields.io/badge/Topic-HashSet-blue?style=for-the-badge)

## ✦ Problem Overview

Given two integer arrays, `nums1` and `nums2`, return an integer array containing two values:

✦ `answer[0]` → Number of elements in `nums1` that are also present in `nums2`.

✦ `answer[1]` → Number of elements in `nums2` that are also present in `nums1`.

**Important:** Duplicate elements are counted separately.

## ✦ Example

**Input:**
```java
nums1 = [4, 3, 2, 3]
nums2 = [3, 2, 5, 4]
```

**Output:**
```java
[4, 3]
```

## ✦ Approach — HashSet

✦ Store the elements of the second array in a `HashSet`.

✦ Traverse the first array and check whether each element exists using `contains()`.

✦ Increment the counter whenever a match is found.

✦ Repeat the process by swapping the arrays.

✦ Return both counts in an integer array.

## ✦ Complexity Analysis

✦ **Time Complexity:** O(n + m) — Both arrays are traversed twice in total.

✦ **Auxiliary Space Complexity:** O(max(n, m)) — The HashSet stores unique elements, with only one set existing at a time.

## ✦ Key Takeaway

`HashSet` provides efficient membership checking while allowing duplicate elements in the original array to be counted independently.

---

**✦ Day 472 completed! Another problem solved, another step forward.** 🚀
