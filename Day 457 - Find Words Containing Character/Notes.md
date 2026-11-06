
# 🧠 Notes — Day 457

## Problem: Find Words Containing Character

### 🔍 Core Intuition

We need to identify which words contain a particular character and return their indices.

Instead of checking entire words using a built-in method, we manually traverse each character.

### ⚡ Step-by-Step Logic

1. Create an empty result list.
2. Use an outer loop to access each word.
3. Use an inner loop to access individual characters.
4. Compare each character with the target character.
5. If a match is found:
   - Add the current word index to the result.
   - Break the inner loop.
6. Return the result list.

### ☕ Java Concepts

| Concept | Purpose |
|---|---|
| `ArrayList<Integer>` | Store matching indices |
| `words.length` | Get the number of words |
| `words[i].length()` | Get the current word length |
| `charAt(j)` | Access a character |
| `add(i)` | Insert an index |
| `break` | Stop unnecessary iteration |

### 🐍 Python Concepts

| Concept | Purpose |
|---|---|
| `result = []` | Initialize an empty list |
| `len(words)` | Get the number of words |
| `len(words[i])` | Get the current word length |
| `words[i][j]` | Access a character |
| `append(i)` | Insert an index |
| `break` | Stop unnecessary iteration |

### 💡 Important Observation

The `break` statement is essential.

A word may contain the target character multiple times, but its index should only appear once in the result.

Therefore, once a match is found, we stop checking the remaining characters of that word.

### ⏱️ Complexity Analysis

Let:
- `n` = number of words.
- `m` = maximum word length.
- `k` = number of matching words.

**Time Complexity:** O(n × m)

In the worst case, every character of every word is examined.

**Auxiliary Space:** O(1), excluding the output list.

**Output Space:** O(k)

### 🎯 Key Takeaway

Nested loops help us inspect multidimensional data, while `break` helps eliminate unnecessary iterations.

**Small optimization. Clean logic. Better coding habits.**

---

*Day 457 — Consistency is the real superpower.* 🚀
