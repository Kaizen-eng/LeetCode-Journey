# Notes - Minimum Common Value

## Problem Insight

We are given two sorted arrays and need to find the smallest value
that exists in both arrays.

Because the arrays are sorted, we don't need to compare every element
with every other element.

We can use two pointers.

---

## Two Pointer Approach

Let:

- `i` → pointer for `nums1`
- `j` → pointer for `nums2`

Initially:

```text
i = 0
j = 0
