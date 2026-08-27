# Notes — LeetCode 2500

## 🔑 Key Concepts

### 1. Sorting Every Row

A 2D array in Java is essentially an array containing multiple 1D arrays.

So instead of:

```java
Arrays.sort(grid);
```

we sort every row individually:

```java
for (int[] row : grid) {
    Arrays.sort(row);
}
```

### 2. Finding Rows and Columns

```java
int rows = grid.length;
int cols = grid[0].length;
```

- `grid.length` → number of rows
- `grid[0].length` → number of columns

### 3. Why Process From Right to Left?

After sorting each row, the largest element of every row is at the last position.

Therefore:

```text
last column → largest elements
second-last → second-largest elements
...
first column → smallest elements
```

So we can simulate the deletion process by traversing columns from:

```java
cols - 1
```

down to:

```java
0
```

### 4. Finding the Maximum

For every column, compare the corresponding element from every row:

```java
greatest = Math.max(greatest, grid[row][col]);
```

Then add the greatest value to the answer.

## 🧠 Main Pattern

```text
Sort each row
     ↓
Start from the last column
     ↓
Find maximum across rows
     ↓
Add to answer
     ↓
Move left
```

## 📌 Takeaway

Sometimes a problem that sounds like it requires repeatedly deleting elements can be simplified by sorting first and observing the resulting structure.
