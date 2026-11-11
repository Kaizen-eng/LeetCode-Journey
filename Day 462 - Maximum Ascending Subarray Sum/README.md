# ✦ DAY 462 — Maximum Ascending Subarray Sum

### 🚀 LeetCode 1800 | Array | Easy

---

### 📌 𝗣𝗿𝗼𝗯𝗹𝗲𝗺 𝗦𝘁𝗮𝘁𝗲𝗺𝗲𝗻𝘁

Given an array of positive integers, find the maximum possible sum of a **strictly ascending contiguous subarray**.

A subarray is a continuous sequence of elements within an array.

### 💡 𝗔𝗽𝗽𝗿𝗼𝗮𝗰𝗵 — Greedy

We traverse the array once while maintaining two variables:

✦ `curr_sum` — Tracks the sum of the current ascending subarray.

✦ `pre_sum` — Stores the maximum ascending subarray sum encountered so far.

**Logic:**
- Initialize both variables with the first array element.
- If the current element is greater than the previous element, extend the current sum.
- Otherwise, start a new ascending subarray.
- Update the maximum sum at every iteration.

### 🧪 𝗘𝘅𝗮𝗺𝗽𝗹𝗲

**Input:**
`nums = [10,20,30,5,10,50]`

**Output:**
`65`

**Explanation:**

The maximum ascending subarray is `[5,10,50]`.

Its sum is `5 + 10 + 50 = 65`.

### ⚡ 𝗖𝗼𝗺𝗽𝗹𝗲𝘅𝗶𝘁𝘆

✦ Time Complexity: `O(n)`

✦ Space Complexity: `O(1)`

### 🏆 𝗞𝗲𝘆 𝗟𝗲𝗮𝗿𝗻𝗶𝗻𝗴

- Understanding contiguous subarrays.
- Applying greedy techniques.
- Maintaining running sums.
- Optimizing array traversal using constant space.

---

### 💻 𝗜𝗺𝗽𝗹𝗲𝗺𝗲𝗻𝘁𝗮𝘁𝗶𝗼𝗻𝘀

✦ Python 🐍

✦ Java ☕

---

**Day 462 completed successfully!**

✧ Consistency builds logic.  
✧ Logic builds skill.  
✧ Skill builds opportunities.

**One problem at a time. One step closer to mastery.** 🚀
