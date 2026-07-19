# Day 347 - How Many Numbers Are Smaller Than the Current Number

## Problem
Given an integer array `nums`, return an array where each element contains the number of values that are smaller than `nums[i]`.

### Example
Input:
```
nums = [8,1,2,2,3]
```

Output:
```
[4,0,1,1,3]
```

---

# Approach 1 - Brute Force

## Idea
Compare every element with every other element and count how many values are smaller.

### Algorithm
1. Traverse every element.
2. Compare it with every other element.
3. Count smaller values.
4. Store the count in the answer array.

### Complexity
- Time: **O(n²)**
- Space: **O(n)** (answer array)

---

# Approach 2 - Frequency Array + Prefix Sum

## Idea
Since the values are limited to `0 ≤ nums[i] ≤ 100`, use a frequency array to count occurrences.

Convert the frequency array into a prefix sum array so that each index stores the number of elements less than or equal to that value.

Finally:
- If the current value is `0`, answer is `0`.
- Otherwise, answer is `freq[value - 1]`.

### Complexity
- Time: **O(n)**
- Space: **O(101) ≈ O(1)**

---

# Key Learnings

- Constraints often reveal optimization opportunities.
- Frequency counting can replace nested loops when the value range is small.
- Prefix sums allow constant-time queries after preprocessing.
