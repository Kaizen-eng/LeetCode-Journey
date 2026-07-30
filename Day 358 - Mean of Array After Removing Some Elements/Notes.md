# Notes

## Key Observation

Sorting naturally places the smallest and largest values together, making it easy to trim both ends.

Steps:
1. Sort the array.
2. Remove the first 5%.
3. Remove the last 5%.
4. Compute the average of the remaining values.

Formula:

remove = n / 20

Remaining elements = n - (2 × remove)

## Complexity

- Time: O(n log n)
- Space: O(1) (excluding sorting implementation)

## Learning

Not every problem requires a clever trick. Sometimes following the problem statement step by step leads directly to the optimal solution.
