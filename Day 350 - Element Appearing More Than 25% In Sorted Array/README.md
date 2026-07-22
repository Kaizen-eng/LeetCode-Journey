# Day 350 - Element Appearing More Than 25% In Sorted Array

## 📌 Problem Statement
Given a sorted integer array, return the element that appears more than 25% of the time.

---

## 💭 Approach 1: Single Pass Frequency Count

### 🔹 Intuition
Since the array is sorted, identical elements appear consecutively. We can traverse the array once, count consecutive occurrences, and return the element as soon as its frequency becomes greater than `n / 4`.

### 🔹 Algorithm
1. Initialize a counter to track consecutive occurrences.
2. Traverse the array from left to right.
3. If the current element matches the previous one, increment the counter.
4. Otherwise, reset the counter to `1`.
5. As soon as the counter becomes greater than `n / 4`, return that element.

### ⏱️ Complexity Analysis
- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

---

## 💭 Approach 2: Sorted Array Observation

### 🔹 Intuition
If an element appears more than `25%` of the time, then there must exist an index `i` such that:

`arr[i] == arr[i + n/4]`

This works because the array is sorted, so repeated elements occupy consecutive positions.

### 🔹 Algorithm
1. Calculate `k = n / 4`.
2. Traverse the array until `n - k`.
3. Compare `arr[i]` with `arr[i + k]`.
4. Return the matching element immediately.

### ⏱️ Complexity Analysis
- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

---

## 🌟 Key Takeaway
Sometimes the biggest optimization doesn't require a new data structure—it comes from carefully observing the properties already given in the problem. Here, the sorted nature of the array made the solution much simpler and more elegant.
