# Day 453 – 2451. Odd String Difference

**LeetCode:** [2451. Odd String Difference](https://leetcode.com/problems/odd-string-difference/)  
**Difficulty:** Easy  
**Topics:** Array, String  
**Languages:** Java, Python

## Problem Description

Given an array of strings, identify the string whose adjacent character differences are different from those of the other strings.

The difference between two adjacent characters is calculated using their ASCII values.

## Example

**Input:**
```text
words = ["adc", "wzy", "abc"]
```

**Difference Patterns:**
```text
"adc" → [-3, -1]
"wzy" → [3, -1]
"abc" → [1, 1]
```

**Output:**
```text
"abc"
```

## Approach

1. Calculate the difference between every pair of adjacent characters.
2. Represent each string using its difference pattern.
3. Group strings having identical difference patterns.
4. Return the string belonging to the group containing only one element.

## Complexity Analysis

Let `n` be the number of strings and `m` be the length of each string.

- **Time Complexity:** O(n × m)
- **Space Complexity:** O(n × m) for storing the difference patterns.

## Key Takeaway

Character arithmetic can reveal patterns that are not immediately visible from the original strings. Comparing adjacent character differences makes identifying the unique string straightforward.
