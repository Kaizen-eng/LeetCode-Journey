# Notes - LeetCode 1460

## Core Idea

We do not need to actually perform the reversals.

Reversing subarrays can rearrange the elements of `arr`, so `arr` can be transformed into `target` exactly when both arrays contain the same elements with the same frequencies.

## Example

target = [1, 2, 3, 4]

arr = [2, 4, 1, 3]

Frequency comparison:

1 → 1
2 → 1
3 → 1
4 → 1

Both arrays have identical frequencies, so the answer is `true`.

## Why Frequency Counting Works

Every reversal changes the positions of elements, but it does not change:

- Which elements exist
- How many times each element occurs

Therefore, element frequency is an invariant.

## Alternative Approach

Another solution is to sort both arrays and compare them.

```text
target = [1, 2, 3]
arr    = [3, 1, 2]

Sorted:
target = [1, 2, 3]
arr    = [1, 2, 3]
