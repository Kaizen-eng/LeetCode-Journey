# Notes - Day 362

## What I Learned

Today's challenge wasn't difficult because of the implementation.
It was difficult because of the interpretation.

Initially, I counted every matching pair:

```java
if (Math.abs(arr1[i] - arr2[k]) <= d)
    count++;
```

But the question actually asks to count elements from `arr1`, **not matching pairs**.

The correct idea is:

- For each element in `arr1`
    - Check whether any element in `arr2` lies within distance `d`.
    - If one exists, stop searching.
    - Otherwise, count that element once.

Using a boolean flag and `break` made the solution both correct and efficient.

---

## Mistake I Made

❌ Counted valid pairs.

Instead of:

```
arr1 element
        ↓
Count once if no nearby element exists.
```

I accidentally did:

```
Every valid comparison
        ↓
Count++
```

---

## Key Takeaway

Sometimes debugging isn't about fixing code.

It's about understanding what the problem is actually asking.

One small change in perspective can completely change the solution.
