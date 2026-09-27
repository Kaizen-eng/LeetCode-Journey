# LeetCode 2656 — Maximum Sum With Exactly K Elements

## Problem Overview

Given a 0-indexed integer array `nums` and an integer `k`, perform the following operation exactly `k` times:

1. Select an element `m` from `nums`.
2. Remove `m`.
3. Add `m + 1` to the array.
4. Increase the score by `m`.

Return the maximum possible score.

---

## Example

### Example 1

```text
Input:  nums = [1,2,3,4,5], k = 3
Output: 18
```

Choose `5`, then `6`, then `7`.

```text
Score = 5 + 6 + 7 = 18
```

---

# Approach 1 — Sorting + Simulation

### Idea

The best choice at every operation is the current maximum.

If the maximum is `M`:

- First operation contributes `M`.
- The selected value is replaced by `M + 1`.
- The next operation can therefore contribute `M + 1`.
- This continues for exactly `k` operations.

So after sorting, we can repeatedly use the last element as the current maximum.

### Complexity

- **Time:** `O(n log n)`
- **Space:** `O(log n)` auxiliary stack space for the primitive-array sort implementation.

See [`Solution1.java`](Solution1.java).

---

# Approach 2 — Optimized Mathematical Solution

## Key Observation

Sorting is unnecessary.

We only need the maximum value `M`.

The optimal sequence of selected values is:

```text
M, M + 1, M + 2, ..., M + k - 1
```

This is an arithmetic progression.

Its sum is:

```text
M + (M + 1) + ... + (M + k - 1)
```

Using the arithmetic-series formula:

```text
Answer = k * M + k * (k - 1) / 2
```

Therefore, we only need one pass through the array to find `M`.

### Complexity

- **Time:** `O(n)`
- **Space:** `O(1)`

See [`Solution2.java`](Solution2.java).

---

# Comparison

| Approach | Main Idea | Time | Space |
|---|---|---:|---:|
| Solution 1 | Sort + simulate | `O(n log n)` | `O(log n)`* |
| Solution 2 | Find max + arithmetic formula | **`O(n)`** | **`O(1)`** |

\*Auxiliary stack space depends on the Java implementation of primitive-array sorting.

## Takeaway

The first solution is straightforward and accepted, but the second solution exposes the underlying mathematical pattern.

The important optimization is recognizing that the optimal choices always form:

```text
M, M + 1, M + 2, ..., M + k - 1
```

Once that pattern is visible, the sorting step disappears completely.

---

## Files

- `Solution1.java` — Sorting + simulation
- `Solution2.java` — Optimized O(n) mathematical solution
- `Notes.md` — Detailed reasoning and optimization notes
