# ✦ Notes — 2974. Minimum Number Game

## ✦ Core Observation

The game always removes the two smallest remaining elements in each round.

Since Bob appends his element before Alice, every consecutive sorted pair must be reversed in the result.

## ✦ Step-by-Step Logic

1. Sort `nums` in ascending order.
2. Initialize an empty result array `arr`.
3. Iterate through the sorted array with a step size of 2.
4. Pick two consecutive elements:
   - `Alice = nums[i]`
   - `Bob = nums[i + 1]`
5. Append Bob first.
6. Append Alice second.
7. Return `arr`.

## ✦ Dry Run

**Input:** `[5, 4, 2, 3]`

**Step 1 — Sorting**

`[2, 3, 4, 5]`

**Step 2 — Pair Processing**

| Round | Alice | Bob | Result |
|---|---:|---:|---|
| 1 | 2 | 3 | `[3, 2]` |
| 2 | 4 | 5 | `[3, 2, 5, 4]` |

**Final Output:**

`[3, 2, 5, 4]`

## ✦ Important Code Concepts

**Java:**
- `Arrays.sort(nums)` — Sorts the array.
- `i += 2` — Processes two elements per iteration.
- `arr[i]` and `arr[i + 1]` — Stores elements in reversed pair order.

**Python:**
- `nums.sort()` — Sorts the list in place.
- `range(0, len(nums), 2)` — Iterates with a step size of 2.
- `append()` — Adds elements to the result list.

## ✦ Common Mistake

❌ Using `i++` in Java or a default step of `1` in Python.

This causes overlapping pairs and incorrect results.

✅ Correct iteration:

Java: `i += 2`

Python: `range(0, len(nums), 2)`

## ✦ Complexity

- **Time:** `O(n log n)`
- **Space:** `O(n)` including the resulting array.

## ✦ Final Learning

Whenever an algorithm processes elements in groups of two, remember to advance the iteration by two.

**Sort → Pair → Reverse → Append → Return**

✦ Day 470 completed! Keep learning, keep building. 🚀
