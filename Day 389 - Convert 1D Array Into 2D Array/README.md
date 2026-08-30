# LeetCode 2022 - Convert 1D Array Into 2D Array

## 🧩 Problem

Given a 1D integer array `original` and two integers `m` and `n`, construct a 2D array with `m` rows and `n` columns while preserving the order of elements.

If it is impossible to construct the required 2D array, return an empty 2D array.

## 💡 Approach

1. Check whether `original.length == m * n`.
2. If the sizes don't match, return an empty 2D array.
3. Create an `m × n` result matrix.
4. For every element at index `i`:
   - Row = `i / n`
   - Column = `i % n`
5. Place the element into the calculated position.

## ⏱️ Complexity

- Time: `O(m × n)`
- Space: `O(m × n)`

## 🧠 Key Takeaway

A 1D index can be converted into a 2D position using:

`row = i / n`

`column = i % n`

This is a useful pattern when converting between 1D and 2D representations.
