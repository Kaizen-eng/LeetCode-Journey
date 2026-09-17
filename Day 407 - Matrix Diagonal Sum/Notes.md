
---

# 📝 `Notes.md`

```markdown
# Notes - LeetCode 1572: Matrix Diagonal Sum

## Core Idea

For an `n x n` matrix, every row contributes exactly two diagonal elements.

### Primary Diagonal

The row and column indices are the same:
```

```text
mat[i][i]
```
```text
[1 2 3]
[4 5 6]
[7 8 9]

  ↘
1
    5
      9
```

```markdown
Secondary Diagonal
The row increases while the column decreases:
```

```text
mat[i][n - 1 - i]

[1 2 3]
[4 5 6]
[7 8 9]

      3
    5
  7
```
