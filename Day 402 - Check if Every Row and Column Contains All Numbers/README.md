# ✦ LeetCode 2133 — Check if Every Row and Column Contains All Numbers

## 📌 Problem
Given an `n × n` matrix, determine whether every row and every column contains all integers from `1` to `n`.

## 💡 Approach
✦ Use a **𝐁𝐨𝐨𝐥𝐞𝐚𝐧 𝐀𝐫𝐫𝐚𝐲** to track whether a number has already appeared.

✦ Traverse each **𝐑𝐨𝐰** and detect duplicate values.

✦ Traverse each **𝐂𝐨𝐥𝐮𝐦𝐧** using the same validation logic.

✦ Return `false` as soon as a duplicate is found.

✦ If all rows and columns are valid, return `true`.

## 🧠 Key Insight
Since the matrix contains values from `1` to `n`, a row or column containing `n` values with no duplicates must contain every number from `1` to `n`.

## ⏱️ Complexity
✦ **𝐓𝐢𝐦𝐞:** O(n²)

✦ **𝐒𝐩𝐚𝐜𝐞:** O(n)

## 📂 Files
✦ `README.md` — Problem explanation and approach.

✦ `Notes.md` — Key concepts and observations.

✦ `Solutions.java` — Java solution.

## 🔥 Takeaway
**Simple validation + careful traversal = an efficient matrix solution.**

Another day, another problem, another piece added to the DSA toolkit. 🚀

**Day 402 — Keep coding. Keep improving.** 💻🔥
