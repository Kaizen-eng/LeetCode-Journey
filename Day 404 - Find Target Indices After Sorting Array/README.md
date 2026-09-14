# LeetCode 2089 — Find Target Indices After Sorting Array

## 📌 Problem

Given a 0-indexed integer array `nums` and an integer `target`, return a list of the target indices after sorting `nums` in non-decreasing order.

A target index is an index `i` such that:

`nums[i] == target`

The returned list must be sorted in increasing order.

---

## 💡 Approach 1 — Sort + Scan

The straightforward approach is to first sort the array using `Arrays.sort()`.

After sorting, traverse the array and collect every index where the value equals `target`.

### Steps

✦ Sort `nums` in non-decreasing order.

✦ Traverse the sorted array.

✦ If `nums[i] == target`, add `i` to the result list.

✦ Return the result.

### Complexity

- **Time:** `O(n log n)`
- **Space:** `O(log n)` auxiliary space for sorting

---

## 🚀 Approach 2 — Count Smaller + Equal

Sorting is actually unnecessary.

After sorting:

- Every element smaller than `target` appears before the target.
- Therefore, the number of elements smaller than `target` gives the **first target index**.
- If there are `k` occurrences of `target`, the target occupies `k` consecutive indices.

### Steps

✦ Count how many elements are smaller than `target`.

✦ Count how many elements are equal to `target`.

✦ Starting from `smaller`, generate `equal` consecutive indices.

### Complexity

- **Time:** `O(n)`
- **Space:** `O(k)` for the returned result

Where `k` is the number of occurrences of `target`.

---

## 🏆 Optimization

| Approach | Time | Idea |
|----------|------|------|
| Solution 1 | `O(n log n)` | Sort and scan |
| Solution 2 | `O(n)` | Count smaller and equal elements |

### Key Insight

**We don't need to perform an operation just because the problem statement describes its result.**

Instead of actually sorting the array, we can determine exactly where the target would appear after sorting by counting the elements smaller than it.

---

## 🔗 LeetCode

Problem: **2089. Find Target Indices After Sorting Array**

Difficulty: **Easy**

Language: **Java**
