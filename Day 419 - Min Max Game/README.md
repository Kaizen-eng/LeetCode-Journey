# LeetCode 2293 — Min Max Game

## Problem

Given a 0-indexed integer array `nums` whose length is a power of `2`, repeatedly create a new array of half the size.

For each index `i` in the new array:

- If `i` is even, store the minimum of `nums[2 * i]` and `nums[2 * i + 1]`.
- If `i` is odd, store the maximum of `nums[2 * i]` and `nums[2 * i + 1]`.

Continue until only one element remains and return that value.

## Approach

The algorithm can be simulated directly.

For every round:

1. Create a new array of size `n / 2`.
2. Process each adjacent pair from the current array.
3. Use `min()` when the new index is even.
4. Use `max()` when the new index is odd.
5. Replace the current array with the new array.
6. Repeat until its length becomes `1`.

### Key Observation

The operation depends only on the **index of the element in the new array**:

```text
Even index → MIN
Odd index  → MAX
```

Since the array size is halved after every round, the process eventually leaves exactly one value.

## Complexity

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(n)`

## Example

```text
Input:
nums = [1,3,5,2,4,8,2,2]

Round 1:
[1,5,4,2]

Round 2:
[1,4]

Round 3:
[1]

Output:
1
```

## Key Takeaway

This problem is a straightforward **simulation** problem. The important part is carefully following the alternating `MIN → MAX → MIN → MAX` pattern while reducing the array size by half each round.
