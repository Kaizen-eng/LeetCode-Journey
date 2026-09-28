# 1539. Kth Missing Positive Number

## 🧩 Problem

Given an array `arr` of positive integers sorted in strictly increasing order
and an integer `k`, return the `kth` positive integer that is missing from the array.

### Example

Input:
arr = [2,3,4,7,11]
k = 5

Missing positive integers:
[1,5,6,8,9,10,12,13,...]

Output:
9

The 5th missing positive integer is `9`.

---

## 💡 Approach

The array is sorted, so the missing numbers can be divided into three regions:

1. Before the first element
2. Between consecutive elements
3. After the last element

For a gap between `arr[i]` and `arr[i + 1]`, the number of missing
positive integers is:

`arr[i + 1] - arr[i] - 1`

We keep a running count of how many missing numbers have been found.

If the current gap contains the `kth` missing number, we calculate its
exact value directly.

---

## 🔍 Example

For:

`arr = [2,3,4,7,11]`

The missing numbers are:

`1,5,6,8,9,10,...`

The gaps are:

- Before `2` → `1` missing number
- Between `4` and `7` → `2` missing numbers: `5,6`
- Between `7` and `11` → `3` missing numbers: `8,9,10`

For `k = 5`, the answer is `9`.

---

## ⏱️ Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(1)`

---

## 🧠 Key Insight

A gap does not necessarily represent one missing number.

For example:

`4 → 7`

contains:

`5, 6`

So the number of missing values is:

`7 - 4 - 1 = 2`

---

## 🔗 Problem

LeetCode 1539 — Kth Missing Positive Number
