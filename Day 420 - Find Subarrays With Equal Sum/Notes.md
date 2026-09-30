# ✦ Day 420 — Notes

## 1. Pattern

This problem is a combination of:

- **Sliding Window of Size 2**
- **HashSet**
- **Duplicate Detection**

Because every subarray must contain exactly two consecutive elements, the window is simply:

```java
nums[i] + nums[i + 1]
```

---

## 2. Why HashSet?

A `HashSet` stores unique values.

Example:

```java
Set<Integer> sums = new HashSet<>();

sums.add(6);
sums.add(10);
sums.add(6);
```

The resulting set is conceptually:

```text
{6, 10}
```

The second `6` is not added because it already exists.

For this problem, we use that behavior to detect repeated pair sums.

---

## 3. The Critical Order

Correct:

```java
if (sums.contains(sum)) {
    return true;
}

sums.add(sum);
```

Incorrect:

```java
sums.add(sum);

if (sums.contains(sum)) {
    return true;
}
```

Why?

Suppose the first pair has sum `3`.

If we add `3` first:

```text
Set = {}
add(3)
Set = {3}

contains(3) → true
```

But we have only encountered `3` once!

So the rule to remember is:

> **Check → Add**

Whenever the goal is to detect something that appeared previously.

---

## 4. Walkthrough

For:

```text
nums = [4, 2, 4, 3]
```

Pair sums:

```text
[4, 2] → 6
[2, 4] → 6
[4, 3] → 7
```

Process:

```text
Set = {}

6 → not found → add 6
Set = {6}

6 → already found → return true
```

---

## 5. Complexity

There are `n - 1` consecutive pairs.

Each `HashSet` lookup/insertion is average `O(1)`.

Therefore:

```text
Time  → O(n)
Space → O(n)
```

---

## 6. New Skill Unlocked 🔓

A useful LeetCode clue:

```text
"Have I seen this before?"
"Does this value repeat?"
"Is there a duplicate?"
```

Think about:

```java
HashSet
```

This is one of the most common and useful patterns for array problems.
