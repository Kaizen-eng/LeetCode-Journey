# ✦ Notes — LeetCode 2164

## ✦ Core Idea

Separate the array based on **index parity**, sort each group independently, and reconstruct the array.

---

## ✦ Step 1 — Separate

For every index:

```java
if (i % 2 == 0)
```

→ index is **even**

Otherwise:

→ index is **odd**

So:

```text
nums = [4, 1, 2, 3]

Even → [4, 2]
Odd  → [1, 3]
```

---

## ✦ Step 2 — Sort

Even-index values need **ascending** order:

```text
[4, 2] → [2, 4]
```

Odd-index values need **descending** order:

```text
[1, 3] → [3, 1]
```

Java:

```java
Collections.sort(even);
odd.sort(Collections.reverseOrder());
```

---

## ✦ Step 3 — Reconstruct

Maintain two pointers:

```java
int e = 0;
int o = 0;
```

For every index:

```java
if (i % 2 == 0) {
    nums[i] = even.get(e++);
} else {
    nums[i] = odd.get(o++);
}
```

This guarantees that each value returns to the correct **index parity**.

---

## ✦ Why Two Lists?

Trying to sort the original array directly would mix the values belonging to even and odd positions.

Using two lists makes the logic simple:

```text
         nums
          │
     ┌────┴────┐
     ↓         ↓
   EVEN       ODD
     │         │
  ASCENDING  DESCENDING
     │         │
     └────┬────┘
          ↓
       nums
```

---

## ✦ Complexity

Let `n` be the length of the array.

✦ Separating values → `O(n)`

✦ Sorting even values → `O(n log n)`

✦ Sorting odd values → `O(n log n)`

✦ Reconstructing → `O(n)`

Therefore:

```text
Time  → O(n log n)
Space → O(n)
```

---

## ✦ Java Collections

### Ascending

```java
Collections.sort(even);
```

### Descending

```java
odd.sort(Collections.reverseOrder());
```

---

## ✦ Common Mistake

Do NOT mix parity while reconstructing.

```text
even → must go to even indices
odd  → must go to odd indices
```

The sorting order changes, but the **index parity does not**.

---

## ✦ Pattern to Remember

**Separate → Sort → Reconstruct**

This pattern is useful whenever different groups of an array have different ordering rules.
