
# ✦ LeetCode 1608 — Special Array With X Elements Greater Than or Equal X

## ✦ Problem

Given an array of non-negative integers `nums`, find an integer `x` such that exactly `x` elements in the array are greater than or equal to `x`.

Return `x` if such an integer exists; otherwise, return `-1`.

## ✦ Approach — Frequency Counting

1. Calculate the length of the array `n`.
2. Create a frequency array of size `n + 1`.
3. Count the occurrences of each number, grouping all values greater than or equal to `n` into bucket `n`.
4. Traverse the frequency array backwards while maintaining a cumulative count.
5. For each candidate `x`, check whether the cumulative count equals `x`.
6. Return `x` if the condition is satisfied; otherwise, return `-1`.

## ✦ Example

**Input:**
```text
nums = [0, 4, 3, 0, 4]
```

**Output:**
```text
3
```

**Explanation:**

There are exactly 3 elements greater than or equal to 3:

`4, 3, 4`

Therefore, `x = 3` is the special value.

## ✦ Complexity Analysis

- **Time Complexity:** O(n)
  - Building the frequency array takes O(n).
  - Traversing the frequency array takes O(n).

- **Space Complexity:** O(n)
  - An additional frequency array of size n + 1 is used.

## ✦ Key Takeaway

Frequency counting combined with suffix accumulation helps efficiently solve counting-based array problems without repeatedly traversing the original array.

---

**Day 452 Completed! 🚀**
