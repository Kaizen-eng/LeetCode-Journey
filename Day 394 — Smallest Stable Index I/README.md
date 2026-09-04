# ✦ Day 394 — Smallest Stable Index I

## 🧩 Problem
**LeetCode – Smallest Stable Index I**

Given an array `nums` and an integer `k`, find the smallest stable index `i` where:

`max(nums[0..i]) - min(nums[i..n-1]) <= k`

If no stable index exists, return `-1`.

## 💡 Approach

For every index `i`:

1. Find the maximum from index `0` to `i`.
2. Find the minimum from index `i` to `n - 1`.
3. Calculate their difference.
4. If the difference is less than or equal to `k`, return `i`.

### ✦ Important Java Detail

`Arrays.stream(array, start, end)` uses:

- `start` → inclusive
- `end` → exclusive

Therefore:

```java
Arrays.stream(nums, 0, i + 1)
```

is required to include index i.
For the suffix:
Arrays.stream(nums, i, nums.length)

##⏱️ Complexity

- Time: O(n²)
- Space: O(1) auxiliary space

##🎯 Key Learning

Understanding inclusive vs exclusive ranges is essential when working with Java Streams.
