
# 📝 Notes - LeetCode 2148

## ✦ Intuition

An element is valid only if there exists at least one element strictly smaller and at least one element strictly greater than it.

Instead of checking every element against all other elements, we can use the minimum and maximum values of the array.

Any element strictly between the minimum and maximum automatically satisfies both conditions.

## ✦ Key Observations

1. The minimum element cannot be counted because no element is strictly smaller than it.
2. The maximum element cannot be counted because no element is strictly greater than it.
3. Duplicate values must be counted individually if they satisfy the condition.
4. If all elements are equal, the answer is 0.

## ✦ Algorithm

1. Initialize minimum to Integer.MAX_VALUE.
2. Initialize maximum to Integer.MIN_VALUE.
3. Traverse the array to find both values.
4. Initialize count = 0.
5. Traverse the array again.
6. If `num > min && num < max`, increment count.
7. Return count.

## ✦ Complexity Analysis

**Time Complexity: O(n)**

- First traversal finds minimum and maximum: O(n).
- Second traversal counts valid elements: O(n).
- Overall: O(n).

**Auxiliary Space Complexity: O(1)**

Only a constant number of variables are used.

## ✦ Important Takeaway

We don't need nested loops to determine whether an element has smaller and greater elements.

The global minimum and maximum are sufficient to solve this problem efficiently.

**Remember:** Count occurrences, not unique values!

---

✦ Day 459 — Learning through consistency! 🚀
