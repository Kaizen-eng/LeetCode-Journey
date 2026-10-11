# ✦ 𝐃𝐚𝐲 𝟒𝟑𝟏 — LeetCode 2778

## ✦ 𝐒𝐮𝐦 𝐨𝐟 𝐒𝐪𝐮𝐚𝐫𝐞𝐬 𝐨𝐟 𝐒𝐩𝐞𝐜𝐢𝐚𝐥 𝐄𝐥𝐞𝐦𝐞𝐧𝐭𝐬

**Difficulty:** Easy  
**Language:** Java  
**Status:** Accepted — 1437/1437 test cases passed  
**Runtime shown:** 1 ms

---

## ✦ 𝐏𝐫𝐨𝐛𝐥𝐞𝐦 𝐒𝐮𝐦𝐦𝐚𝐫𝐲

Given an integer array `nums` of length `n`, an element is *special* when its **1-based index** divides `n`.

Return the sum of the squares of every special element.

## ✦ 𝐄𝐱𝐚𝐦𝐩𝐥𝐞

**Input:** `nums = [1, 2, 3, 4]`  
**Output:** `21`

The special 1-based indices are `1`, `2`, and `4`, because each divides `n = 4`.

`1² + 2² + 4² = 1 + 4 + 16 = 21`

## ✦ 𝐀𝐩𝐩𝐫𝐨𝐚𝐜𝐡

✦ Traverse the array using Java's 0-based index `i`.

✦ Convert it to the problem's 1-based index with `i + 1`.

✦ If `n % (i + 1) == 0`, square `nums[i]` and add it to the sum.

✦ Return the accumulated sum.

## ✦ 𝐂𝐨𝐦𝐩𝐥𝐞𝐱𝐢𝐭𝐲

- **Time:** `O(n)` — each element is checked once.
- **Extra space:** `O(1)` — only a few variables are used.

## ✦ 𝐒𝐨𝐥𝐮𝐭𝐢𝐨𝐧

See [`Solution.java`](Solution.java).

## ✦ 𝐋𝐞𝐬𝐬𝐨𝐧 𝐨𝐟 𝐭𝐡𝐞 𝐃𝐚𝐲

Java arrays are **0-indexed**, but this problem defines special elements using **1-based indices**. The `i + 1` conversion is essential; using `i` directly would cause division by zero on the first iteration.
