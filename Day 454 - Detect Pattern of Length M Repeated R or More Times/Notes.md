# ✦ Notes — LeetCode 1566

## Detect Pattern of Length M Repeated R or More Times

**Day 454 | Array | Direct Comparison**

---

## 💡 Core Intuition

We need to find a sequence of length `m` that repeats consecutively at least `k` times.

Instead of extracting and comparing separate subarrays, we can compare elements using a fixed offset.

**The key observation:**

If a pattern repeats every `m` positions, then:

```python
arr[i + j] == arr[i + j + m]
```

If all required comparisons match, the pattern is repeated consecutively.

## 1. Why Do We Need Only m × (k - 1) Comparisons?

Suppose:

```text
m = 2
k = 3

Pattern = [1, 2]
```

We need three consecutive occurrences:

```text
[1, 2] [1, 2] [1, 2]
```

Instead of comparing all three blocks separately, compare adjacent blocks:

```text
Block 1 == Block 2
Block 2 == Block 3
```

Each comparison requires `m` element comparisons.

Therefore:

```text
Total comparisons = m × (k - 1)
```

## 2. Starting Index Boundary

The pattern must occupy at least `m * k` elements.

Therefore, the starting index must satisfy:

```java
i <= arr.length - (m * k)
```

This prevents accessing elements beyond the array boundary.

## 3. Algorithm

1. Iterate through all valid starting indices.
2. Initialize `count = 0`.
3. Compare the current element with the element `m` positions ahead.
4. Increment `count` if they match.
5. Break if a mismatch occurs.
6. If `count == m * (k - 1)`, return `true`.
7. If no valid pattern is found, return `false`.

## 4. Dry Run

```text
arr = [1, 2, 4, 4, 4, 4]
m = 1
k = 3
```

Starting at index `2`:

| Comparison | Result |
|---|---|
| arr[2] == arr[3] | 4 == 4 ✓ |
| arr[3] == arr[4] | 4 == 4 ✓ |

Required comparisons:

```text
m × (k - 1)
= 1 × (3 - 1)
= 2
```

Actual matches = 2.

Therefore:

```text
count == m * (k - 1)

Output: true
```

## 5. Important Concepts

✦ **Fixed Offset Comparison:** Compare elements separated by exactly `m` positions.

✦ **Consecutive Repetition:** Every adjacent occurrence must match.

✦ **Boundary Checking:** Ensure enough elements remain before starting a comparison.

✦ **Early Termination:** Stop immediately when a mismatch is found.

## 6. Common Mistakes

- Using `m * k` as the inner comparison limit instead of `m * (k - 1)`.
- Forgetting to check the valid starting index boundary.
- Checking whether elements repeat anywhere in the array instead of consecutively.
- Forgetting that one pattern occurrence needs zero comparisons when `k = 1`.

## 7. Complexity Analysis

- **Time:** O(n × m × k)
- **Space:** O(1)

## ✦ Revision Flashcards

**Q1. Why compare elements `m` positions apart?**

Because consecutive occurrences of a pattern of length `m` must have identical corresponding elements.

**Q2. How many comparisons are required?**

`m * (k - 1)`.

**Q3. Why use `arr.length - m * k`?**

To ensure enough elements remain for all `k` occurrences.

**Q4. Do we need an additional array?**

No. Direct comparison is sufficient.

---

## ✦ Lesson Learned

Sometimes, the simplest way to detect a pattern is not to store it, but to compare it at the right position.

**Think in offsets. Reduce extra space. Keep the logic simple.**
