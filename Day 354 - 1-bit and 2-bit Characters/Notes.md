# Notes

## Initial Thought
I initially tried determining the answer by observing only the last few bits of the array.

Although it passed many test cases, it failed because the same ending pattern can produce different answers depending on how the previous bits are decoded.

Example:

[1,0,0] → 10 | 0 → true

[0,1,0] → 0 | 10 → false

The endings look similar, but the decoding path changes the result.

---

## Main Insight

The answer depends on the decoding journey, not just the destination.

Use pointer simulation:

- Encounter `0` → Move 1 step.
- Encounter `1` → Move 2 steps.

This naturally simulates the encoding rules.

---

## Lesson Learned

✔ Don't force pattern recognition when the problem defines a process.

✔ Simulating the process is often the cleanest solution.

✔ Be careful when modifying loop variables inside a `for` loop.

Understanding how the loop increments the index is just as important as your own updates.
