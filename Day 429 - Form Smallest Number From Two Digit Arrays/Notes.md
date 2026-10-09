
# ✦ Notes — LeetCode 2605

## Core Observation

There are only two cases:

1. A common digit exists in both arrays.
2. No common digit exists.

### Case 1 — Common Digit

The smallest common digit is the answer because every one-digit positive integer is smaller than every two-digit positive integer.

We scan digits from `1` through `9` to find the smallest common digit.

### Case 2 — No Common Digit

Let:

- `min1` = smallest digit in `nums1`
- `min2` = smallest digit in `nums2`

The answer is:

`min(min1, min2) * 10 + max(min1, min2)`

The smaller digit must occupy the tens position to produce the smallest possible number.

## Important Concepts

- Boolean arrays for constant-time digit lookup.
- Greedy selection of the smallest valid result.
- Minimum and maximum operations.
- Fixed-size auxiliary storage.

## Dry Run

**Input**
```text
nums1 = [8, 1, 6]
nums2 = [9, 1, 4]
```

Both arrays contain `1`.

**Output**
```text
1
```

**Input**
```text
nums1 = [7, 8]
nums2 = [3, 9]
```

No common digit exists.

- `min1 = 7`
- `min2 = 3`
- Answer = `3 * 10 + 7 = 37`

**Output**
```text
37
```

## Complexity

- Time: O(n + m)
- Auxiliary Space: O(1), because both boolean arrays have a fixed size of 10.

## ✦ Lesson Learned

When the input domain is tiny and bounded, boolean arrays can simplify membership checks without requiring sorting or hash sets.
