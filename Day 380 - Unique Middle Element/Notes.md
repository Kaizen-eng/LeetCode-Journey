# Notes — Unique Middle Element

✦ The array length is guaranteed to be **odd**, so a unique middle position always exists.

✦ The middle index is:

`nums.length / 2`

✦ The middle value is:

`nums[nums.length / 2]`

✦ We only need to count how many times this particular value occurs.

✦ A simple enhanced `for` loop is enough because no extra data structure is required.

## Important Point

The question is **not** asking whether every element in the array is unique.

We only need to check whether the **middle element** occurs exactly once.

## Complexity

✦ **Time:** O(n) — the array is traversed once.

✦ **Space:** O(1) — only a counter and existing array data are used.

## Pattern

**Find target → Traverse → Count → Check frequency**
