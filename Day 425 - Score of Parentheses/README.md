# ✦ LeetCode 856 — Score of Parentheses

## 𝗣𝗿𝗼𝗯𝗹𝗲𝗺

Given a balanced parentheses string `s`, return its score.

The score follows three rules:

✦ `()` has a score of `1`.

✦ `AB` has a score of `A + B`, where `A` and `B` are balanced parentheses strings.

✦ `(A)` has a score of `2 × A`.

---

## 𝗔𝗽𝗽𝗿𝗼𝗮𝗰𝗵

Use a **𝗦𝘁𝗮𝗰𝗸** to maintain the score of each nested parentheses level.

✦ Push `0` when encountering `(` to start a new scoring level.

✦ When encountering `)`, pop the current inner score.

✦ If the inner score is `0`, the pair is `()`, so its score is `1`.

✦ Otherwise, the score is `2 × inner`.

✦ Add the calculated score to the parent level.

---

## 𝗖𝗼𝗺𝗽𝗹𝗲𝘅𝗶𝘁𝘆

✦ **Time Complexity:** `O(n)`

✦ **Space Complexity:** `O(n)`

Where `n` is the length of the parentheses string.

---

## 𝗞𝗲𝘆 𝗜𝗻𝘀𝗶𝗴𝗵𝘁

A closing parenthesis `)` tells us that one scoring level has been completed.

Therefore:

`()` → `1`

`(A)` → `2 × A`

`AB` → `A + B`

The stack lets us preserve the score of the surrounding level while calculating the current nested level.

---

## 𝗟𝗲𝗲𝘁𝗖𝗼𝗱𝗲

🔗 https://leetcode.com/problems/score-of-parentheses/

**Day 425 — Solved & Accepted ✅**
