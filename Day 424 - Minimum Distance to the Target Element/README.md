# ✦ LeetCode 1848 — Minimum Distance to the Target Element

**Difficulty:** Easy  
**Topic:** Array  
**Language:** Java

## ✦ Problem Statement

Given an integer array `nums`, a target value `target`, and a starting index `start`, find the minimum absolute distance between `start` and any index containing `target`.

Return the minimum value of `|i - start|` such that `nums[i] == target`.

## ✦ Approach — Linear Search

✦ Traverse the array using a `for` loop.

✦ Check whether the current element equals `target`.

✦ If a match is found, calculate the absolute index distance using `Math.abs(i - start)`.

✦ Update the minimum distance using `Math.min()`.

✦ Return the minimum distance after traversing the array.

## ✦ Example

**Input:**
```text
nums = [1, 2, 3, 4, 5]
target = 5
start = 3
```

**Output:**
```text
1
```

**Explanation:** The target occurs at index `4`. The minimum distance is `|4 - 3| = 1`.

## ✦ Complexity Analysis

✦ **Time Complexity:** `O(n)` — the array is traversed once.

✦ **Space Complexity:** `O(1)` — only a constant amount of extra space is used.

## ✦ Key Takeaway

Distinguish between an element's **value** and its **index**. This problem minimizes the distance between indices, not the difference between array values.
