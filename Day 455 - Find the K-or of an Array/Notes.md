# Notes — 2917. Find the K-or of an Array

## Intuition

Instead of calculating the OR of all elements directly, examine every bit position independently.

A bit contributes to the final answer only when it appears in at least `k` array elements.

## Important Observations

- Every bit position can be evaluated independently.
- Bitwise AND checks whether a particular bit is set.
- Bitwise OR sets the corresponding bit in the result.
- We only need to inspect 31 bit positions for the given constraints.

## Bitwise Operations

**1. Check whether a bit is set:**

```java
(num & (1 << bit)) != 0
```

**2. Set a bit in the answer:**

```java
answer |= (1 << bit);
```

## Algorithm

1. Initialize the result to zero.
2. Iterate through bit positions 0 to 30.
3. Count the elements having the current bit set.
4. If the count reaches `k`, set that bit in the result.
5. Return the result.

## Complexity Analysis

- **Time:** O(31 × N) = O(N)
- **Space:** O(1)

## Learning Outcome

This problem demonstrates how bit manipulation can simplify problems involving frequency conditions on individual binary positions.

**Key takeaway:** Analyze bits independently when a problem defines conditions based on the frequency of set bits.
