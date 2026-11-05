# Day 456 — 2644. Find the Maximum Divisibility Score

**LeetCode:** [2644. Find the Maximum Divisibility Score](https://leetcode.com/problems/find-the-maximum-divisibility-score/)  
**Difficulty:** Easy  
**Topics:** Array, Counting, Mathematics

## Problem Statement

Given two integer arrays, `nums` and `divisors`, find the divisor that has the maximum divisibility score.

The divisibility score of a divisor is the number of elements in `nums` that are divisible by it.

**Rules:**
- A number contributes to the score if `num % divisor == 0`.
- Return the divisor with the highest score.
- If multiple divisors have the same score, return the smallest divisor.

## Example

**Input:**
```text
nums = [2, 9, 15, 50]
divisors = [5, 3, 7, 2]
```

**Output:**
```text
2
```

**Explanation:**

| Divisor | Divisible Elements | Score |
|---|---|---|
| 5 | 15, 50 | 2 |
| 3 | 9, 15 | 2 |
| 7 | None | 0 |
| 2 | 2, 50 | 2 |

Divisors 2, 3, and 5 have the same maximum score of 2.

Since 2 is the smallest among them, the answer is **2**.

## Approach — Brute Force

1. Initialize `maxScore` to `-1` and `answer` to `-1`.
2. Iterate through every divisor.
3. Count the elements in `nums` divisible by the current divisor.
4. Compare the calculated score with the current maximum score.
5. Update the answer if the score is higher, or if the score is equal and the current divisor is smaller.
6. Return the final answer.

## Complexity Analysis

Let:
- N = length of `nums`
- M = length of `divisors`

**Time Complexity:** O(N × M)

Each divisor is checked against every element in `nums`.

**Space Complexity:** O(1)

Only a few variables are used, regardless of input size.

## Edge Case

When every divisor has a score of zero, the algorithm must still return the smallest divisor.

Initializing `maxScore` to `-1` ensures that the first divisor is selected and subsequent candidates are correctly compared.

## Implementations

- `Solutions.java` — Java implementation
- `Solution.py` — Python implementation

---

**Day 456 completed!**

Consistency, problem-solving, and continuous improvement — one challenge at a time.

#LeetCode #Java #Python #DSA #ProblemSolving #100DaysOfCode
