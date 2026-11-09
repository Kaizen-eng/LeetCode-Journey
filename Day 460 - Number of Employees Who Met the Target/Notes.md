
# ✦ Day 460 – Notes

## Problem
Count employees whose working hours are greater than or equal to the given target.

## Key Observation
We don't need sorting, searching, or additional data structures.

A simple linear traversal is sufficient.

## Condition
`hours[i] >= target`

The equality operator is important because employees who work exactly the target hours must also be counted.

## Algorithm
1. Create `count = 0`.
2. Iterate through the hours array.
3. Check whether each employee meets the target.
4. Increment count when the condition is true.
5. Return count.

## Example

Input:
hours = [0, 1, 2, 3, 4]
target = 2

Qualifying employees:
2, 3, 4

Output: 3

## Complexity
- Time: O(n)
- Auxiliary Space: O(1)

## Takeaway
Sometimes the simplest solution is the optimal solution.

No unnecessary data structures. Just one loop and one counter!
