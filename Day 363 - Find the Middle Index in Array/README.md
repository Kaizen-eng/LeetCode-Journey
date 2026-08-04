# Day 363 - Find the Middle Index in Array

## 🔗 Problem
LeetCode 1991 - Find the Middle Index in Array

## 🎯 Approach
- Calculated the total sum of the array.
- Maintained a running `leftSum`.
- Computed `rightSum` using:
  ```java
  rightSum = totalSum - leftSum - nums[i];
  ```
- Compared `leftSum` and `rightSum` to find the leftmost middle index.

## ⏱️ Complexity
- Time Complexity: **O(n)**
- Space Complexity: **O(1)**

## 💡 Key Learning
Instead of recalculating left and right sums for every index, the total sum can be used to derive the right sum efficiently.

Formula:

```
Right Sum = Total Sum - Left Sum - Current Element
```

---
Day 363 of my DSA consistency journey. 🚀
