# Notes

## Initial Thought

My first idea was to simulate the queue.

I used a circular index to represent people taking turns buying tickets instead of physically rotating the array.

For every successful purchase:
- Decrease the ticket count.
- Increase the elapsed time.
- Stop when person `k` finishes buying all tickets.

Although correct, the runtime depends on the total number of tickets.

---

## Optimization

I noticed that everyone before (or at) person `k` gets one final chance to buy before the process stops.

People after `k` never get that last opportunity.

Therefore:

- If `i <= k`
  Contribution = `min(tickets[i], tickets[k])`

- If `i > k`
  Contribution = `min(tickets[i], tickets[k] - 1)`

A single traversal of the array is enough.

---

## Key Takeaways

- Don't immediately simulate every process.
- Observe how many times each element actually contributes.
- Sometimes counting is much simpler than simulation.
