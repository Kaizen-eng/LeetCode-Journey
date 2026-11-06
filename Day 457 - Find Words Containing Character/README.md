
# 🚀 LeetCode 2942 — Find Words Containing Character

<div align="center">

  ![Day 457](https://img.shields.io/badge/DAILY%20QUEST-DAY%20457-8A2BE2?style=for-the-badge)
  ![Difficulty](https://img.shields.io/badge/DIFFICULTY-EASY-00C853?style=for-the-badge)
  ![Java](https://img.shields.io/badge/JAVA-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
  ![Python](https://img.shields.io/badge/PYTHON-3776AB?style=for-the-badge&logo=python&logoColor=white)

</div>

## 📌 Problem

Given a 0-indexed array of strings `words` and a character `x`, return an array of indices representing the words that contain the character `x`.

The returned array can be in any order.

🔗 **Problem Link:** [LeetCode 2942](https://leetcode.com/problems/find-words-containing-character/)

## 💡 Approach — Nested Loop

We use a nested-loop approach to examine every word and its characters.

1. Initialize an empty list to store matching indices.
2. Iterate through each word using an outer loop.
3. Traverse each character using an inner loop.
4. If a character matches `x`, add the current word index.
5. Use `break` to avoid adding duplicate indices.
6. Return the result.

## 🧪 Example

**Input:**
```text
words = ["leet", "code"]
x = "e"
```

**Output:**
```text
[0, 1]
```

**Explanation:**
- "leet" contains 'e' → index 0.
- "code" contains 'e' → index 1.

Both words contain the target character.

## ⚙️ Complexity Analysis

| Complexity | Value | Explanation |
|---|---|---|
| Time | O(n × m) | Examine characters in each word |
| Auxiliary Space | O(1) | Excluding the output list |
| Output Space | O(k) | Store k matching indices |

Where:
- `n` = number of words.
- `m` = maximum length of a word.
- `k` = number of matching words.

## 💻 Implementations

- ☕ [Java Solution](./Solutions.java)
- 🐍 [Python Solution](./Solution.py)
- 📝 [Detailed Notes](./Notes.md)

---

<div align="center">

  **457 DAYS. ONE CONSISTENT JOURNEY. INFINITE POSSIBILITIES.** ⚡

  *Learn • Solve • Improve • Repeat*

</div>
