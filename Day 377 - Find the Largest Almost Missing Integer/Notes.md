# Notes - Day 377

## LeetCode 3471 - Find the Largest Almost Missing Integer

### Pattern

**Frequency Counting + Boundary Observation**

### Core Idea

An element is **almost missing** when it occurs in exactly one subarray of length `k`.

The number of subarrays containing an element depends on its position.

For:

```text
1 < k < n
```

the only positions that can appear in exactly one window are:

```text
nums[0]           nums[n - 1]
   ↑                  ↑
 first              last
```

Therefore, only the first and last values need to be checked.

---

### Important Cases

#### `k == n`

Only one window exists:

```text
[ nums[0], nums[1], ..., nums[n-1] ]
```

Every number belongs to exactly one subarray.

**Answer → maximum element**

---

#### `k == 1`

Every element is its own subarray.

So:

```text
frequency == 1
```

means the number is almost missing.

**Answer → largest number with frequency 1**

---

#### `1 < k < n`

Only the first and last elements can qualify.

Check:

```java
freq[nums[0]] == 1
freq[nums[n - 1]] == 1
```

Then choose the larger valid value.

---

### Example

```text
nums = [3, 9, 2, 1, 7]
k = 3
```

Windows:

```text
[3, 9, 2]
[9, 2, 1]
[2, 1, 7]
```

`3` appears in only one window → valid.

`7` appears in only one window → valid.

Therefore:

```text
answer = 7
```

---

### Complexity

```text
Time  → O(n)
Space → O(1)
```

Since the values are limited to `1...50`, a fixed-size frequency array is enough.

---

### Lesson

**Don't just look at the number of windows — look at which positions can participate in those windows.**

A small observation can turn an apparently complicated sliding-window problem into a simple frequency-counting solution. 🧠⚡

---

## Quest Status

```text
Day 377
LeetCode 3471
Status: CLEARED ⚔️
Pattern: Frequency Counting
```
