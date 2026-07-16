# Day 344 – Sum of Unique Elements

## 📌 Problem

Given an integer array `nums`, return the sum of all elements that appear exactly once.

## 🧠 Approaches

### 🥉 Approach 1 – Brute Force

* For every element, count its occurrences by traversing the entire array.
* If the count is exactly `1`, add it to the answer.

**Time Complexity:** `O(n²)`
**Space Complexity:** `O(1)`

---

### 🥈 Approach 2 – HashMap

* Store the frequency of every element in a `HashMap`.
* Traverse the array again and sum only the elements whose frequency is `1`.

**Time Complexity:** `O(n)`
**Space Complexity:** `O(n)`

---

### 🥇 Approach 3 – Frequency Array

Since the constraints guarantee:

```text
1 <= nums[i] <= 100
```

Use a frequency array of size `101` instead of a `HashMap`.

This removes hashing overhead while keeping the solution simple and efficient.

**Time Complexity:** `O(n)`
**Space Complexity:** `O(1)`

---

## 🌱 Key Takeaway

Optimization isn't always about using more advanced data structures.

Understanding the problem constraints can often lead to an even simpler and more efficient solution.

Today's journey reinforced an important pattern:

* Frequency problem?
* Check the constraints.
* Small value range → Frequency Array.
* Large or unknown value range → HashMap.
