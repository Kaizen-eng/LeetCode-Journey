# LeetCode 1572 - Matrix Diagonal Sum

## Problem

Given a square matrix `mat`, return the sum of the matrix's diagonals.

Only include:
- All elements on the primary diagonal.
- All elements on the secondary diagonal that are not already part of the primary diagonal.

---

## Approach 1 - Single-Loop Diagonal Traversal

Since the matrix is square, both diagonal elements can be accessed directly using their indices.

For every row `i`:

- Primary diagonal element: `mat[i][i]`
- Secondary diagonal element: `mat[i][n - 1 - i]`

Both elements are added during a single loop.

### Center Element

For an odd-sized matrix, the primary and secondary diagonals intersect at the center.

For example:

```text
1 2 3
4 5 6
7 8 9
```
