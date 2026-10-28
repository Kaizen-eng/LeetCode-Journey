# 📝 Notes — Day 448

## Problem
**2144. Minimum Cost of Buying Candies With Discount**

## Core Observation

For every three candies purchased, the cheapest one is free.

Therefore, we should arrange the prices in descending order so that
the cheapest candy in each group of three contributes nothing to
the total cost.

## Greedy Rule

After sorting in descending order:

- Index `0`: Pay
- Index `1`: Pay
- Index `2`: Free
- Index `3`: Pay
- Index `4`: Pay
- Index `5`: Free

Continue this pattern until every candy is processed.

In zero-based indexing, skip indices where:

`index % 3 == 2`

## Algorithm

1. Sort prices in descending order.
2. Initialize `totalCost = 0`.
3. Traverse the sorted array.
4. Add a price unless its index modulo 3 equals 2.
5. Return `totalCost`.

## Example

Input: `[1, 2, 3, 4, 5, 6]`

Sorted: `[6, 5, 4, 3, 2, 1]`

Paid: `6 + 5 + 3 + 2 = 16`

Free: `4 + 1`

Output: `16`

## Complexity

- Time: `O(n log n)`
- Space:
  - Java: sorting auxiliary space depends on the sorting implementation.
  - Python: `sorted()` creates a new list, requiring `O(n)` space.

## What I Learned

Greedy algorithms work well when a local choice helps achieve the
global optimum. Here, sorting ensures the discount is applied to
the cheapest candy in each group of three.

## Revision Reminder

**Sort → Skip every third candy → Sum the rest.** 🍬
