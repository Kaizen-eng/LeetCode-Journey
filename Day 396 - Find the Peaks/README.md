# ✦ Day 396 — LeetCode 2951

## 🏔️ Find the Peaks

### ✦ Problem
Find all the indices of the elements that are **peaks** in the mountain array.

An element is a peak when it is strictly greater than both of its neighboring elements.

### ✦ Approach
Since the first and last elements cannot be peaks, iterate from index `1` to `n - 2`.

For every index:

- Check whether `mountain[i] > mountain[i - 1]`
- Check whether `mountain[i] > mountain[i + 1]`
- If both conditions are true, add the index to the result list.

### ✦ Key Idea

```text
mountain[i] > mountain[i - 1]
AND
mountain[i] > mountain[i + 1]
```

Because the number of peaks is unknown beforehand, use an `ArrayList<Integer>` to store the result dynamically.

### ✦ Complexity
- Time: **O(n)**
- Space: **O(k)** — where `k` is the number of peaks.

✦ **Another problem solved. Another brick in the DSA wall.** 🧱💻
