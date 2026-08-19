# 2643. Row With Maximum Ones

## ✧ Problem

Given a binary matrix `mat`, find the **0-indexed row** that contains the maximum number of `1`s.

Return an array containing:

- ✧ The index of the row.
- ✧ The number of `1`s in that row.

If multiple rows contain the same maximum number of `1`s, return the row with the **smallest index**.

---

## ✧ Approach

Traverse the matrix row by row.

For every row:

1. ✧ Count the number of `1`s.
2. ✧ Compare the count with the current maximum.
3. ✧ If the current row has more `1`s, update the answer.

We use `<` instead of `<=` so that when two rows have the same number of `1`s, the earlier row remains selected.

---

## ✧ Key Concept

```text
mat.length      → number of rows
mat[0].length   → number of columns
mat[i][j]       → element at row i, column j
```

---

## ✧ Complexity

**Time Complexity:** `O(m × n)`

**Space Complexity:** `O(1)` extra space.

---

## ✧ Example

```text
Input:
mat = [[0,0,0],
       [0,1,1]]

Output:
[1,2]
```

The second row contains the maximum number of `1`s: `2`.

---

## ✧ LeetCode

**Problem:** 2643. Row With Maximum Ones

**Difficulty:** Easy

**Language:** Java

---

> Another problem solved. Another concept understood. Another step forward. 🚀
