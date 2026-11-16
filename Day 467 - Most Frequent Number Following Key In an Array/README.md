
# 🚀 Day 467 - LeetCode 2190: Most Frequent Number Following Key In an Array

## 📝 Problem Statement
Given an integer array `nums` and an integer `key`, find the number that appears most frequently immediately after `key` in the array.

Return the number with the highest frequency among all numbers that directly follow `key`.

## 💡 Approach: Frequency Counting

- Initialize a frequency array to track occurrences of numbers following `key`.
- Traverse the input array up to the second-last index.
- Whenever `nums[i] == key`, increment the frequency of `nums[i + 1]`.
- Maintain the maximum frequency and update the result whenever a higher frequency is found.
- Return the most frequent number.

## 💻 Implementations
- Java
- Python

## 🔍 Example

**Input:**
```text
nums = [1, 100, 200, 1, 100]
key = 1
```

**Output:**
```text
100
```

**Explanation:**

The number `100` appears twice immediately after `1`, making it the most frequent number following the given key.

## ⏱️ Complexity Analysis

- **Time Complexity:** O(n) — A single traversal of the array.
- **Space Complexity:** O(1) — A fixed-size frequency array of 1001 elements.

## 🧠 Key Concepts
- Arrays
- Frequency Counting
- Hashing / Direct Addressing
- Single-pass Traversal

## 🏁 Learning Outcome
Learned how to track conditional occurrences using frequency counting and efficiently identify the most frequent element in a single traversal.

---

**Day 467 completed! One problem closer to mastery.** 🔥
