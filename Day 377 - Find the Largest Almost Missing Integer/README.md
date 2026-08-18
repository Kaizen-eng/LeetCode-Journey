# Day 377 - Find the Largest Almost Missing Integer

## Problem

Given an integer array `nums` and an integer `k`, find the **largest almost missing integer**.

An integer is considered **almost missing** if it appears in exactly one subarray of length `k`.

If no such integer exists, return `-1`.

## Approach

I used **Frequency Counting + Observation**.

First, I count the frequency of every number using a frequency array.

The important observation is based on the value of `k`:

### Case 1: `k == nums.length`

There is only one subarray of length `k`.

Therefore, every number appears in exactly one subarray, so the answer is simply the **maximum element**.

### Case 2: `k == 1`

Every element forms its own subarray.

Therefore, a number is almost missing only when its frequency in `nums` is exactly `1`.

So, I find the largest number with frequency `1`.

### Case 3: `1 < k < nums.length`

Only the **first** and **last** elements can belong to exactly one subarray of length `k`.

So I check:

```java
freq[nums[0]] == 1
freq[nums[nums.length - 1]] == 1
```

and take the larger valid value.

## Complexity

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

The frequency array has a fixed size of `51` because `nums[i]` is between `1` and `50`.

## Key Takeaway

Sometimes the biggest optimization isn't a complicated data structure — it's simply noticing **which elements can actually satisfy the condition**. 🧠🔥

## Progress

**Day 377 — Quest Cleared ⚔️🔥**
