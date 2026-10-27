# 2078. Two Furthest Houses With Different Colors

## Approach
- Compare houses from opposite ends of the array.
- Find the farthest house from the right endpoint with a different color.
- Find the farthest house from the left endpoint with a different color.
- Return the maximum distance found.

## Key Insight
The maximum distance must involve at least one endpoint of the array. Two linear scans are sufficient.

## Complexity
- Time: O(n)
- Space: O(1)

## Tags
Array, Greedy
