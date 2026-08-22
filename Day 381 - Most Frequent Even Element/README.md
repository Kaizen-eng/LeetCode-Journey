README.md

# LeetCode 2404: Most Frequent Even Element

✦ Day 381 — LeetCode Journey

## ✦ Problem

Given an integer array `nums`, return the even element that appears most frequently.

If there is a tie, return the smallest even number.

If there is no even element, return `-1`.

## ✦ Example 1

Input:

```text
nums = [0,1,2,2,4,4,1]
```

Output:

```text
2
```

Explanation: `2` and `4` both appear twice, so we return the smaller value, `2`.

## ✦ Example 2

Input:

```text
nums = [29,47,21,41,13,37,25,7]
```

Output:

```text
-1
```

## ✦ Approach

✦ Count the frequency of every number using a HashMap.

✦ Iterate through each number-frequency pair.

✦ Skip odd numbers.

✦ Update the answer when an even number has a greater frequency.

✦ If frequencies tie, update the answer only when the current number is smaller.

## ✦ Complexity

- Time: O(n)
- Space: O(n)

Where `n` is the length of `nums`.

## ✦ Status

✅ Solved

- Day: 381
- Language: Java
- Topic: Array, HashMap, Frequency Counting
