### 📝 `Notes.md`

# ✦ Day 394 — Smallest Stable Index I

## 🧠 Core Idea

For each index `i`:

    instability = max(nums[0..i]) - min(nums[i..n-1])

The index is stable when:

    instability <= k

We need to return the **smallest** stable index.

## 🔍 Java Stream Syntax

For a range from `start` to `end`:

```java
Arrays.stream(nums, start, end)
```
The start index is inclusive, while the end index is exclusive.
Example:
```java
Arrays.stream(nums, 0, i + 1)
```
checks:
0 → i
And:
```java
Arrays.stream(nums, i, nums.length)
```
checks:
i → n - 1

## ⚠️ Edge Case
For i = 0:
```java
Arrays.stream(nums, 0, 0)
```
creates an empty stream.
Calling .min().getAsInt() or .max().getAsInt() on an empty stream causes:
NoSuchElementException

That's why the prefix range must be:
```java
Arrays.stream(nums, 0, i + 1)
```

## 💭 Important Correction:
The problem asks for the index, not the value.
Wrong:
```java
stable_index = nums[i];
Correct:
stable_index = i;
```

## 🎯 Takeaway:
When using Java Streams, always remember:
1. Start → Inclusive
2. End   → Exclusive
A tiny +1 can make a huge difference! 😜
