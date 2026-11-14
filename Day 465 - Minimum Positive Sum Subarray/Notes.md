# Notes - Day 465

## 1. Subarrays

A subarray is a contiguous portion of an array.

Unlike subsequences, subarrays cannot skip elements.

## 2. Python Slicing

Syntax:

    nums[start:end]

The ending index is exclusive.

Example:

    nums = [1, 2, -1, 3]

    nums[0:2] = [1, 2]
    nums[0:3] = [1, 2, -1]

## 3. Nested Loops

Outer Loop:
- Controls the starting index.

Inner Loop:
- Controls the subarray length.

## 4. Important Conditions

    i + length <= len(nums)

Ensures that the generated subarray
does not exceed array boundaries.

    current_sum > 0

Ensures that only positive sums are considered.

## 5. Optimization Insight

Repeated slicing and summation can be expensive.

Instead, maintain a running sum while extending
the subarray.

This reduces the time complexity from
O(n * r²) to O(n * r).

## Key Takeaway

Understanding subarray boundaries is essential
when solving array-based problems.
