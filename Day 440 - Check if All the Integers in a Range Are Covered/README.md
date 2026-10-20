# ✨ 1893. Check if All the Integers in a Range Are Covered

**LeetCode Daily Challenge — Day 440**

🔗 **Problem:** [1893. Check if All the Integers in a Range Are Covered](https://leetcode.com/problems/check-if-all-the-integers-in-a-range-are-covered/)

## 🧩 Problem Statement

Given a 2D integer array `ranges` and two integers `left` and `right`, determine whether **every integer in the inclusive range `[left, right]` is covered by at least one interval**.

An interval `[start, end]` covers an integer `x` if:

`start <= x <= end`

Return `true` if every integer is covered; otherwise, return `false`.

## 💡 Approach — Brute Force

✦ Iterate through every integer from `left` to `right`.

✦ For each integer, check all intervals until a covering interval is found.

✦ If no interval covers the current integer, return `false`.

✦ If every integer is covered, return `true`.

## 🔍 Example

**Input:**

```text
ranges = [[1, 2], [4, 5]]
left = 1
right = 5
```

**Output:**

```text
false
```

**Explanation:**

The target integers are `{1, 2, 3, 4, 5}`.

The intervals cover `{1, 2, 4, 5}`, but integer `3` is missing. Therefore, the answer is `false`.

## ⏱️ Complexity Analysis

Let:
- `n` = number of intervals.
- `m` = number of integers in the target range, `right - left + 1`.

✦ **Time Complexity:** `O(n × m)` — each target integer may be checked against every interval.

✦ **Auxiliary Space Complexity:** `O(1)` — only a few variables are used.

## 🎯 Key Takeaways

✦ Use nested loops to check coverage.

✦ A Boolean flag tracks whether the current integer is covered.

✦ The `break` statement avoids unnecessary interval checks.

✦ Early return makes it possible to stop as soon as an uncovered integer is found.

✦ Checking the endpoints alone is insufficient; every integer in the range must be covered.

---

🌱 **Day 440 completed — one more problem, one more step forward!**

Consistency builds skill. Keep learning, keep coding, and keep growing. 🚀
