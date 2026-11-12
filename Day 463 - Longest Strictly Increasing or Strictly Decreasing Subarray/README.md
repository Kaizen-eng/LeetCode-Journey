# ✦ 𝐃𝐀𝐘 𝟒𝟔𝟑 — 𝐋𝐞𝐞𝐭𝐂𝐨𝐝𝐞 𝐃𝐚𝐢𝐥𝐲 𝐂𝐡𝐚𝐥𝐥𝐞𝐧𝐠𝐞

### 🚀 3105. Longest Strictly Increasing or Strictly Decreasing Subarray

**✦ Difficulty:** Easy

**✦ Topic:** Array · Sliding Window · Greedy

**✦ Language:** Java & Python

---

### 🎯 𝐏𝐫𝐨𝐛𝐥𝐞𝐦 𝐎𝐛𝐣𝐞𝐜𝐭𝐢𝐯𝐞

Given an integer array `nums`, find the length of the longest contiguous subarray that is either strictly increasing or strictly decreasing.

### 💡 𝐀𝐩𝐩𝐫𝐨𝐚𝐜𝐡

Instead of repeatedly generating and checking subarrays, we traverse the array once while maintaining two counters:

✦ `increasing` — Tracks the current strictly increasing sequence.

✦ `decreasing` — Tracks the current strictly decreasing sequence.

✦ `maximum` — Stores the longest valid sequence encountered.

Each adjacent pair determines whether the corresponding counter continues or resets.

### ⚡ 𝐂𝐨𝐦𝐩𝐥𝐞𝐱𝐢𝐭𝐲

- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

### 🏆 𝐊𝐞𝐲 𝐋𝐞𝐚𝐫𝐧𝐢𝐧𝐠

A contiguous subarray does not always require explicit slicing.

Sometimes, tracking relationships between adjacent elements is sufficient to solve the problem efficiently!

---

**✦ Day 463 — Another problem solved, another concept mastered!**

*Consistency builds the algorithmist.*
