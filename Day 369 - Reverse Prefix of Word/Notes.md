# Notes

## Key Concepts

- `indexOf(ch)` returns the index of the first occurrence of a character.
- `substring(0, index + 1)` includes the character at `index`.
- `StringBuilder.reverse()` reverses the characters efficiently.
- `toString()` converts the `StringBuilder` back into a `String`.

## Important Detail

The problem asks for the reverse only up to the FIRST occurrence
of `ch`, not every occurrence.

For example:

word = "abcdefd"
ch = 'd'

Only the first `"d"` determines the prefix:

"abcd" → "dcba"

Final result:

"dcbaefd"
