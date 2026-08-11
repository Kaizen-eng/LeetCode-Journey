# Day 369 - Reverse Prefix of Word

## LeetCode 2000

### Problem
Given a string `word` and a character `ch`, reverse the segment of
`word` starting from index `0` and ending at the first occurrence
of `ch`.

If `ch` does not exist in the string, return the original string.

### Approach

1. Find the first occurrence of `ch` using `indexOf()`.
2. Extract the prefix from index `0` to `index + 1`.
3. Store the prefix in a `StringBuilder`.
4. Reverse the prefix using `reverse()`.
5. Append the remaining part of the original string.
6. Return the resulting string.

### Example

Input:
`word = "abcdefd"`
`ch = 'd'`

Prefix:
`"abcd"`

Reversed prefix:
`"dcba"`

Remaining part:
`"efd"`

Output:
`"dcbaefd"`

### Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(n)`

### Language

Java
