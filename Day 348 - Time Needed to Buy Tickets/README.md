# Day 348 - Time Needed to Buy Tickets

## Problem
Given an array `tickets` where `tickets[i]` is the number of tickets person `i` wants to buy, and an index `k`, determine how many seconds are required until person `k` finishes buying all their tickets.

---

## Approach 1: Queue Simulation

### Idea
Simulate the queue by moving through the array in a circular manner.

- If a person still needs tickets, decrease their ticket count.
- Count every successful purchase as one second.
- Continue until person `k` has bought all their tickets.

### Time Complexity
**O(totalTickets)**

### Space Complexity
**O(1)**

---

## Approach 2: Observation (Optimal)

### Idea

Instead of simulating the queue:

- Every person before or at `k` contributes:
  `min(tickets[i], tickets[k])`

- Every person after `k` contributes:
  `min(tickets[i], tickets[k] - 1)`

Add these contributions to get the total time.

### Time Complexity
**O(n)**

### Space Complexity
**O(1)**

---

## Key Learnings

- Simulation is useful for understanding the process.
- Careful observation can eliminate unnecessary simulation.
- Splitting the array into cases often leads to elegant solutions.
