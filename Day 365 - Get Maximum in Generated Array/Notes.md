# Notes

## Mistakes I Made

- Forgot to handle `n == 0`.
- Initialized `max` incorrectly.
- Used `else if` instead of two independent `if` statements.
- Initially planned an extra traversal to find the maximum.

## Learning

- Two conditions should be checked independently when both can be true.
- Update answers while generating data whenever possible.
- Small logical mistakes can completely change the generated array.

## Key Takeaway

Generating the correct DP states is just as important as the recurrence itself.

Sometimes the best optimization is simply updating the answer at the moment each state is created.
