# Day 349 - Replace Elements with Greatest Element on Right Side

## 🔗 Problem
**LeetCode 1299 - Replace Elements with Greatest Element on Right Side**

Given an integer array `arr`, replace every element with the greatest element among the elements to its right, and replace the last element with `-1`.

---

## 💡 Approach 1: Brute Force

### Idea
For every element, scan all the elements to its right and find the maximum value.

### Algorithm
1. Traverse every index.
2. Search the remaining elements to find the maximum.
3. Replace the current element with that maximum.
4. Set the last element as `-1`.

### Complexity
- **Time:** O(n²)
- **Space:** O(1)

---

## ⚡ Approach 2: Optimal (Right to Left Traversal)

### Idea
Instead of searching repeatedly, traverse from the end while maintaining the greatest element seen so far.

### Algorithm
1. Initialize `max = -1`.
2. Traverse from right to left.
3. Store the current value.
4. Replace the current element with `max`.
5. Update `max` using the stored value.
6. Return the modified array.

### Complexity
- **Time:** O(n)
- **Space:** O(1)

---

## 🎯 Key Learning

Sometimes, changing the direction of traversal eliminates repeated work completely.

By maintaining the maximum value seen from the right, we avoid scanning the remaining array for every element, reducing the solution from **O(n²)** to **O(n)**.

---

### 💻 Language
- Java ☕

### 🚀 Status
✅ Solved
