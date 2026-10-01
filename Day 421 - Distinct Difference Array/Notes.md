# Notes — LeetCode 2670

## Core Formula

`diff[i] = prefixDistinct[i] - suffixDistinct[i + 1]`

The current element belongs to the prefix, not the suffix.

## 1. Brute-Force Approach

For every index `i`:

1. Create a prefix set.
2. Insert elements from index `0` through `i`.
3. Create a suffix set.
4. Insert elements from index `i + 1` through `n - 1`.
5. Subtract the sizes of the two sets.

### Complexity

- Time: O(n²) expected
- Auxiliary space: O(n)

### Limitation

The same prefix and suffix elements are processed repeatedly.

## 2. Optimized Approach

### Pass 1: Suffix Precomputation

Traverse from right to left.

- Insert the current element into a `HashSet`.
- Store the set size in `suffixCount[i]`.
- Initialize `suffixCount[n] = 0` to represent an empty suffix.

### Pass 2: Prefix Processing

Traverse from left to right.

- Insert the current element into the set.
- Calculate `diff[i] = seen.size() - suffixCount[i + 1]`.

### Complexity

- Time: O(n) expected
- Auxiliary space: O(n)

## Important Observations

- A `HashSet` automatically eliminates duplicate values.
- `suffixCount[i]` includes the element at index `i`.
- `suffixCount[i + 1]` excludes the current element.
- Precomputation prevents repeated suffix traversal.
- HashSet insertion and lookup are O(1) on average, not guaranteed in every case.

## Edge Cases

- Single-element array: `[7]` produces `[1]`.
- All elements equal: `[5, 5, 5]` produces `[0, 0, 1]`.
- All elements distinct: `[1, 2, 3]` produces `[-2, 0, 2]`.

## Takeaway

Whenever repeated range calculations appear, consider whether prefix or suffix information can be precomputed and reused.
