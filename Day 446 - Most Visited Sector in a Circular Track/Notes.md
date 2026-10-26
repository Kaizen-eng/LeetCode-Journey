
# Notes — LeetCode 1560

## Key Observation
The intermediate sectors do not affect the final answer. Only the first and last sectors matter.

Let:
- `start = rounds[0]`
- `end = rounds[-1]`

### Case 1: start <= end
The most visited sectors are:
`[start, start + 1, ..., end]`

### Case 2: start > end
The track wraps around from `n` to `1`. The most visited sectors are:
`[1, 2, ..., end]`

## Python Trick
- `rounds[0]` gets the starting sector.
- `rounds[-1]` gets the ending sector.
- `range(a, b + 1)` includes `b`.

## Lesson Learned
For circular traversal problems, look for a way to simplify the answer using the starting and ending positions before simulating every movement.
