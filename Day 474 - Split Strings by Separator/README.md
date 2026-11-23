# ✨ LeetCode 2788 – Split Strings by Separator

![LeetCode](https://img.shields.io/badge/LeetCode-2788-orange?style=for-the-badge&logo=leetcode)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=for-the-badge)
![Java](https://img.shields.io/badge/Java-Solution-red?style=for-the-badge&logo=openjdk)
![Python](https://img.shields.io/badge/Python-Solution-blue?style=for-the-badge&logo=python)

> **Day 474** of my LeetCode problem-solving journey! 🚀

## 🧩 Problem Description

Given an array of strings `words` and a character `separator`, split each string using the given separator.

Return a list containing all resulting non-empty strings while maintaining their original order.

**Important:** The separator must not be included in the resulting strings, and empty strings must be excluded.

## 📌 Example

**Input:**
```text
words = ["one.two.three", "four.five", "six"]
separator = '.'
```

**Output:**
```text
["one", "two", "three", "four", "five", "six"]
```

**Explanation:**

✦ `"one.two.three"` → `"one", "two", "three"`

✦ `"four.five"` → `"four", "five"`

✦ `"six"` → `"six"`

All resulting strings are combined in their original order.

## 💡 Approach

### ☕ Java – StringBuilder

✦ Initialize an empty result list.

✦ Iterate through every string in the input list.

✦ Create a `StringBuilder` to construct individual substrings.

✦ Traverse each character using `toCharArray()`.

✦ If the character matches the separator:
- Add the constructed substring if it is not empty.
- Clear the StringBuilder using `setLength(0)`.

✦ Otherwise, append the character to the StringBuilder.

✦ After processing each word, add the remaining non-empty substring.

### 🐍 Python – Built-in split()

✦ Initialize an empty result list.

✦ Iterate through every word in the input list.

✦ Use `split(separator)` to divide each word.

✦ Iterate through the resulting parts.

✦ Append only non-empty strings using `if part`.

✦ Return the final result.

## ⚙️ Complexity Analysis

Let `N` represent the total number of characters across all input strings.

| Complexity | Java | Python |
|---|---|---|
| Time | O(N) | O(N) |
| Auxiliary Space | O(L) | O(L) |
| Output Space | O(N) | O(N) |

Here, `L` represents the maximum length of an individual input string. Python's temporary split results also require O(L) space.

## 🧠 Key Learnings

✦ Java `StringBuilder` helps construct strings efficiently.

✦ `setLength(0)` clears a StringBuilder for reuse.

✦ Python's `split()` method makes string separation straightforward.

✦ Empty strings evaluate to `false` in Python.

✦ Consecutive, leading, and trailing separators can produce empty strings that must be filtered out.

## 🎯 Final Takeaway

The same problem can be solved using different techniques in different programming languages.

**Java teaches us manual string construction, while Python demonstrates the power of built-in string methods and list comprehension.**

Keep learning. Keep solving. Keep improving! 🚀

---

⭐ **Day 474 Completed!**

*One problem closer to becoming a better problem solver.*
