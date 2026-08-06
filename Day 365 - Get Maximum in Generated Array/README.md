# Day 365 - Get Maximum in Generated Array

## Problem
LeetCode 1646 - Get Maximum in Generated Array

## Approach

This problem generates an array using predefined rules and asks for the maximum value generated.

Instead of generating the entire array first and then searching for the maximum, the maximum value is updated immediately whenever a new element is generated.

## Algorithm

1. Handle edge cases (`n = 0` and `n = 1`).
2. Initialize the generated array.
3. Generate values using the given recurrence rules.
4. Update the maximum value during generation.
5. Return the maximum.

## Complexity

- **Time:** O(n)
- **Space:** O(n)

## Concepts Practiced

- Dynamic Programming
- Array Simulation
- Edge Case Handling
- Optimization
