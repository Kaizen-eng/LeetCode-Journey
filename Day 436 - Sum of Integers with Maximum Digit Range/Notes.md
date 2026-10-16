
# ✦ Day 436 — Learning Notes

## Core Concept
Digit range measures the difference between the largest and smallest digits of an integer.

`digitRange = maxDigit - minDigit`

## Important Observations
✧ A single digit has a range of `0`.
✧ Repeated digits also produce a range of `0`.
✧ Several integers can share the same maximum range.
✧ When a larger range appears, the previous sum must be reset.
✧ When an equal range appears, add that integer to the sum.

## Java Digit Extraction
- `num % 10` extracts the last digit.
- `num / 10` removes the last digit.
- `Math.min()` tracks the smallest digit.
- `Math.max()` tracks the largest digit.

## One-Pass Logic
1. Initialize the maximum range to `-1`.
2. Calculate each integer's digit range.
3. Reset the sum when a new maximum appears.
4. Add the integer when its range matches the maximum.
5. Return the final sum.

## Mistakes to Avoid
✧ Do not forget to reset the sum when a new maximum is found.
✧ Do not count integers with smaller ranges.
✧ Do not assume the maximum range belongs to only one integer.

## Today's Takeaway
Maintain the maximum and its corresponding sum together to solve the problem efficiently.
