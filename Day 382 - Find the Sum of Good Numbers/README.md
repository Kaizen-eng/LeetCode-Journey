# LeetCode 3456: Find the Sum of Good Numbers

✦ Day 382 — LeetCode Journey

## ✦ Problem

Given an integer array `nums` and an integer `k`, return the sum of all good elements in the array.

An element `nums[i]` is considered good if it is strictly greater than the elements at indices `i - k` and `i + k`, if those indices exist.

If one or both indices do not exist, the element is still considered good as long as it is greater than the existing comparison element.

## ✦ Example 1

Input:

```text
nums = [1,3,2,1,5,4], k = 2
```

Output:

```text
12
```

Explanation: The good numbers are `3`, `5`, and `4`.

## ✦ Example 2

Input:

```text
nums = [2,1], k = 1
```

Output:

```text
2
```

Explanation: `2` is greater than `1`, so it is the only good number.

## ✦ Approach

✦ Traverse every element in the array.

✦ Check whether the left index `i - k` exists.

✦ Check whether the right index `i + k` exists.

✦ If an index does not exist, consider that side valid.

✦ Add the current number to the sum only if both conditions are true.

## ✦ Complexity

- Time: O(n)
- Space: O(1)

Where `n` is the length of `nums`.

## ✦ Status

✅ Solved

- Day: 382
- Language: Java
- Topic: Array, Simulation, Boundary Checking
