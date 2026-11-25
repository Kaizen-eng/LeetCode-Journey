# 📝 LeetCode 1556 — Thousand Separator
## Day 476 — Learning Notes

### 🧠 Core Intuition

The important observation is that thousands separators must be inserted after every three digits, counting from the right.

Instead of traversing from left to right and calculating where separators belong, we can directly construct the answer from right to left.

### ⚙️ Algorithm

1. Convert `n` into a string.
2. Initialize an empty StringBuilder.
3. Start from the last index.
4. Append the current digit.
5. Increment the counter.
6. If the counter reaches three and more digits remain:
   - Append `.`.
   - Reset the counter.
7. Reverse the StringBuilder.
8. Return the final string.

### 🔬 Dry Run

**Input:** `n = 1234567`

| Iteration | Digit | Counter | Constructed Result |
|---:|:---:|---:|---|
| 1 | 7 | 1 | `7` |
| 2 | 6 | 2 | `76` |
| 3 | 5 | 3 | `765.` |
| 4 | 4 | 1 | `765.4` |
| 5 | 3 | 2 | `765.43` |
| 6 | 2 | 3 | `765.432.` |
| 7 | 1 | 1 | `765.432.1` |

After reversing:

```text
1.234.567
```

### 📌 Important Observations

- Numbers containing fewer than four digits do not require separators.
- The counter resets after every three digits.
- The condition `i != 0` prevents an unnecessary trailing separator in the constructed string.
- The final reversal restores the original order.

### ⚠️ Edge Cases

| Input | Expected Output |
|---:|---|
| `0` | `"0"` |
| `12` | `"12"` |
| `999` | `"999"` |
| `1000` | `"1.000"` |
| `1000000` | `"1.000.000"` |

### ⏱️ Complexity

- **Time Complexity:** O(d)
- **Space Complexity:** O(d)

Here, `d` is the number of digits.

### 🌱 Learning Takeaways

- Practised right-to-left string traversal.
- Understood conditional separator insertion.
- Used StringBuilder for efficient string construction.
- Learned why reversing can simplify string manipulation.

---

**Day 476 — Another problem conquered!** 🚀
