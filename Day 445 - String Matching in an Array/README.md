# 1408. String Matching in an Array

**Difficulty:** Easy  
**Topics:** Array, String, String Matching  
**Day:** 445

## Problem
Given an array of strings `words`, return all strings that are a substring of another word in the same array. The answer can be returned in any order.

## Approach — Brute Force
1. Pick each word as the candidate substring.
2. Compare it with every other word.
3. If another word contains the candidate, add it to the result and stop checking that candidate.
4. Return the result.

## Example
```text
Input:  words = ["mass", "as", "hero", "superhero"]
Output: ["as", "hero"]
```

## Complexity
Let `n` be the number of words and `L` the maximum word length.

- **Time:** `O(n² · L)` as a practical upper bound for checking every pair with substring search.
- **Auxiliary space:** `O(1)` excluding the output list (the output can contain up to `n` words).

## Files
- `Solutions.java` — Java implementation
- `Solutions.py` — Python implementation
- `Notes.md` — concise learning notes
