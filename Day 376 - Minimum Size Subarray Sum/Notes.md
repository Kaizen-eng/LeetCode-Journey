# Day 376 - Minimum Size Subarray Sum

## 🧩 LeetCode 209 — Minimum Size Subarray Sum

### 🔹 Pattern

**Sliding Window + Two Pointers**

### 🔹 Variables

```text
L = Left pointer
R = Right pointer
sum = Current window sum
minLength = Smallest valid window found
```

### 🔹 Core Logic

```text
Move R → Expand the window
        ↓
sum >= target?
        ↓
      YES
        ↓
Update minimum length
        ↓
Remove nums[L]
        ↓
Move L forward
        ↓
Still sum >= target?
        ↓
Repeat shrinking
```

### 🔹 Why `while`?

We use:

```java
while (sum >= target)
```

instead of `if` because one valid window may contain a **smaller valid window inside it**.

Example:

```text
sum = 12
target = 7

12 >= 7 → shrink
 9 >= 7 → shrink
 7 >= 7 → shrink
 4 < 7  → stop
```

We keep shrinking until removing another element would make the window invalid.

### 🔹 Important Formula

Current window length:

```java
R - L + 1
```

### 🔹 Why Sliding Window Works

The array contains **positive integers**.

Therefore:

```text
Expand window → sum increases
Shrink window → sum decreases
```

This predictable behavior allows both pointers to move only forward.

### 🔹 Prefix Sum vs Sliding Window

Prefix Sum can also solve this problem, but for positive numbers, Sliding Window is simpler and uses constant extra space.

```text
Sliding Window
Time  → O(n)
Space → O(1)
```

### 🔹 Remember This

> **Expand → Reach Target → Shrink → Minimize**

### ⚔️ Quest Log

**Day 376 — Minimum Size Subarray Sum**

**Status: CLEARED ✅🔥**
