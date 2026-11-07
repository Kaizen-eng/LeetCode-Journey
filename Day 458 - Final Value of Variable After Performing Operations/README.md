✦ 2011. Final Value of Variable After Performing Operations

<div align="center">✧ DAY 458 · LEETCODE CHALLENGE ✧

Java ☕ | Python 🐍

✦ ✧ ✦ ✧ ✦ ✧ ✦

</div>📌 Problem Description

There is a programming language with a single integer variable "X", initially set to "0".

You are given an array of strings called "operations". Each operation represents one of four commands:

Operation| Meaning
"++X"| Increment X
"X++"| Increment X
"--X"| Decrement X
"X--"| Decrement X

Return the final value of "X" after performing all operations.

💡 Approach

We can solve this problem using a simple conditional check.

1. Initialize "X = 0".
2. Iterate through every operation.
3. If the operation contains "+", increment "X".
4. Otherwise, decrement "X".
5. Return the final value.

🧪 Examples

Example 1:

Input: operations = ["--X","X++","X++"]
Output: 1

Example 2:

Input: operations = ["++X","++X","X++"]
Output: 3

Example 3:

Input: operations = ["X++","++X","--X","X--"]
Output: 0

⚡ Complexity Analysis

- Time Complexity: O(n) — We traverse the operations array exactly once.
- Space Complexity: O(1) — We use only one additional variable.

🎯 Key Takeaway

A simple conditional check is sufficient to identify whether an operation increments or decrements the variable.

No additional data structures are required!

---

<div align="center">✦ ✧ DAY 458 — QUEST COMPLETED ✧ ✦

Simple logic. Clean code. Consistent progress. 🚀

</div>
