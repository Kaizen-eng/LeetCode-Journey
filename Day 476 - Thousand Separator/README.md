# 🌟 LeetCode 1556 — Thousand Separator

**Day 476 | LeetCode Quest**

## 📌 Problem Overview

Given an integer `n`, return a string representing the number with a dot (`.`) inserted as the thousands separator.

Every group of three digits must be separated by a dot, starting from the rightmost digit.

### 🧪 Examples

| Input | Output |
|---|---|
| `987` | `"987"` |
| `1234` | `"1.234"` |
| `123456` | `"123.456"` |
| `1234567` | `"1.234.567"` |
| `1234567890` | `"1.234.567.890"` |

## 💡 Approach — Right-to-Left Traversal

1. Convert the integer into a string.
2. Traverse the string from right to left.
3. Append each digit to a `StringBuilder`.
4. Maintain a counter to track the number of digits processed.
5. After every three digits, insert a dot if more digits remain.
6. Reverse the resulting string to obtain the final answer.

## 🔍 Visual Walkthrough

**Input:** `1234567`

Traversal from right to left:

```text
7 → 67 → 567 → 567.
567.4 → 567.34 → 567.234.
567.234.1
```

Reverse the constructed string:

```text
1.234.567
```

**Final Output:** `"1.234.567"`

## 💻 Java Solution

See `Solutions.java` for the complete implementation.

## 📊 Complexity Analysis

Let `d` represent the number of digits in `n`.

| Complexity | Analysis |
|---|---|
| Time | O(d) |
| Space | O(d) |

- Each digit is visited exactly once.
- The StringBuilder stores the resulting characters.
- Reversing the constructed string takes linear time.

## 🎯 Key Takeaways

- Right-to-left traversal simplifies digit grouping.
- A counter helps identify every third digit.
- StringBuilder provides efficient string construction in Java.
- Reversing the result restores the original digit order.

---

**Quest Day 476 — Completed!** ⭐
