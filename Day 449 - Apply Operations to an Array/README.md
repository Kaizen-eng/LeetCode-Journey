# 🚀 LeetCode 2460 — Apply Operations to an Array

![Day 449](https://img.shields.io/badge/Day-449-orange?style=for-the-badge)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=for-the-badge)
![Language](https://img.shields.io/badge/Primary%20Language-Java-orange?style=for-the-badge)
![Topic](https://img.shields.io/badge/Topic-Array%20%7C%20Simulation-blue?style=for-the-badge)

🔗 **Problem:** [2460. Apply Operations to an Array](https://leetcode.com/problems/apply-operations-to-an-array/)

## 📌 Problem Summary

Given an integer array `nums`, perform the following operations sequentially from left to right:

1. If `nums[i] == nums[i + 1]`, double `nums[i]` and set `nums[i + 1]` to `0`.
2. After processing all adjacent pairs, move every zero to the end while preserving the relative order of nonzero elements.
3. Return the modified array.

**Important:** Operations happen sequentially, and newly created zeros can affect later comparisons.

## 🧪 Examples

**Example 1**

```text
Input:  nums = [1,2,2,1,1,0]
Output:       [1,4,2,0,0,0]
```

**Example 2**

```text
Input:  nums = [0,1]
Output:       [1,0]
```

## 💡 Approach — Simulation + Two Pointers

### Step 1: Apply Operations

Traverse the array from index `0` to `n - 2`. Whenever two adjacent elements are equal, double the current element and set the next element to zero.

### Step 2: Move Nonzero Elements

Use a write pointer to place every nonzero element at the front of the same array, preserving its order.

### Step 3: Fill Remaining Positions

Fill all positions after the nonzero elements with zeros.

This approach modifies the original array in place and avoids creating an additional array.

## 📊 Complexity Analysis

| Metric | Complexity |
|---|---|
| Time Complexity | `O(n)` |
| Auxiliary Space | `O(1)` |

We perform a constant number of linear traversals and modify the array in place.

## 🧠 Key Learnings

- Simulate operations in the exact order specified.
- Newly created zeros can participate in subsequent comparisons.
- A write pointer efficiently compacts nonzero elements.
- Preserve the relative order of nonzero elements.
- In-place array manipulation can achieve linear time and constant auxiliary space.

## 🏆 Quest Log

**Day 449 completed — one more problem, one more lesson!**

Every problem solved is another step toward stronger problem-solving skills and a better future in software engineering.

*Stay consistent. Keep learning. Keep building.* 🚀

#LeetCode #Java #Python #DSA #ProblemSolving #Day449
