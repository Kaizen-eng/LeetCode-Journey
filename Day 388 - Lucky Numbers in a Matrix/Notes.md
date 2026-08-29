# Notes - LeetCode 1380

## Key Idea

A lucky number must satisfy TWO conditions:

1. It must be the minimum in its row.
2. It must be the maximum in its column.

Instead of trying to find both conditions at once, calculate them separately.

## Step 1 - Row Minimum

For every row:

    rowMin[i] = minimum value in row i

Example:

    [3, 7, 8]       → 3
    [9, 11, 13]     → 9
    [15, 16, 17]    → 15

Therefore:

    rowMin = [3, 9, 15]

## Step 2 - Column Maximum

For every column:

    colMax[j] = maximum value in column j

Example:

    Column 0 → max(3, 9, 15) = 15
    Column 1 → max(7, 11, 16) = 16
    Column 2 → max(8, 13, 17) = 17

Therefore:

    colMax = [15, 16, 17]

## Step 3 - Check Both Conditions

For every matrix[i][j]:

    matrix[i][j] == rowMin[i]
    &&
    matrix[i][j] == colMax[j]

If both are true, the element is a lucky number.

For example:

    matrix[2][0] = 15

    15 == rowMin[2]  → true
    15 == colMax[0]  → true

Therefore:

    15 is a lucky number.

## Important Learning

When a problem has multiple conditions, we don't always need
to solve everything simultaneously.

Break the conditions into smaller parts and combine the results.

## Complexity

Let:
- m = number of rows
- n = number of columns

Time Complexity:
O(m × n)

Space Complexity:
O(m + n)
