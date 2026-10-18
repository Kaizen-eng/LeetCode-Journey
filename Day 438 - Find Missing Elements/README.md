# ✦ 𝗗𝗮𝘆 𝟰𝟯𝟴 — 𝗙𝗶𝗻𝗱 𝗠𝗶𝘀𝘀𝗶𝗻𝗴 𝗘𝗹𝗲𝗺𝗲𝗻𝘁𝘀

**LeetCode 3731 | Java | Python**

## ✦ 𝗣𝗿𝗼𝗯𝗹𝗲𝗺 𝗢𝘃𝗲𝗿𝘃𝗶𝗲𝘄

Given an integer array `nums`, find all missing integers between its smallest and largest elements, and return them in ascending order.

## ✦ 𝗘𝘅𝗮𝗺𝗽𝗹𝗲

**Input:** `nums = [1, 4, 2, 5]`

**Output:** `[3]`

**Explanation:** The integer range is `1` to `5`. All integers are present except `3`.

## ✦ 𝗔𝗽𝗽𝗿𝗼𝗮𝗰𝗵

✦ Find the minimum and maximum elements using built-in functions.

✦ Traverse every integer from the minimum to the maximum, inclusive.

✦ Check whether each integer exists in the original array.

✦ Add missing integers to the result list and return it.

## ✦ 𝗖𝗼𝗺𝗽𝗹𝗲𝘅𝗶𝘁𝘆

Let `n` be the array length and `r = max(nums) - min(nums) + 1` be the size of the integer range.

✦ **Time Complexity:** `O(n × r)` using repeated linear membership checks.

✦ **Auxiliary Space:** `O(r)` for the result in the worst case, excluding the returned output's storage where appropriate.

## ✦ 𝗞𝗲𝘆 𝗟𝗲𝗮𝗿𝗻𝗶𝗻𝗴

Built-in functions simplify minimum and maximum operations. Understanding membership checks and their time complexity helps identify opportunities for optimization.

**Languages:** Java ☕ | Python 🐍
