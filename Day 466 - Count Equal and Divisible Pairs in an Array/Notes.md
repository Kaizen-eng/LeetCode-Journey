
# Notes - LeetCode 2176

## Core Logic

We need to count pairs of indices `(i, j)` satisfying three conditions:

1. `i < j`
2. `nums[i] == nums[j]`
3. `(i * j) % k == 0`

All three conditions must be satisfied for a pair to be valid.

## Important Observations

- Array indices start from 0.
- The inner loop must start at `i + 1`.
- This avoids duplicate pairs.
- It also prevents pairing an index with itself.
- We check the product of indices, not the product of array elements.

## Algorithm

1. Initialize `count = 0`.
2. Iterate through the array using index `i`.
3. For every `i`, iterate through subsequent indices using `j`.
4. Check both:
   - `nums[i] == nums[j]`
   - `(i * j) % k == 0`
5. Increment `count` if both conditions are true.
6. Return `count`.

## Dry Run

Input:
`nums = [3,1,2,2,2,1,3]`
`k = 2`

| Pair | Equal? | (i*j) % 2 | Valid? |
|---|---|---|---|
| (0,6) | Yes | 0 | Yes |
| (2,3) | Yes | 0 | Yes |
| (2,4) | Yes | 0 | Yes |
| (3,4) | Yes | 0 | Yes |

Final count = 4

## Complexity

- Time: O(n²)
- Auxiliary Space: O(1)

## Learning

This problem reinforces nested-loop traversal, index manipulation, conditional checks, and modulo operations.
