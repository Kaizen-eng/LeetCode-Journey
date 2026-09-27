# Notes — LeetCode 2656

## Core Observation

At every operation, choosing the current maximum is optimal.

Suppose the current maximum is `M`.

If we choose a smaller value `x < M`, the score gained is smaller than choosing `M`. Therefore, an optimal strategy always chooses `M`.

After choosing `M`, the operation replaces it with `M + 1`.

So the maximum available value increases by exactly one after every operation:

```text
M → M + 1 → M + 2 → ... → M + k - 1
```

The score is therefore:

```text
M + (M + 1) + ... + (M + k - 1)
```

## Mathematical Simplification

Separate the constant part from the incremental part:

```text
M + (M + 1) + ... + (M + k - 1)

= kM + (0 + 1 + 2 + ... + k - 1)

= kM + k(k - 1) / 2
```

So the whole problem reduces to finding the maximum element.

## Why Sorting Can Be Removed

The original approach sorts the array only to obtain its maximum efficiently.

But finding the maximum does not require sorting:

```java
int max = 0;

for (int num : nums) {
    max = Math.max(max, num);
}
```

Once `max` is known, the answer follows directly from the arithmetic-progression formula.

This changes the complexity from:

```text
O(n log n)
```

to:

```text
O(n)
```

## Approach Comparison

### Solution 1

```text
Sort
↓
Take maximum
↓
Repeat k times
↓
Add current maximum
↓
Increase maximum
```

### Solution 2

```text
Find maximum
↓
Use arithmetic-series formula
```

## Important Pattern

When a problem repeatedly:

- selects the current maximum,
- gives a score based on that maximum,
- and replaces it with maximum + 1,

look for an arithmetic progression before reaching for sorting or simulation.

## Complexity

| Approach | Time | Space |
|---|---:|---:|
| Sorting + simulation | O(n log n) | O(log n)* |
| Max + formula | O(n) | O(1) |

`*` Auxiliary stack space for the primitive-array sorting implementation can vary by Java implementation.

## Final Takeaway

The first solution demonstrates the direct greedy simulation.

The second solution goes one step further by recognizing the mathematical structure of the greedy choices.

**Accepted is great. Understanding why the pattern exists is better.**
