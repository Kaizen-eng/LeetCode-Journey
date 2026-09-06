# LeetCode 2500 — Delete Greatest Value in Each Row

## 🧩 Problem

Given an `m x n` grid, repeatedly:

1. Delete the largest value from each row.
2. Find the largest value among the deleted values.
3. Add that value to the answer.

Return the total sum.

## 💡 Approach

Sort every row in ascending order.

After sorting, the greatest elements of each row are located at the last column. We can process the columns from right to left.

For each column:
- Find the maximum value across all rows.
- Add it to the answer.

Since every row is sorted, processing the columns from right to left simulates repeatedly deleting the greatest element from each row.

## 🔍 Example

```text
grid = [
    [1, 2, 4],
    [3, 3, 1]
]
```

After sorting:

```text
[
    [1, 2, 4],
    [1, 3, 3]
]
```

Process from right to left:

```text
max(4, 3) = 4
max(2, 3) = 3
max(1, 1) = 1

Answer = 4 + 3 + 1 = 8
```

## ⏱️ Complexity

- **Time:** O(m × n log n)
- **Space:** O(1) auxiliary space

## 🧠 Key Takeaway

A 2D Java array is an array of 1D arrays, so each row can be sorted independently using:

```java
Arrays.sort(row);
```

Then the problem becomes a simple column-wise maximum calculation.
