
# 2899. Last Visited Integers

✦ Day 437 of My LeetCode Journey 🚀

- **Difficulty:** Easy
- **Language:** Java
- **Topic:** Arrays and List Operations

## ✦ Problem

Given an integer array `nums`, each element is either a positive integer or `-1`.

For every `-1`, return the corresponding last visited integer. If the required integer does not exist, return `-1`.

## ✦ Approach

- Maintain a list `seen` in most-recent-first order.
- Maintain a counter for consecutive `-1` values.
- For each `-1`, retrieve `seen.get(counter - 1)` if valid.
- Otherwise, append `-1` to the answer.
- Insert positive integers at the front and reset the counter.

## ✦ Example

Input: `[1, 2, -1, -1, -1]`

Output: `[2, 1, -1]`

## ✦ Complexity

- Time: O(n²) worst case
- Auxiliary Space: O(n)

## ✦ Key Takeaway

The position of the requested integer depends on the
number of consecutive `-1` values encountered.
