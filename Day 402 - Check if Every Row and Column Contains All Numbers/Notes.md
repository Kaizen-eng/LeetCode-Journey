# LeetCode 2133 — Notes

## ✦ Core Concept

The problem is about checking whether every **𝐑𝐨𝐰** and **𝐂𝐨𝐥𝐮𝐦𝐧** of an `n × n` matrix contains all numbers from `1` to `n` without duplicates.

## ✦ Approach

✦ Use a **𝐁𝐨𝐨𝐥𝐞𝐚𝐧 𝐀𝐫𝐫𝐚𝐲** to keep track of the numbers already encountered.

✦ For every row, create a fresh `seen` array and check each element.

✦ If a number has already been seen, return `false`.

✦ Repeat the same process for every column.

✦ If no duplicates are found in any row or column, return `true`.

## ✦ Important Observation

Since the matrix contains values from `1` to `n`, each row and column has exactly `n` elements.

Therefore, if there are **𝐧𝐨 𝐝𝐮𝐩𝐥𝐢𝐜𝐚𝐭𝐞𝐬**, the row or column must contain every number from `1` to `n`.

## ✦ Complexity

✦ **𝐓𝐢𝐦𝐞 𝐂𝐨𝐦𝐩𝐥𝐞𝐱𝐢𝐭𝐲:** `O(n²)`

✦ **𝐒𝐩𝐚𝐜𝐞 𝐂𝐨𝐦𝐩𝐥𝐞𝐱𝐢𝐭𝐲:** `O(n)`

## ✦ Key Takeaway

A simple **𝐃𝐮𝐩𝐥𝐢𝐜𝐚𝐭𝐞 𝐂𝐡𝐞𝐜𝐤** using a boolean array is enough to validate the entire matrix efficiently.

The important part is understanding that we only need to validate **rows and columns independently**.
