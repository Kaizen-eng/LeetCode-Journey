# Notes - LeetCode 2335

## Key Observation

Each second can fill at most two cups, so:

`minimum time >= ceil(total / 2)`

However, the two cups must be of different types.

If one type contains more cups than the other two types combined,
those remaining cups must be filled one at a time.

Therefore:

`answer = max(maxAmount, ceil(total / 2))`

## Example

amount = [5, 0, 0]

Total = 5

ceil(5 / 2) = 3

maxAmount = 5

Answer:

max(5, 3) = 5

We cannot fill two cups simultaneously because there is only
one available type.

## Java Integer Arithmetic

Instead of using floating-point `Math.ceil()`:

`(total + 1) / 2`

Examples:

- 7 → 4
- 8 → 4
- 9 → 5

## Takeaway

When solving optimization problems, look for:

- Maximum capacity per operation
- Bottleneck categories
- Restrictions on which items can be processed together

Sometimes the cleanest solution comes from finding the mathematical
lower bound rather than simulating every operation.
