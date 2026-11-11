# ✦ DAY 462 — Learning Notes

## 📚 Problem: Maximum Ascending Subarray Sum

**LeetCode:** 1800

### 𝗞𝗲𝘆 𝗖𝗼𝗻𝗰𝗲𝗽𝘁

A strictly ascending subarray requires:

`nums[i] > nums[i-1]`

If this condition fails, the current ascending sequence breaks.

### 🧠 𝗔𝗽𝗽𝗿𝗼𝗮𝗰𝗵

Maintain two variables:

- `curr_sum`: Current ascending subarray sum.
- `pre_sum`: Maximum sum found so far.

### ⚙️ 𝗔𝗹𝗴𝗼𝗿𝗶𝘁𝗵𝗺

1. Initialize both sums using `nums[0]`.
2. Iterate from index `1`.
3. Compare the current element with its previous element.
4. If ascending, add the current element to `curr_sum`.
5. Otherwise, reset `curr_sum` to the current element.
6. Update `pre_sum` using the maximum of both sums.
7. Return `pre_sum`.

### 🔍 𝗗𝗿𝘆 𝗥𝘂𝗻

**Input:**

`[12,17,15,13,10,11,12]`

| Element | Operation | Current Sum | Maximum |
|:---:|:---|---:|---:|
| 12 | Initialize | 12 | 12 |
| 17 | Add | 29 | 29 |
| 15 | Reset | 15 | 29 |
| 13 | Reset | 13 | 29 |
| 10 | Reset | 10 | 29 |
| 11 | Add | 21 | 29 |
| 12 | Add | 33 | 33 |

**Final Answer: 33** 🏆

### ⚠️ 𝗜𝗺𝗽𝗼𝗿𝘁𝗮𝗻𝘁 𝗟𝗲𝗮𝗿𝗻𝗶𝗻𝗴

Why reset `curr_sum` to `nums[i]` instead of `0`?

Because the current element becomes the first element of the next potential ascending subarray.

Also, updating `pre_sum` inside the loop ensures that the final ascending sequence is considered.

### 📊 𝗖𝗼𝗺𝗽𝗹𝗲𝘅𝗶𝘁𝘆

✦ Time: `O(n)` — Single traversal.

✦ Space: `O(1)` — Only two variables.

---

### 🌟 𝗧𝗮𝗸𝗲𝗮𝘄𝗮𝘆

A single traversal with the right state management can solve an array problem efficiently without requiring additional data structures.

**Day 462 — Another step forward!** 🚀
