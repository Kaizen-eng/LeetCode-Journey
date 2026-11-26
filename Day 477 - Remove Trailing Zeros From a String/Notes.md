# 📝 LeetCode 2710 — Remove Trailing Zeros From a String

## 🌟 Day 477 — Learning Notes

### 1. Core Intuition

The main observation is that we only need to remove zeros appearing at the end of the string.

We don't need to modify the original string character by character.

Instead, we can identify the last non-zero character and retain everything before and including it.

### 2. Approach 1 — Java While Loop

**Logic:**

1. Initialize `i` to the last index.
2. Check whether `num.charAt(i)` is `'0'`.
3. Decrement `i` while trailing zeros are found.
4. Return `num.substring(0, i + 1)`.

**Key concept:**

Java's `substring(start, end)` excludes the ending index.

Therefore, we use `i + 1`.

### 3. Approach 2 — Java Regex

```java
num.replaceAll("0+$", "");
```

**Regex breakdown:**

| Symbol | Meaning |
|---|---|
| `0` | Matches zero |
| `+` | One or more occurrences |
| `$` | End of the string |

The pattern matches only consecutive zeros at the end.

### 4. Approach 3 — Python While Loop

**Logic:**

1. Initialize `i = len(num) - 1`.
2. Move backwards while `num[i] == '0'`.
3. Stop at the first non-zero character.
4. Return `num[:i + 1]`.

**Key concept:**

Python slicing uses an exclusive ending index, just like Java substring.

### 5. Approach 4 — Python Built-in

```python
num.rstrip('0')
```

`rstrip()` removes the specified trailing characters.

It does not remove zeros from the middle of the string.

### 6. Dry Run

**Input:** `"10203000"`

| Step | Index | Character | Action |
|---|---:|---|---|
| 1 | 7 | `'0'` | Move left |
| 2 | 6 | `'0'` | Move left |
| 3 | 5 | `'0'` | Move left |
| 4 | 4 | `'3'` | Stop |

Retain the substring:

```text
num[0:5] = "10203"
```

**Final Output:** `"10203"`

### 7. Important Observations

✦ Use `'0'` when comparing individual characters, not `"0"`.

✦ The input is guaranteed to be a positive integer represented as a string, so at least one non-zero digit exists.

✦ Never remove every zero indiscriminately.

✦ Both Java substring and Python slicing exclude their ending index.

✦ `rstrip('0')` is a convenient built-in alternative in Python.

### 8. Complexity Summary

Let `n` be the input string length.

- Java While: O(n) time, O(1) auxiliary space.
- Java Regex: O(n) typical time for this simple pattern, O(n) worst-case auxiliary space.
- Python While: O(n) time, O(1) auxiliary space.
- Python `rstrip()`: O(n) time, O(1) auxiliary space.

Output string allocation is excluded from auxiliary-space measurements.

### 9. Learning Takeaways

✦ Improved string traversal fundamentals.

✦ Practised conditional loops.

✦ Explored regular expressions.

✦ Understood language-specific string utilities.

✦ Compared manual algorithms with built-in methods.

---

**DAY 477 — FOUR APPROACHES, ONE PROBLEM!** 🚀

