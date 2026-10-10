Day 430 — Notes

Problem: 2760. Longest Even Odd Subarray With Threshold

Key Observations

✦ A valid subarray must begin with an even number.

✦ Every element must be less than or equal to the threshold.

✦ Adjacent elements must have opposite parity.

✦ An odd element cannot start a valid subarray, but it can extend one that already started with an even element.

✦ An element above the threshold breaks the current subarray.

State Tracking

- "current": Length of the valid subarray ending at the current index.
- "longest": Maximum valid length found so far.

Edge Cases

1. An empty array, if permitted: return 0.
2. All elements are odd: return 0.
3. All elements exceed the threshold: return 0.
4. A single valid even element: return 1.
5. Multiple alternating elements: return their full length if all satisfy the threshold.

Complexity

- Time: O(n)
- Auxiliary space: O(1)

Lesson

Track the current valid sequence and update the best answer during the same traversal.
