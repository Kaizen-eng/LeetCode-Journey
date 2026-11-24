# 🌟 Day 475 — 1047. Remove All Adjacent Duplicates In String

<p align="center">
  <img src="https://img.shields.io/badge/LeetCode-1047-orange?style=for-the-badge&logo=leetcode" />
  <img src="https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Topic-Stack-blue?style=for-the-badge" />
</p>

## 🎯 Problem Statement

Given a string `s`, repeatedly remove pairs of adjacent identical characters until no more such removals are possible.

Return the final string.

**Problem Link:** [LeetCode 1047](https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/)

## 💡 Examples

**Example 1**

```text
Input:  s = "abbaca"
Output: "ca"
```

Explanation:

- Remove `bb` → `aaca`
- Remove `aa` → `ca`

**Example 2**

```text
Input:  s = "azxxzy"
Output: "ay"
```

Explanation:

- Remove `xx` → `azzy`
- Remove `zz` → `ay`

## 🚀 Approach — Stack

We use a stack to process each character exactly once.

✦ If the stack is empty, push the current character.

✦ If the top character equals the current character, pop the top character.

✦ Otherwise, push the current character.

✦ Finally, combine the remaining stack characters into the result.

## 🔍 Dry Run

Input: `abbaca`

| Character | Operation | Stack |
|---|---|---|
| a | Push | a |
| b | Push | ab |
| b | Pop | a |
| a | Pop | Empty |
| c | Push | c |
| a | Push | ca |

**Final Output:** `ca`

## 📊 Complexity Analysis

| Complexity | Value | Explanation |
|---|---|---|
| Time | O(n) | Each character is processed once |
| Space | O(n) | Stack stores remaining characters |

## 🧠 Key Takeaways

✦ Stack follows the **LIFO (Last In, First Out)** principle.

✦ Only the most recently added character needs to be checked.

✦ Removing duplicates can create new adjacent duplicates.

✦ A single traversal handles cascading removals automatically.

## 🏆 What We Practiced

- Stack operations: Push, Peek and Pop
- String manipulation
- Zero-based indexing in Java
- Negative indexing in Python
- Efficient O(n) processing

---

<p align="center">
  <b>🔥 Day 475 — Another Problem Conquered!</b><br/>
  <i>Consistency builds algorithms. Algorithms build problem solvers.</i>
</p>
