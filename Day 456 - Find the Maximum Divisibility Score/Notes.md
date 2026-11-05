# Day 456 — Notes
## 2644. Find the Maximum Divisibility Score

### 1. Core Intuition

The goal is to identify which divisor can divide the maximum number of elements in the given array.

Instead of sorting or using complicated data structures, we can directly evaluate every divisor.

For each divisor, count how many elements produce a remainder of zero.

The divisor with the highest count wins.

### 2. Key Observation

The modulo operator (`%`) helps determine divisibility.

```java
if (num % divisor == 0) {
    score++;
}
```

A remainder of zero means the number is perfectly divisible by the current divisor.

### 3. Tie-Breaking Logic

We have two conditions for updating our answer:

```java
if (score > maxScore ||
    (score == maxScore && divisor < answer)) {
    maxScore = score;
    answer = divisor;
}
```

- Higher score → update the answer.
- Equal score with a smaller divisor → update the answer.
- Otherwise → keep the existing answer.

### 4. Why Initialize maxScore to -1?

Consider an input where every divisor has a score of zero.

If `maxScore` starts at zero, the first candidate might never be selected because its score is not greater than zero.

By initializing it to `-1`, the first candidate is always considered.

This also ensures the smallest divisor is eventually selected when all scores are equal.

### 5. Dry Run

**Input:**
```text
nums = [2, 9, 15, 50]
divisors = [5, 3, 7, 2]
```

| Divisor | Score | maxScore | Answer |
|---|---:|---:|---:|
| 5 | 2 | 2 | 5 |
| 3 | 2 | 2 | 3 |
| 7 | 0 | 2 | 3 |
| 2 | 2 | 2 | 2 |

**Final Answer:** `2`

### 6. Edge Cases

1. All divisors have a score of zero.
2. Multiple divisors have the same maximum score.
3. Only one divisor is provided.
4. One divisor divides every element.
5. The smallest divisor is not the first element in the divisors array.

### 7. Complexity Analysis

Let N represent the length of `nums` and M represent the length of `divisors`.

- **Time Complexity:** O(N × M)
- **Auxiliary Space Complexity:** O(1)

### 8. Key Takeaways

- Modulo is useful for checking divisibility.
- Nested loops provide a simple way to evaluate every candidate.
- Tie-breaking conditions must be handled explicitly.
- Initial values matter, especially when all scores are zero.

**Today's Learning:** A simple brute-force approach can be both clean and efficient when the input constraints are small.
