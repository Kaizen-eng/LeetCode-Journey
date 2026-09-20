# LeetCode 3498 — Reverse Degree of a String

## Problem

Given a string `s`, calculate its **reverse degree**.

For each character:
1. Find its position in the reversed alphabet (`a = 26, b = 25, ..., z = 1`).
2. Multiply that value by the character's **1-indexed position** in the string.
3. Add all contributions together.

---

## Approach 1 — Character Arithmetic

We do not need to store the reversed alphabet in an array or map.

For a lowercase character `ch`:

```text
ch - 'a'
```

gives its zero-based position in the normal alphabet.

Therefore, its reverse alphabet position is:

```text
26 - (ch - 'a')
```

For example:

```text
'a' → 26 - 0  = 26
'b' → 26 - 1  = 25
'c' → 26 - 2  = 24
'z' → 26 - 25 = 1
```

For the character at index `i`, its 1-indexed string position is:

```text
i + 1
```

So its contribution is:

```text
reversePosition × (i + 1)
```

We add every contribution to the final answer.

### Example

For:

```text
s = "abc"
```

| Character | Reverse Alphabet Position | String Position | Contribution |
|---|---:|---:|---:|
| `a` | 26 | 1 | 26 |
| `b` | 25 | 2 | 50 |
| `c` | 24 | 3 | 72 |

```text
26 + 50 + 72 = 148
```

So the answer is:

```text
148
```

---

## Complexity

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

The string is traversed exactly once, and only a constant number of variables are used.

---

## Key Takeaway

The main trick is recognizing that the reversed alphabet position can be calculated directly:

```java
26 - (ch - 'a')
```

No extra data structure is required.
