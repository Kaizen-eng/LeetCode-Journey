
# ✦ Day 433 — LeetCode 2037 Notes

## ✦ Core Intuition

The goal is to minimize the total distance between students and seats.

Instead of trying every possible assignment, sort both arrays and pair elements at matching indices.

## ✦ Why Does Sorting Help?

Consider crossing assignments: matching a student farther to the right with a seat farther to the left while assigning the opposite pair can increase the combined distance.

Ordered pairing avoids unnecessary crossings and achieves the minimum total movement.

## ✦ Formula

For n students and seats:

```text
totalMoves = 0

For i from 0 to n - 1:
    totalMoves += abs(seats[i] - students[i])

Return totalMoves
```

Mathematically:

\[
\text{Total Moves} =
\sum_{i=0}^{n-1}
|\text{seats}[i]-\text{students}[i]|
\]

## ✦ Final Boss Walkthrough

Input:

```text
seats    = [4, 1, 5, 9]
students = [1, 3, 2, 6]
```

After sorting:

```text
seats    = [1, 4, 5, 9]
students = [1, 2, 3, 6]
```

Distances:

```text
|1 - 1| = 0
|4 - 2| = 2
|5 - 3| = 2
|9 - 6| = 3
```

Total:

```text
0 + 2 + 2 + 3 = 7
```

**Correct Answer: 7**

## ✦ Common Mistakes

- Forgetting to sort both arrays.
- Forgetting `Math.abs()`.
- Skipping a pair while summing distances.
- Returning a single distance instead of the total.
- Miscalculating the final sum.

## ✦ Complexity

- Time: O(n log n)
- Extra space: sorting-dependent; O(1) for the accumulation loop.

## ✦ Revision Flashcards

**Q:** Which technique solves this problem?

A: Sorting + Greedy.

**Q:** Why use absolute difference?

A: Movement distance is non-negative regardless of direction.

**Q:** Why do we sum all the differences?

A: Every student must be assigned a seat.

**Q:** What is the final-boss answer?

A: 7 moves.
