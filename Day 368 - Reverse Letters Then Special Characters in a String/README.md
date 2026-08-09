# Day 368 - Reverse Letters Then Special Characters in a String

## Problem
Reverse all lowercase English letters while keeping them in their original
letter positions. Then reverse all special characters while keeping them in
their original special-character positions.

## Approach
- Convert the String into a `char[]`.
- Use two pointers to reverse the letters.
- Use another two-pointer pass to reverse the special characters.
- Convert the `char[]` back into a String.

## Complexity
- Time: O(n)
- Space: O(n)

## Key Concept
Two Pointers
