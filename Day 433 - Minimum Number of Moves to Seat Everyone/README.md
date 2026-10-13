
# ✦ LeetCode 2037 — Minimum Number of Moves to Seat Everyone

**Difficulty:** Easy  
**Topics:** Array, Sorting, Greedy  
**Language:** Java

## ✦ Problem

Given two integer arrays, `seats` and `students`, where `seats[i]` represents a seat position and `students[i]` represents a student's position, find the minimum total number of moves required to seat every student.

Each move shifts a student by one position. Every seat must accommodate exactly one student.

## ✦ Approach — Sorting + Greedy

1. Sort the `seats` array in ascending order.
2. Sort the `students` array in ascending order.
3. Match the elements at corresponding indices.
4. Add the absolute difference between each matched pair.
5. Return the total number of moves.

Sorting enables an optimal ordered pairing, minimizing the total movement.

## ✦ Example

**Input**
```text
seats = [3, 1, 5]
students = [2, 7, 4]
```

**Sorted arrays**
```text
seats = [1, 3, 5]
students = [2, 4, 7]
```

**Calculation**
```text
|1 - 2| + |3 - 4| + |5 - 7|
= 1 + 1 + 2
= 4
```

**Output**
```text
4
```

## ✦ Complexity

- **Time:** O(n log n), dominated by sorting.
- **Auxiliary Space:** Sorting-related space; the loop itself uses O(1) extra space.

## ✦ Key Takeaway

Sort both arrays, match corresponding positions, and accumulate absolute differences.

**Pattern:** Sorting + Greedy + Absolute Difference
