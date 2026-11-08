
# ✦ LeetCode 2148 - Count Elements With Strictly Smaller and Greater Elements

**Day 459 of My LeetCode Journey** 🚀

## 📌 Problem
Given an integer array `nums`, return the number of elements that have at least one element strictly smaller and at least one element strictly greater than themselves.

🔗 **Problem Link:** [LeetCode 2148](https://leetcode.com/problems/count-elements-with-strictly-smaller-and-greater-elements/)

**Difficulty:** Easy  
**Topics:** Array

## 💡 Approach: Minimum and Maximum

1. Find the minimum and maximum elements in the array.
2. Traverse the array again.
3. Count every element satisfying `min < num < max`.
4. Return the final count.

## 🧪 Example

**Input:**
```text
nums = [11, 7, 2, 15]
```

**Output:**
```text
2
```

**Explanation:**

- 11 has smaller (7, 2) and greater (15) elements.
- 7 has smaller (2) and greater (11, 15).
- 2 has no smaller element.
- 15 has no greater element.

Hence, the answer is 2.

## ⚡ Complexity Analysis

| Complexity | Value |
|---|---|
| Time | O(n) |
| Auxiliary Space | O(1) |

## 💻 Solutions

- Java
- Python

Both implementations use a two-pass approach to achieve linear time complexity.

---

✨ **Day 459 Completed!**

One more problem solved. One more step forward.

**Consistency > Complexity.** 🚀
