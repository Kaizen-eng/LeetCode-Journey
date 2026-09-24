# LeetCode 1460 - Make Two Arrays Equal by Reversing Subarrays

## Problem

Given two integer arrays `target` and `arr`, return `true` if it is possible to make `arr` equal to `target` by reversing any subarray of `arr` any number of times.

## Approach

The important observation is that reversing subarrays allows the elements of the array to be rearranged.

Therefore, instead of simulating the reversals, we only need to check whether both arrays contain the same elements with the same frequencies.

We use a frequency array:

- Increment the frequency for every element in `target`.
- Decrement the frequency for every element in `arr`.
- If every frequency becomes `0`, the arrays contain exactly the same elements.

## Complexity

- Time: `O(n)`
- Space: `O(1)` because the frequency array has a fixed size.

## Key Takeaway

When an operation allows elements to be rearranged freely, the final order may not matter.

Instead of simulating every operation, look for an invariant such as the **frequency of elements**.
