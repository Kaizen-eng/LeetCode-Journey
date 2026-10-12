
# ✦ Day 432 — LeetCode 2357

## Make Array Zero by Subtracting Equal Amounts

### ✦ Problem
Find the minimum number of operations needed to
make every element of an integer array zero.

### ✦ Approach
- Store distinct positive values in a HashSet.
- Ignore zeros because they require no operations.
- Return the size of the set.

Each operation eliminates one distinct positive
value level, so the number of distinct positive
values equals the minimum number of operations.

### ✦ Example
Input:  [1, 5, 0, 3, 5]
Output: 3

### ✦ Complexity
- Time: O(n) average
- Space: O(n) worst case

### ✦ Key Takeaway
Recognize the mathematical pattern instead of
simulating every subtraction.
