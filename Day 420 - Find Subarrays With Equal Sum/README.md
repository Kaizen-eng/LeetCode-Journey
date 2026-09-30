# ✦ Day 420 — LeetCode 2395: Find Subarrays With Equal Sum

## 📌 Problem

Given a 0-indexed integer array `nums`, determine whether there exist two subarrays of length `2` with the same sum.

The two subarrays must begin at different indices.

### Example

```text
Input:  nums = [4, 2, 4]
Output: true

Explanation:
[4, 2] → 6
[2, 4] → 6
```

---

## 💡 Approach — Sliding Window + HashSet

Every required subarray has exactly **2 elements**, so we can examine each consecutive pair:

```text
nums[i] + nums[i + 1]
```

Instead of storing the actual subarrays, store only their sums in a `HashSet`.

For every pair:

1. Calculate its sum.
2. Check whether the sum has already appeared.
3. If it has, return `true`.
4. Otherwise, add the sum to the set.
5. If the loop finishes without finding a duplicate, return `false`.

### Why `HashSet`?

A `HashSet` is useful when we need to answer:

> "Have I already seen this value?"

Its average-case lookup and insertion are `O(1)`.

### Important Detail

The order matters:

```java
if (sums.contains(sum)) {
    return true;
}

sums.add(sum);
```

We must **check first and add second**.

If we add first, the current sum immediately exists in the set, causing a false positive.

---

## ⏱️ Complexity

- **Time:** `O(n)`
- **Space:** `O(n)`

---

## 🧠 Key Takeaway

When a problem asks whether something has appeared before, think:

```text
Have I seen this before?
        ↓
     HashSet
```

For this problem:

```text
Consecutive pair
      ↓
     Sum
      ↓
HashSet lookup
      ↓
Duplicate sum?
```
