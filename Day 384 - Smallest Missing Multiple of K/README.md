# LeetCode 3718 — Smallest Missing Multiple of K

## 📌 Problem

Given an integer array `nums` and an integer `k`, return the **smallest positive multiple of `k` that is missing from `nums`**.

A multiple of `k` is any positive integer divisible by `k`.

### Example

```text
Input:
nums = [8, 2, 3, 4, 6]
k = 2

Output:
10
```

The positive multiples of `2` are:

```text
2, 4, 6, 8, 10, 12, ...
```

`2`, `4`, `6`, and `8` exist in the array, while `10` does not.

Therefore, the answer is:

```text
10
```

---

## 💡 Approach

1. Store every element of `nums` inside a `HashSet`.
2. Generate positive multiples of `k`.
3. Use `HashSet.contains()` to check whether each multiple exists.
4. Return the first missing multiple.

The first `n + 1` multiples are enough to check because the array contains only `n` elements. Therefore, it cannot contain all `n + 1` different multiples.

---

## ⏱️ Complexity

- **Time:** `O(n)`
- **Space:** `O(n)`

---

## 🧠 Key Concepts

- `HashSet`
- `HashSet.contains()`
- Multiples
- Loop boundaries
- Edge-case handling
- Early return

---

## 🏆 Result

**664 / 664 test cases passed**

Accepted solution in Java. 🚀
