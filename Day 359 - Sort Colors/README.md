# Day 359 - Sort Colors

## 📌 Problem
**LeetCode 75 - Sort Colors**

### Difficulty
Medium

## 🧠 Approach
Implemented a simple comparison-based sorting approach using nested loops.

For each element, compare it with the remaining elements and swap whenever the previous element is greater than or equal to the current element. This gradually arranges the array in ascending order.

Although the problem has an optimal one-pass solution (Dutch National Flag Algorithm), this approach is straightforward and helps strengthen sorting fundamentals.

## ⏱️ Complexity

- **Time:** O(n²)
- **Space:** O(1)

## 📚 Key Learning

- Tiny comparison operators (`>=` vs `<=`) can completely change the sorting order.
- Debugging small mistakes is an essential part of becoming a better programmer.
- A correct approach with one small typo can produce an entirely different result.
