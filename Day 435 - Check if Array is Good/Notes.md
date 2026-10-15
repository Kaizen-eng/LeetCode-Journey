# ✦ Notes — LeetCode 2784

## ✦ Core Idea
Use a frequency array to count occurrences of each number.

## ✦ Important Formula
`n = nums.length - 1`

A good array must satisfy:
- `count[i] == 1` for every `i` from `1` to `n - 1`.
- `count[n] == 2`.

## ✦ Example Walkthrough
Input: `[1, 3, 3, 2]`

- `count[1] = 1` ✓
- `count[2] = 1` ✓
- `count[3] = 2` ✓

Result: `true`

## ✦ Common Mistake
Checking only the maximum element's frequency is insufficient. Every smaller number must also appear exactly once.

## ✦ Complexity
- Time: `O(n)`
- Auxiliary space: `O(1)` with a fixed-size frequency array.

## ✦ Recall
Why do we calculate `n` as `nums.length - 1`?

Because the array contains `n + 1` elements, including the repeated maximum.

**Day 435 → CLEARED ✦**
