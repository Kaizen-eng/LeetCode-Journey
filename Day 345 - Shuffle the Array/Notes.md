# Notes

## My First Idea

Use one loop over the entire answer array.

- Even positions receive values from the first half.
- Odd positions receive values from the second half.

This works correctly and helped me understand the pattern.

## Cleaner Improvement

Instead of checking every position,

loop only from 0 to n-1 and directly insert:

First half element

Second half element

using a single answer index.

## Key Learning

- Solving the problem is good.
- Improving the solution makes the code cleaner and easier to understand.
- Sometimes reducing unnecessary conditions is the biggest improvement.
