# ✦ LeetCode 1566 — Detect Pattern of Length M Repeated R or More Times

**Day 454 | LeetCode Daily Challenge**

- **Difficulty:** Easy
- **Topics:** Array
- **Languages:** Java & Python

---

## 📝 Problem Description

Given an integer array `arr` and two integers `m` and `k`, determine whether there exists a pattern of length `m` that is repeated consecutively at least `k` times.

A pattern is a sequence of `m` elements that appears continuously without interruption.

Return `true` if such a pattern exists; otherwise, return `false`.

## 💡 Approach — Direct Element Comparison

Instead of creating a separate array to store the pattern, we can compare elements directly.

1. Iterate through every possible starting index.
2. Compare each element with the element exactly `m` positions ahead.
3. Continue for `m * (k - 1)` comparisons.
4. If all comparisons match, the pattern repeats at least `k` times.
5. Otherwise, check the next starting position.

This avoids using extra space for storing the pattern.

## 🔍 Examples

**Example 1**

```text
Input:
arr = [1,2,4,4,4,4]
m = 1, k = 3

Output: true
```

Explanation: The pattern `[4]` repeats four consecutive times.

**Example 2**

```text
Input:
arr = [1,2,1,2,1,1,1,3]
m = 2, k = 2

Output: true
```

Explanation: The pattern `[1,2]` repeats twice consecutively.

**Example 3**

```text
Input:
arr = [1,2,1,2,1,3]
m = 2, k = 3

Output: false
```

Explanation: The pattern `[1,2]` repeats only twice, which is less than the required three times.

## ⏱️ Complexity Analysis

Let `n` be the length of the array.

- **Time Complexity:** `O(n × m × k)` — We examine possible starting positions and perform up to `m × (k - 1)` comparisons.
- **Space Complexity:** `O(1)` — No additional data structures are used.

## ✦ Key Takeaway

Comparing elements at a fixed offset can help identify repeated consecutive patterns without creating additional arrays.

**Day 454 completed! ✦**

One problem at a time. One step closer to mastery.
