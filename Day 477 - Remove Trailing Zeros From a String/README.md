# 🌈 LeetCode 2710 — Remove Trailing Zeros From a String

**Day 477 | Difficulty: Easy | Topic: String Manipulation**

---

## 🎯 Problem Overview

Given a positive integer represented as a string `num`, remove all trailing zeros and return the resulting string.

A trailing zero is a zero that appears at the end of the string.

### 🧪 Examples

| Input | Output |
|---|---|
| `"51230100"` | `"512301"` |
| `"123"` | `"123"` |
| `"10203000"` | `"10203"` |
| `"5005"` | `"5005"` |
| `"100000"` | `"1"` |

## 🧠 Four Approaches

We explored four different implementations using Java and Python.

### ☕ Approach 1 — Java: While Loop + Substring

✦ Start from the last index.

✦ Move backwards while the current character is `'0'`.

✦ Stop at the first non-zero character.

✦ Return the substring from index `0` to `i + 1`.

### ☕ Approach 2 — Java: Regular Expression

✦ Use `replaceAll("0+$", "")`.

✦ `0` matches the zero character.

✦ `+` matches one or more occurrences.

✦ `$` identifies the end of the string.

✦ Only trailing zeros are removed.

### 🐍 Approach 3 — Python: While Loop + Slicing

✦ Traverse the string from right to left.

✦ Stop when the first non-zero character is encountered.

✦ Use slicing to retain the required portion.

### 🐍 Approach 4 — Python: Built-in `rstrip()`

✦ Use `num.rstrip('0')`.

✦ Removes all consecutive trailing zero characters.

✦ Preserves zeros appearing elsewhere in the string.

## 🔍 Visual Walkthrough

**Input:** `"51230100"`

```text
Original String:
5 1 2 3 0 1 0 0
              ↑ ↑
          Trailing zeros

Remove the trailing zeros:

5 1 2 3 0 1

Final Result:
"512301"
```

**Important:** Zeros in the middle must remain untouched!

## 📊 Complexity Analysis

Let `n` represent the length of the input string.

| Approach | Time | Auxiliary Space |
|---|---|---|
| Java While + Substring | O(n) | O(1) |
| Java Regex | O(n)* | O(n) worst-case |
| Python While + Slicing | O(n) | O(1) |
| Python `rstrip()` | O(n) | O(1) |

*Regex complexity is for this simple pattern under typical linear-time matching; implementation details can vary. Returned strings require O(n) output space in the worst case.*

## ⚠️ Edge Cases

| Input | Expected Output |
|---|---|
| `"1"` | `"1"` |
| `"123"` | `"123"` |
| `"1000"` | `"1"` |
| `"5005"` | `"5005"` |
| `"12000"` | `"12"` |
| `"1002000"` | `"1002"` |

## 🎓 Key Learning Takeaways

✦ Practised right-to-left string traversal.

✦ Understood substring extraction and slicing.

✦ Explored Java regular expressions.

✦ Learned Python's `rstrip()` built-in method.

✦ Understood the difference between trailing zeros and zeros appearing inside a string.

---

⭐ **Day 477 — Quest Completed!**

*One problem. Four implementations. Stronger fundamentals.*

