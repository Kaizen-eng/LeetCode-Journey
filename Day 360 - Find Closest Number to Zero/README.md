# Day 360 - Find Closest Number to Zero

## 📌 Problem
**LeetCode 2239 - Find Closest Number to Zero**

### 📝 Problem Statement
Given an integer array `nums`, return the number with the value closest to `0`.

If there are multiple answers, return the number with the largest value.

---

## 💡 Approach

- Initialize the result with the first element.
- Traverse the array once.
- Compare the absolute values to determine which number is closer to zero.
- If two numbers have the same absolute value, choose the larger one.
- Return the final result.

---

## ⏱️ Complexity

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

---

## 🎯 Key Learning

Always preserve the original value when the sign matters. Compare the absolute values for distance from zero, but store the actual number so tie-breaking works correctly.
