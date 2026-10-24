
# ✦ 1437. Check If All 1's Are at Least Length K Places Away

✦ **Day 444** of my LeetCode journey!

## ✧ Problem
Given a binary array `nums` and an integer `k`, return `true` if all 1's are at least `k` places away from each other. Otherwise, return `false`.

## ✧ Example 1
**Input:** `nums = [1,0,0,0,1,0,0,1], k = 2`

**Output:** `true`

**Explanation:** Every pair of consecutive 1's has at least 2 zeros between them.

## ✧ Example 2
**Input:** `nums = [1,0,0,1,0,1], k = 2`

**Output:** `false`

**Explanation:** The last two 1's have only 1 zero between them.

## ✧ Approach
- Traverse the array from left to right.
- Store the index of the previous 1.
- For every new 1, calculate the number of elements between the two 1's.
- If the distance is less than `k`, return `false`.
- If the entire array passes the check, return `true`.

## ✧ Complexity
- **Time:** O(n)
- **Space:** O(1)

## ✧ Language
Java

✦ Consistency builds mastery. One problem at a time! ✦
