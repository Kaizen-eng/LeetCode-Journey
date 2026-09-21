# 🏰 LeetCode 2511 — Maximum Enemy Forts That Can Be Captured

## 📌 Problem

Given an array `forts` containing:

- `1` → Our fort
- `-1` → Enemy fort
- `0` → Empty position

We need to determine the **maximum number of enemy forts that can be captured**.

A capture is possible when two non-zero forts are **opposite** (`1` and `-1`) with only `0`s between them.

If no valid capture is possible, return `0`.

---

## 💡 Approach 1 — Two Pointers

✦ Maintain `left` as the index of the previous non-zero fort.

✦ Move `right` through the array.

✦ Whenever `forts[right]` is non-zero, compare it with `forts[left]`.

✦ If they are opposite, calculate the number of positions between them using:

```text
right - left - 1
```

✦ Update the maximum capture count.

✦ Move `left` to the current non-zero fort.

### Complexity

✦ **Time:** `O(n)`

✦ **Space:** `O(1)`

---

## ⚡ Approach 2 — Previous Non-Zero Index

Instead of explicitly thinking in terms of two pointers, we can maintain a single variable `prev` containing the index of the previous non-zero fort.

✦ Ignore every `0`.

✦ When a non-zero fort is encountered, compare it with `forts[prev]`.

✦ If the two forts are opposite, calculate:

```text
i - prev - 1
```

✦ Keep the maximum value.

✦ Update `prev` to the current index.

### Complexity

✦ **Time:** `O(n)`

✦ **Space:** `O(1)`

---

## 🧠 Key Insight

The important observation is that **only consecutive non-zero forts matter**.

Any `0`s between two opposite forts represent capturable enemy forts.

Therefore:

```text
captured = currentIndex - previousIndex - 1
```

---

## 🔎 Example

```text
forts = [1, 0, 0, 0, -1]
```

The two non-zero forts are opposite:

```text
1  0  0  0  -1
↑           ↑
```

Number of capturable forts:

```text
5 - 1 - 1 = 3
```

So:

```text
Output = 3
```

---

## 🏆 Result

Both approaches scan the array only once and use constant extra space.

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(1)`
