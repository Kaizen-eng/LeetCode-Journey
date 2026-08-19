# Notes — Row With Maximum Ones

## ✧ Main Idea

This is a straightforward **2D array traversal** problem.

We need to visit every element and count how many `1`s appear in each row.

---

## ✧ The Important Click 🧠⚡

The biggest thing I learned today was understanding:

```text
mat.length
```

and

```text
mat[0].length
```

### `mat.length`

Tells us how many **rows** are present.

```text
mat = [
    [1, 0, 1],   ← row 0
    [0, 1, 1],   ← row 1
    [1, 1, 1]    ← row 2
]

mat.length = 3
```

### `mat[0].length`

Tells us how many **columns** are present in the first row.

```text
[1, 0, 1]
 ↑  ↑  ↑
  3 columns

mat[0].length = 3
```

So the matrix traversal becomes:

```java
for (int i = 0; i < mat.length; i++) {
    
    for (int j = 0; j < mat[0].length; j++) {
        
        mat[i][j];
    }
}
```

---

## ✧ Remember This

```text
i → row
j → column

mat.length        → rows
mat[0].length     → columns

mat[i][j]         → current element
```

---

## ✧ Tie Handling

The condition is:

```java
if (max < count)
```

NOT:

```java
if (max <= count)
```

Why?

Because the problem asks for the **smallest row index** when multiple rows have the same maximum number of `1`s.

Since we traverse from top to bottom, the first row with that maximum should stay selected.

---

## ✧ Personal Takeaway

The algorithm itself was simple, but understanding the structure of a 2D array made the solution much clearer.

**`mat.length` = rows.**  
**`mat[0].length` = columns.**

That little distinction finally clicked today. 😂⚡

---

## ✧ Complexity

```text
Time  → O(m × n)
Space → O(1)
```
