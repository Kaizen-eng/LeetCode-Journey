# 📝 LeetCode Day 479 — Learning Notes

## 1422. Maximum Score After Splitting a String

<p align="center">
  <img src="https://img.shields.io/badge/Day-479-orange?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Concept-String-blue?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Technique-Prefix%20%26%20Suffix-purple?style=for-the-badge" />
</p>

---

## 🎯 Core Objective

Split a binary string into two non-empty parts and maximize:

\[
Score = LeftZeros + RightOnes
\]

### Important Constraints

- Left substring must contain at least one character.
- Right substring must contain at least one character.
- Valid splitting positions range from `1` to `n - 1`.

---

## 🔍 Approach 1 — Brute Force

### Core Intuition

Evaluate every possible split independently.

For each splitting position:

1. Count zeros in the left substring.
2. Count ones in the right substring.
3. Calculate their sum.
4. Maintain the maximum score.

### Visual Example

```text
Input: 011101

Split 1: 0 | 11101
         1 + 4 = 5

Split 2: 01 | 1101
         1 + 3 = 4

Split 3: 011 | 101
         1 + 2 = 3

Split 4: 0111 | 01
         1 + 1 = 2

Split 5: 01110 | 1
         2 + 1 = 3
```

**Maximum Score = 5**

### Complexity

- Time: O(n²)
- Space: O(1)

### Important Observation

Every split repeats the counting process. This creates unnecessary work and motivates precomputation.

---

## ⚡ Approach 2 — Prefix & Suffix Arrays

### Core Intuition

Precompute the information needed for each side of the split.

**Prefix Zeros**

```text
prefixZeros[i] = Number of zeros from index 0 to i
```

**Suffix Ones**

```text
suffixOnes[i] = Number of ones from index i to n-1
```

### Mathematical Formula

For a split after index `i`:

\[
Score(i) = prefixZeros[i] + suffixOnes[i+1]
\]

The answer is:

\[
Maximum = \max_{0 \leq i < n-1} Score(i)
\]

### Dry Run

```text
s = "011101"

Index:       0  1  2  3  4  5
String:      0  1  1  1  0  1

Prefix Zeros:
             1  1  1  1  2  2

Suffix Ones:
             4  4  3  2  1  1
```

Evaluate each valid split:

| Split Index | Prefix Zeros | Suffix Ones | Score |
|---:|---:|---:|---:|
| 0 | 1 | 4 | **5** |
| 1 | 1 | 3 | 4 |
| 2 | 1 | 2 | 3 |
| 3 | 1 | 1 | 2 |
| 4 | 2 | 1 | 3 |

**Maximum Score = 5**

### Complexity

- Time: O(n)
- Space: O(n)

---

## 🧠 Important Concepts to Remember

### 1. Prefix Counting

Stores cumulative information from left to right.

### 2. Suffix Counting

Stores cumulative information from right to left.

### 3. Precomputation

Calculate reusable information once instead of repeatedly traversing the same elements.

### 4. Valid Split Boundary

Always iterate while:

```java
i < n - 1
```

This prevents an empty right substring.

---

## 📊 Complexity Comparison

| Approach | Time | Space |
|---|---:|---:|
| Brute Force | O(n²) | O(1) |
| Prefix & Suffix | O(n) | O(n) |

---

## 💡 Personal Learning Takeaway

The biggest lesson from this problem is recognizing repeated work.

Brute Force helps establish the logic, while Prefix and Suffix arrays demonstrate how precomputation improves efficiency.

**A good algorithm solves the problem. A better algorithm avoids doing unnecessary work.**

---

<p align="center">
  <b>🐰 DAY 479 — LEARN • IMPLEMENT • OPTIMIZE • REPEAT 🚀</b>
</p>
