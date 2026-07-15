# Notes

## Observation

The main challenge was understanding the problem statement.

The same characters in `chars` can be reused for different words because every word is checked independently.

## Why not String.contains()?

`contains()` only checks whether a character exists.

It does **not** verify how many times it appears.

Example:

chars = "abc"

word = "aa"

contains('a') returns true, but only one 'a' is available.

## Approach

- Build one frequency array from `chars`.
- Clone it for every word.
- Reduce the frequency while traversing the word.
- If any count becomes negative:
  - Stop immediately.
  - The word cannot be formed.

Otherwise:

Add the word's length to the final answer.

## Key Takeaways

- Frequency arrays
- Character indexing using

```java
ch - 'a'
```

- Early exit using `break`
- Using `clone()` to preserve the original frequency array
