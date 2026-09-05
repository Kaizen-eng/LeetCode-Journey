# 2206. Divide Array Into Equal Pairs

## Problem
Given an integer array `nums` containing `2 * n` integers, determine whether
the array can be divided into `n` pairs such that:

- Every element belongs to exactly one pair.
- The two elements in each pair are equal.

Return `true` if possible, otherwise return `false`.

## Approach

Use a `HashMap` to count the frequency of every element.

If the frequency of every element is even, each element can be divided into
pairs of two equal values.

### Example

nums = [3, 2, 3, 2, 2, 2]

3 → 2 occurrences
2 → 4 occurrences

Both frequencies are even, so the array can be divided into equal pairs.

## Complexity

- Time: O(n)
- Space: O(n)

## Files

- `README.md` → Problem and approach
- `Notes.md` → Key concepts and learning
- `Solutions.java` → Java solution
