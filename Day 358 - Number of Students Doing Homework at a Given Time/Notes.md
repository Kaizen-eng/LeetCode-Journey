# Notes

## Key Observation

A student is considered to be doing homework if:

startTime[i] <= queryTime <= endTime[i]

Since every student's interval is independent, a single traversal is enough.

## Complexity

- Time: O(n)
- Space: O(1)

## Learning

Simple interval checking problems often don't require extra data structures. Reading the condition carefully is enough to reach the optimal solution.
