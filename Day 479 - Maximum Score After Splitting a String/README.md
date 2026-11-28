# 🏆 LeetCode Day 479 — 1422. Maximum Score After Splitting a String

<p align="center">
  <img src="https://img.shields.io/badge/LeetCode-1422-orange?style=for-the-badge&logo=leetcode" />
  <img src="https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Topic-String-blue?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Topic-Prefix%20Sum-purple?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Day-479-gold?style=for-the-badge" />
</p>

<p align="center">
  <b>Two Languages • Two Approaches • One Consistent Learning Journey</b>
</p>

---

## 📌 Problem Overview

Given a binary string `s`, split it into two non-empty substrings:

- The left substring must contain at least one character.
- The right substring must contain at least one character.

The score of a split is calculated as:

**Score = Number of zeros in the left substring + Number of ones in the right substring.**

Return the maximum possible score among all valid splitting positions.

🔗 **Problem Link:** [LeetCode 1422](https://leetcode.com/problems/maximum-score-after-splitting-a-string/)

---

## 🧪 Example Walkthrough

**Example 1:**

```text
Input: s = "011101"
Output: 5
```

| Split | Left Zeros | Right Ones | Score |
|:---|---:|---:|---:|
| `0 | 11101` | 1 | 4 | **5** |
| `01 | 1101` | 1 | 3 | 4 |
| `011 | 101` | 1 | 2 | 3 |
| `0111 | 01` | 1 | 1 | 2 |
| `01110 | 1` | 2 | 1 | 3 |

**Explanation:** Splitting the string into `"0"` and `"11101"` produces the maximum score of `1 + 4 = 5`.

**Example 2:**

```text
Input: s = "00111"
Output: 5
```

**Example 3:**

```text
Input: s = "1111"
Output: 3
```

---

## 🧠 Approach 1 — Brute Force

<details>
<summary><b>🔍 Click to explore the approach</b></summary>

### 💡 Intuition

Try every possible valid splitting position.

For each split:

1. Traverse the left substring and count zeros.
2. Traverse the right substring and count ones.
3. Add both counts to calculate the score.
4. Update the maximum score.

Every possible split is independently evaluated.

### 💻 Java Implementation

File: `Solution1.java`

```java
class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int maxScore = 0;

        for (int i = 1; i < n; i++) {
            int zeros = 0;
            int ones = 0;

            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == '0') {
                    zeros++;
                }
            }

            for (int j = i; j < n; j++) {
                if (s.charAt(j) == '1') {
                    ones++;
                }
            }

            maxScore = Math.max(maxScore, zeros + ones);
        }

        return maxScore;
    }
}
```

### 🐍 Python Implementation

File: `Solution1.py`

```python
class Solution:
    def maxScore(self, s: str) -> int:
        n = len(s)
        max_score = 0

        for i in range(1, n):
            zeros = 0
            ones = 0

            for j in range(i):
                if s[j] == '0':
                    zeros += 1

            for j in range(i, n):
                if s[j] == '1':
                    ones += 1

            max_score = max(max_score, zeros + ones)

        return max_score
```

### ⏱️ Complexity Analysis

- **Time Complexity:** O(n²)
  - There are O(n) possible splitting positions.
  - Each split requires traversing the string to count zeros and ones.
- **Space Complexity:** O(1)
  - Only a few variables are maintained.

</details>

---

## ⚡ Approach 2 — Prefix & Suffix Arrays

<details>
<summary><b>🔍 Click to explore the approach</b></summary>

### 💡 Intuition

Instead of repeatedly counting zeros and ones for every split, precompute their counts using two arrays.

**1. Prefix Zero Array**

`prefixZeros[i]` stores the number of zeros from index `0` through index `i`.

**2. Suffix One Array**

`suffixOnes[i]` stores the number of ones from index `i` through the final index.

For a split after index `i`:

```text
Left  = s[0 ... i]
Right = s[i+1 ... n-1]
```

The score becomes:

**Score = prefixZeros[i] + suffixOnes[i + 1]**

This allows every splitting position to be evaluated in constant time after preprocessing.

### 💻 Java Implementation

File: `Solution2.java`

```java
class Solution {
    public int maxScore(String s) {
        int n = s.length();

        int[] prefixZeros = new int[n];
        int[] suffixOnes = new int[n];

        prefixZeros[0] =
            (s.charAt(0) == '0') ? 1 : 0;

        for (int i = 1; i < n; i++) {
            prefixZeros[i] = prefixZeros[i - 1];

            if (s.charAt(i) == '0') {
                prefixZeros[i]++;
            }
        }

        suffixOnes[n - 1] =
            (s.charAt(n - 1) == '1') ? 1 : 0;

        for (int i = n - 2; i >= 0; i--) {
            suffixOnes[i] = suffixOnes[i + 1];

            if (s.charAt(i) == '1') {
                suffixOnes[i]++;
            }
        }

        int maxScore = 0;

        for (int i = 0; i < n - 1; i++) {
            int score = prefixZeros[i] + suffixOnes[i + 1];

            maxScore = Math.max(maxScore, score);
        }

        return maxScore;
    }
}
```

### 🐍 Python Implementation

File: `Solution2.py`

```python
class Solution:
    def maxScore(self, s: str) -> int:
        n = len(s)

        prefix_zeros = [0] * n
        suffix_ones = [0] * n

        prefix_zeros[0] = int(s[0] == '0')

        for i in range(1, n):
            prefix_zeros[i] = prefix_zeros[i - 1]

            if s[i] == '0':
                prefix_zeros[i] += 1

        suffix_ones[-1] = int(s[-1] == '1')

        for i in range(n - 2, -1, -1):
            suffix_ones[i] = suffix_ones[i + 1]

            if s[i] == '1':
                suffix_ones[i] += 1

        max_score = 0

        for i in range(n - 1):
            score = prefix_zeros[i] + suffix_ones[i + 1]
            max_score = max(max_score, score)

        return max_score
```

### ⏱️ Complexity Analysis

- **Time Complexity:** O(n)
  - Prefix array construction takes O(n).
  - Suffix array construction takes O(n).
  - Evaluating all valid splits takes O(n).
- **Space Complexity:** O(n)
  - Two auxiliary arrays of size n are maintained.

</details>

---

## 📊 Approach Comparison

| Feature | Brute Force | Prefix & Suffix |
|:---|:---:|:---:|
| Traversal | Repeated | Precomputed |
| Time Complexity | O(n²) | O(n) |
| Space Complexity | O(1) | O(n) |
| Implementation | Simple | Structured |
| Efficiency | Lower | Higher |

---

## 🧩 Key Learnings

✦ Every valid split must leave both substrings non-empty.

✦ Repeated counting can become expensive when performed independently for every split.

✦ Prefix arrays efficiently store information about the left portion.

✦ Suffix arrays efficiently store information about the right portion.

✦ Precomputation transforms repeated O(n) work into O(1) queries.

✦ Choosing the right data representation can significantly improve algorithm efficiency.

---

## 🎯 Final Takeaway

**Approach 1:** Understand the problem by checking every possible split.

**Approach 2:** Optimize repeated calculations using Prefix and Suffix arrays.

The key lesson is simple:

**Don't repeat a calculation when you can precompute and reuse its result.**

---

<p align="center">
  <b>🌟 Day 479 — Another Problem Solved, Another Concept Mastered!</b>
</p>

<p align="center">
  <i>Consistency builds logic. Practice builds mastery. 🚀</i>
</p>
