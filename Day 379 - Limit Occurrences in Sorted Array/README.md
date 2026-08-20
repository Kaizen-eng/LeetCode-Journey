# LeetCode 3940: Limit Occurrences in Sorted Array

✦ **Day 379 — LeetCode Journey**

## ✦ Problem

Given a sorted integer array `nums` and an integer `k`, return an array such that each distinct element appears at most `k` times while preserving the relative order of the elements.

If a distinct element appears at least `k` times, it must appear exactly `k` times in the result.

## ✦ Example 1

**Input:**
```text
nums = [1,1,1,2,2,3], k = 2
```

**Output:**
```text
[1,1,2,2,3]
```

## ✦ Example 2

**Input:**
```text
nums = [1,2,3], k = 1
```

**Output:**
```text
[1,2,3]
```

## ✦ Approach

✦ Count the frequency of every element using a `HashMap`.

✦ For each distinct element, keep only `Math.min(frequency, k)` occurrences.

✦ Create the result array with the required size.

✦ Fill the result array with the allowed number of occurrences.

✦ Sort the result array to maintain the sorted order.

## ✦ Complexity

- **Time:** `O(n + r log r)`
- **Space:** `O(n)`

Where `n` is the length of `nums` and `r` is the length of the resulting array.

## ✦ Status

✅ Solved

- **Day:** 379
- **Language:** Java
- **Topic:** Array, HashMap, Frequency Counting
