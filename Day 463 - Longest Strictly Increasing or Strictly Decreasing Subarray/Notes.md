# ✦ 𝐃𝐀𝐘 𝟒𝟔𝟑 — 𝐍𝐨𝐭𝐞𝐬

## 🧠 Problem: Longest Strictly Increasing or Strictly Decreasing Subarray

### 1. Understanding Contiguous Subarrays

A contiguous subarray consists of consecutive elements from the original array.

We don't need to generate every possible subarray to determine its longest increasing or decreasing sequence.

Instead, we can compare adjacent elements.

### 2. Variables

✦ `increasing = 1`

✦ `decreasing = 1`

✦ `maximum = 1`

Each counter represents the length of its respective current sequence.

### 3. Traversal Logic

Start iterating from index `1`.

**Case A: Increasing**

If `nums[i] > nums[i - 1]`:

- Increment `increasing`.
- Reset `decreasing` to `1`.

**Case B: Decreasing**

If `nums[i] < nums[i - 1]`:

- Increment `decreasing`.
- Reset `increasing` to `1`.

**Case C: Equal Elements**

If both elements are equal:

- Reset both counters to `1`.

Finally, update the maximum length.

### 4. Important Observation

Strictly increasing and strictly decreasing sequences cannot continue through equal adjacent elements.

Therefore, equality breaks both sequences.

### 5. Complexity Analysis

✦ Time Complexity: O(n) — One traversal of the array.

✦ Space Complexity: O(1) — Only three variables are maintained.

### 6. Edge Cases

| Input | Output | Explanation |
|---|---:|---|
| `[1]` | 1 | Single element |
| `[1, 2, 3, 4]` | 4 | Completely increasing |
| `[4, 3, 2, 1]` | 4 | Completely decreasing |
| `[1, 1, 1]` | 1 | Equal elements |
| `[1, 3, 2, 4, 5]` | 3 | Longest increasing sequence is `[2,4,5]` |

### ⭐ Key Takeaway

**Don't generate what you can track!**

A single traversal with carefully maintained counters can eliminate unnecessary subarray generation and improve efficiency.
