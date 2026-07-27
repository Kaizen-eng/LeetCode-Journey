# Day 355 - Maximum Product of Two Elements in an Array

## 📌 Problem
Given an integer array `nums`, choose two different indices `i` and `j` such that the value of:

(nums[i] - 1) * (nums[j] - 1)

is maximized.

Return the maximum possible value.

### Example

Input:
nums = [3,4,5,2]

Output:
12

Explanation:
Choose 5 and 4.

(5 - 1) × (4 - 1) = 4 × 3 = 12

---

## 💡 Approach

- Maintain the largest (`max1`) and second largest (`max2`) elements while traversing the array once.
- Whenever a larger element is found:
  - Shift the previous largest to `max2`.
  - Update `max1`.
- Otherwise, if the current element is greater than `max2`, update `max2`.
- Finally return:

(max1 - 1) * (max2 - 1)

---

## ⏱️ Complexity

- Time Complexity: **O(n)**
- Space Complexity: **O(1)**

---

## 🏷️ Tags

Array, Greedy
