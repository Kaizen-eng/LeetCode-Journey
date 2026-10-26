
# 1560. Most Visited Sector in a Circular Track

**Day:** 446  
**Difficulty:** Easy  
**Language:** Python  
**Topics:** Array, Simulation, Math

## Problem Summary
Given a circular track with `n` sectors and an array `rounds`, find all sectors visited the most frequently.

The first element of `rounds` is the starting sector, and the last element is the ending sector. Each round moves clockwise.

## Approach
The most visited sectors depend only on the starting and ending sectors.

- If `rounds[0] <= rounds[-1]`, the answer is every sector from the starting sector to the ending sector.
- Otherwise, the answer is every sector from `1` to the ending sector.

## Complexity
- **Time:** O(n)
- **Space:** O(n) for the output array.
