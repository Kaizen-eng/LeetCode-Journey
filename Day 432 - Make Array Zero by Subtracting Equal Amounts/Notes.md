
# ✦ Day 432 — Notes

## Problem
LeetCode 2357: Make Array Zero by Subtracting Equal Amounts

## Core Observation
Every operation eliminates one distinct positive
value level from the array.

## Why HashSet?
- Stores unique elements automatically.
- Prevents duplicate values from being counted twice.
- Makes the solution straightforward.

## Algorithm
1. Create an empty HashSet.
2. Traverse the array.
3. Add each positive element to the set.
4. Return the set size.

## Edge Cases
- All zeros -> 0
- Repeated positive values -> count once
- All distinct positive values -> count each one

## Complexity
Time: O(n) average
Space: O(n) worst case

## Key Learning
Look for invariants and patterns before simulating
operations. A simple observation can eliminate
unnecessary work.
