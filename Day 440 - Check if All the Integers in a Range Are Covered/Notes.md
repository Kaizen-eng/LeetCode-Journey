# 🧠 Notes — LeetCode 1893

## ✨ Check if All the Integers in a Range Are Covered

**Day:** 440

**Approach:** Brute Force

## 𝟏. Core Idea

We must verify that every integer from `left` to `right`, inclusive, appears inside at least one interval in `ranges`.

For a given interval `[start, end]`, an integer `x` is covered when:

```text
start <= x <= end
```

The important detail is that **the entire target range must be covered**. Checking only `left` and `right` can miss gaps between intervals.

## 𝟐. Algorithm

✦ Start iterating from `left` through `right`.

✦ Set `covered = false` for each integer.

✦ Traverse the intervals and check whether the current integer belongs to any interval.

✦ When an interval covers it, set `covered = true` and stop checking further intervals using `break`.

✦ If `covered` remains `false`, return `false` immediately.

✦ If the loop finishes without finding an uncovered integer, return `true`.

## 𝟑. Java — Important Syntax

```java
for (int x = left; x <= right; x++)
```

Iterates over every integer in the target range, including `right`.

```java
x >= range[0] && x <= range[1]
```

Checks whether `x` lies inside the current interval.

```java
if (!covered)
```

Returns `false` when the current integer is not covered.

## 𝟒. Python — Important Syntax

```python
for x in range(left, right + 1):
```

Python's `range()` excludes its ending value, so `right + 1` ensures that `right` is included.

```python
for start, end in ranges:
```

Unpacks each interval into its starting and ending values.

```python
if start <= x <= end:
```

Python supports chained comparisons, so this checks both boundaries in one expression.

```python
if not covered:
```

Returns `false` when the current integer is uncovered.

## 𝟓. Dry Run

**Input:**

```text
ranges = [[1, 2], [4, 5]]
left = 1
right = 5
```

| Integer `x` | Covering interval | Status |
|---:|---|---|
| 1 | `[1, 2]` | Covered ✓ |
| 2 | `[1, 2]` | Covered ✓ |
| 3 | None | Not covered ✗ |

At `x = 3`, neither interval covers the integer.

The algorithm immediately returns `false`; checking `4` and `5` is unnecessary.

## 𝟔. Complexity Analysis

Let `n` denote the number of intervals and `m = right - left + 1`.

✦ **Time:** `O(n × m)` in the worst case.

✦ **Auxiliary Space:** `O(1)`.

## 𝟕. Lessons Learned

✦ Inclusive boundaries matter: use `<=` when checking the end of a range.

✦ A Boolean flag is useful for tracking whether a condition has been satisfied.

✦ `break` avoids unnecessary checks once coverage is found.

✦ Early returns help stop computation as soon as the answer is known.

✦ A range can have covered endpoints and still contain an uncovered integer in the middle.

---

🌙 **Quest 440 takeaway:** Verify every integer, not just the boundaries!
