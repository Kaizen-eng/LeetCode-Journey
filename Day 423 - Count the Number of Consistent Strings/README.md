# ✦ DAY 423 — LEETCODE 1684
## 𝟏𝟔𝟖𝟒. 𝐂𝐨𝐮𝐧𝐭 𝐭𝐡𝐞 𝐍𝐮𝐦𝐛𝐞𝐫 𝐨𝐟 𝐂𝐨𝐧𝐬𝐢𝐬𝐭𝐞𝐧𝐭 𝐒𝐭𝐫𝐢𝐧𝐠𝐬

**✦ 𝐏𝐫𝐨𝐛𝐥𝐞𝐦 𝐋𝐢𝐧𝐤:** https://leetcode.com/problems/count-the-number-of-consistent-strings/

**✦ 𝐃𝐢𝐟𝐟𝐢𝐜𝐮𝐥𝐭𝐲:** Easy

**✦ 𝐓𝐨𝐩𝐢𝐜𝐬:** Strings · Arrays · HashSet · Nested Loops

---

### ✦ 𝐏𝐑𝐎𝐁𝐋𝐄𝐌 𝐒𝐓𝐀𝐓𝐄𝐌𝐄𝐍𝐓

Given a string `allowed` containing distinct lowercase English letters and an array of strings `words`, count the number of consistent strings.

A string is **consistent** if every character in it appears in `allowed`.

### ✦ 𝐄𝐗𝐀𝐌𝐏𝐋𝐄

**Input**
```text
allowed = "ab"
words = ["ad","bd","aaab","baa","badab"]
```

**Output**
```text
2
```

**Explanation**

✦ `"aaab"` contains only allowed characters.

✦ `"baa"` contains only allowed characters.

✦ All other strings contain at least one forbidden character.

### ✦ 𝐀𝐏𝐏𝐑𝐎𝐀𝐂𝐇 — 𝐇𝐀𝐒𝐇𝐒𝐄𝐓

✦ Store every character in `allowedSet` using a `HashSet<Character>`.

✦ Traverse each word using an outer enhanced `for` loop.

✦ Inspect every character using an inner loop.

✦ If a character is absent from `allowedSet`, mark the word inconsistent and use `break`.

✦ Increment the count only if the entire word is consistent.

### ✦ 𝐂𝐎𝐌𝐏𝐋𝐄𝐗𝐈𝐓𝐘

✦ **Time:** `O(A + C)` average, where `A` is the length of `allowed` and `C` is the total number of characters across all words.

✦ **Auxiliary Space:** `O(A)` for the set of allowed characters.

### ✦ 𝐊𝐄𝐘 𝐋𝐄𝐀𝐑𝐍𝐈𝐍𝐆

**Count valid words, not valid characters.**

One forbidden character invalidates the entire word.

---

✦ **Day 423 — Another problem solved. Another concept mastered. Another step forward.** 🔥

**#LeetCode #Java #DSA #ProblemSolving #100DaysOfCode**
