# 📝 Notes — LeetCode 2511

## 🔑 Core Observation

We only care about **non-zero forts**.

✦ `1` represents our fort.

✦ `-1` represents an enemy fort.

✦ `0` represents an empty position.

A valid capture occurs when two consecutive non-zero forts are **opposite**.

```text
1 ... -1
```

or

```text
-1 ... 1
```

---

## 🧠 Important Formula

If the previous non-zero fort is at index `prev` and the current non-zero fort is at index `i`:

```java
i - prev - 1
```

This gives the number of `0`s between the two forts.

---

## ⚔️ Approach 1 — Two Pointers

### Idea

✦ `left` stores the previous non-zero fort.

✦ `right` scans the array.

✦ When `forts[right] != 0`, compare the two forts.

✦ If they are different, calculate the gap.

✦ Update `left`.

### Pseudocode

```text
left = -1
max = 0

for right from 0 to n - 1:
    if forts[right] != 0:
        if left != -1 and forts[left] != forts[right]:
            max = max(max, right - left - 1)

        left = right

return max
```

---

## ⚡ Approach 2 — Previous Non-Zero Index

This approach expresses the same logic more directly.

### Idea

✦ Maintain `prev = -1`.

✦ Scan the array.

✦ Ignore zeros.

✦ For every non-zero fort, compare it with the previous non-zero fort.

✦ If they are opposite, calculate the gap.

✦ Update `prev`.

### Pseudocode

```text
prev = -1
max = 0

for i from 0 to n - 1:
    if forts[i] != 0:
        if prev != -1 and forts[prev] != forts[i]:
            max = max(max, i - prev - 1)

        prev = i

return max
```

---

## 🧪 Example

```text
forts = [1, 0, 0, -1, 0, 0, 0, 1]
```

First pair:

```text
1  0  0  -1
```

Gap:

```text
4 - 0 - 1 = 2
```

Second pair:

```text
-1  0  0  0  1
```

Gap:

```text
7 - 3 - 1 = 3
```

Therefore:

```text
Answer = 3
```

---

## 🚨 Edge Case

If there is no pair of opposite non-zero forts:

```text
[1, 1, 0, 0, -1, -1]
```

the maximum valid gap remains:

```text
0
```

---

## 📊 Complexity

| Approach | Time | Space |
|---|---:|---:|
| Two Pointers | `O(n)` | `O(1)` |
| Previous Non-Zero Index | `O(n)` | `O(1)` |

---

## 💭 Takeaway

The biggest trick isn't complicated code.

It's recognizing that **zeros only matter as the distance between consecutive non-zero forts**.

Once that observation is made, the entire problem becomes a simple linear scan.
