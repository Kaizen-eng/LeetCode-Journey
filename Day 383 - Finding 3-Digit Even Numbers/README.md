**LeetCode 2094** | Easy | Java

Given an array of digits, return every unique three-digit even number that can be formed using the supplied digits. Each digit position may be used at most once per number.

## Approach

Try every ordered choice of three distinct digit indices.

- The first digit cannot be `0`, since the result must have three digits.
- The last digit must be even.
- Store each valid number in a boolean lookup array to remove duplicates.
- Read the lookup array from `100` to `999`, which naturally produces ascending order.

## Complexity

- Time: `O(n³ + 900)`
- Space: `O(1000)`

## Example

For `digits = [2, 1, 3, 0]`, valid results include `102`, `120`, `130`, `132`, `210`, `230`, `302`, and `320`.
