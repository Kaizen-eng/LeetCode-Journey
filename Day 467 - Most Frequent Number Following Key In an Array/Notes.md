
# 🧠 LeetCode 2190 - Learning Notes

## 🎯 Core Idea
We are not searching for the most frequent element in the entire array.

We are searching for the most frequent element that appears immediately AFTER a given `key`.

## 🔑 Important Observations

1. Only consider positions where `nums[i] == key`.
2. The next element `nums[i + 1]` is our target.
3. The last array element cannot be processed as a key because it has no next element.
4. A frequency array allows constant-time frequency updates and lookups.
5. Update the result only when a strictly higher frequency is found.

## ⚙️ Algorithm

1. Create a frequency array of size 1001.
2. Initialize `maxFreq = 0` and `result = 0`.
3. Iterate through the array from index `0` to `n - 2`.
4. If the current element equals `key`:
   - Identify the next element.
   - Increment its frequency.
   - Compare its frequency with `maxFreq`.
   - Update `maxFreq` and `result` if necessary.
5. Return `result`.

## 🔬 Dry Run

**Input:**
```text
nums = [2, 3, 2, 4, 2, 3, 2, 5, 2, 3]
key = 2
```

| Target | Frequency |
|--------|-----------|
| 3 | 3 |
| 4 | 1 |
| 5 | 1 |

**Final Answer:** `3`

## ⏱️ Complexity Analysis

- Time: O(n)
- Auxiliary Space: O(1001) = O(1)

## 💎 Key Takeaways

- Frequency counting simplifies repeated occurrence tracking.
- Direct addressing works efficiently when the value range is limited.
- Always check array boundaries before accessing `i + 1`.
- A single traversal is sufficient for this problem.

## 🏆 Today's Learning
Practiced conditional frequency counting and maximum-frequency tracking using arrays.
