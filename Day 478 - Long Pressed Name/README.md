# 🌈 LeetCode 925 — Long Pressed Name

<p align="center">
  <img src="https://img.shields.io/badge/LeetCode-925-orange?style=for-the-badge&logo=leetcode" />
  <img src="https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Day-478-purple?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Topic-Two%20Pointers-blue?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Topic-Strings-cyan?style=for-the-badge" />
</p>

## 📌 Problem Overview

Given two strings `name` and `typed`, determine whether `typed` could have been produced by typing `name`, where some characters may have been long-pressed.

A long-pressed character may appear multiple consecutive times in the typed string.

**Objective:** Return `True` if `typed` is a valid long-pressed version of `name`; otherwise, return `False`.

🔗 **Problem:** [LeetCode 925 — Long Pressed Name](https://leetcode.com/problems/long-pressed-name/)

---

## 🧪 Examples

**Example 1**

```text
Input:
name = "alex"
typed = "aaleex"

Output: true
```

**Explanation:** The characters `a` and `e` were long-pressed.

**Example 2**

```text
Input:
name = "saeed"
typed = "ssaaedd"

Output: false
```

**Explanation:** The character `e` appears fewer times in `typed` than required.

**Example 3**

```text
Input:
name = "leelee"
typed = "lleeelee"

Output: true
```

**Explanation:** The character groups are valid and maintain their original order.

---

## 💡 Approach 1 — Two Pointers

**Core Intuition:**

Use two pointers to traverse both strings simultaneously.

- `i` tracks the current character in `name`.
- `j` tracks the current character in `typed`.
- If both characters match, advance both pointers.
- Otherwise, check whether the current typed character is a repetition of its previous character.
- If neither condition holds, return `False`.

Finally, verify that every character in `name` has been matched.

**Python Implementation**

```python
class Solution:

    def isLongPressedName(self, name: str, typed: str) -> bool:

        i = 0
        j = 0

        while j < len(typed):

            if i < len(name) and name[i] == typed[j]:
                i += 1
                j += 1

            elif j > 0 and typed[j] == typed[j - 1]:
                j += 1

            else:
                return False

        return i == len(name)
```

**Complexity Analysis**

- Time Complexity: `O(n + m)`
- Auxiliary Space Complexity: `O(1)`

---

## 💡 Approach 2 — Character Group Comparison

**Core Intuition:**

Instead of matching individual characters, compare consecutive groups of identical characters.

For each group:

1. Identify the current character.
2. Count its consecutive occurrences in `name`.
3. Count its consecutive occurrences in `typed`.
4. Verify that both groups contain the same character.
5. Ensure the typed group has at least as many occurrences as the original group.

Finally, ensure both strings are completely traversed.

**Python Implementation**

```python
class Solution:

    def isLongPressedName(self, name: str, typed: str) -> bool:

        i = 0
        j = 0

        while i < len(name) and j < len(typed):

            char = name[i]

            count_name = 0
            count_typed = 0

            while i < len(name) and name[i] == char:
                count_name += 1
                i += 1

            while j < len(typed) and typed[j] == char:
                count_typed += 1
                j += 1

            if count_typed < count_name:
                return False

        return i == len(name) and j == len(typed)
```

**Complexity Analysis**

- Time Complexity: `O(n + m)`
- Auxiliary Space Complexity: `O(1)`

---

## 📊 Approach Comparison

| Criteria | Two Pointers | Group Comparison |
|---|---|---|
| Technique | Character matching | Consecutive group counting |
| Time | O(n + m) | O(n + m) |
| Space | O(1) | O(1) |
| Traversal | Simultaneous | Group-wise |
| Optimal | Yes | Yes |

---

## 🎯 Key Takeaways

✦ Two pointers are effective when comparing strings while preserving character order.

✦ Long-pressed characters must appear consecutively.

✦ Character frequencies alone are insufficient because the original order must be preserved.

✦ Group comparison provides another elegant way to solve string-matching problems.

✦ Both approaches achieve optimal linear time complexity with constant auxiliary space.

---

## 🏆 Day 478 Achievement

**Problem:** 925. Long Pressed Name

**Difficulty:** Easy

**Approaches Mastered:**
- Two Pointers
- Character Group Comparison

**Languages:**
- Java
- Python

✨ Another problem solved. Another concept mastered. One more step forward in the journey!

**Consistency builds mastery. Keep coding! 🚀**
