# ![LeetCode](https://img.shields.io/badge/LeetCode-2124-orange?style=for-the-badge&logo=leetcode&logoColor=white)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen?style=for-the-badge)
![Java](https://img.shields.io/badge/Java-Solved-blue?style=for-the-badge&logo=openjdk&logoColor=white)
![Python](https://img.shields.io/badge/Python-Learned-yellow?style=for-the-badge&logo=python&logoColor=white)

# 𝗖𝗵𝗲𝗰𝗸 𝗶𝗳 𝗔𝗹𝗹 𝗔'𝘀 𝗔𝗽𝗽𝗲𝗮𝗿𝘀 𝗕𝗲𝗳𝗼𝗿𝗲 𝗔𝗹𝗹 𝗕'𝘀

🔗 **Problem:** [LeetCode 2124](https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/)

## ✦ 𝗣𝗿𝗼𝗯𝗹𝗲𝗺 𝗢𝘃𝗲𝗿𝘃𝗶𝗲𝘄

Given a string `s` consisting only of `'a'` and `'b'`, determine whether all occurrences of `'a'` appear before all occurrences of `'b'`.

Return `true` if the condition is satisfied; otherwise, return `false`.

## ✦ 𝗔𝗽𝗽𝗿𝗼𝗮𝗰𝗵 — 𝗦𝗶𝗺𝗽𝗹𝗲 𝗧𝗿𝗮𝗻𝘀𝗶𝘁𝗶𝗼𝗻 𝗖𝗵𝗲𝗰𝗸

✦ Traverse the string from the first character to the second-last character.

✦ Compare each character with its immediate next character.

✦ If the current character is `'b'` and the next character is `'a'`, the ordering is violated.

✦ Return `false` immediately when this forbidden `"ba"` transition is found.

✦ If no such transition exists, return `true`.

## ✦ 𝗖𝗼𝗱𝗲 𝗢𝗯𝘀𝗲𝗿𝘃𝗮𝘁𝗶𝗼𝗻

The only forbidden adjacent pattern is:

`"ba"`

If this pattern never occurs, all `'a'` characters appear before all `'b'` characters.

## ✦ 𝗖𝗼𝗺𝗽𝗹𝗲𝘅𝗶𝘁𝘆 𝗔𝗻𝗮𝗹𝘆𝘀𝗶𝘀

| Complexity | Value | Explanation |
|---|---|---|
| Time | O(n) | Single traversal of the string |
| Space | O(1) | Constant extra space |

## ✦ 𝗟𝗮𝗻𝗴𝘂𝗮𝗴𝗲𝘀

✦ Java — `Solutions.java`

✦ Python — `Solutions.py`

## ✦ 𝗞𝗲𝘆 𝗟𝗲𝗮𝗿𝗻𝗶𝗻𝗴𝘀

✦ Adjacent character comparison.

✦ Early return optimization.

✦ String indexing and traversal.

✦ Translating familiar Java logic into Python.

---

⭐ **One forbidden transition. One simple traversal. Clean logic.**
