# Notes

## Observation
A palindrome is fully determined by its left half.

Instead of rearranging the entire string:
- Count each character.
- Take half of every frequency.
- Arrange them from 'a' to 'z'.
- Place the odd character in the center.
- Mirror the left half.

## Why does this work?
To obtain the lexicographically smallest palindrome, the earliest positions should contain the smallest possible characters.

Since the right half is always the mirror of the left half, we only need to optimize the left half.

## Mistake I almost made
Initially, I thought I needed to generate different palindrome permutations.

The actual trick was recognizing that constructing the smallest possible left half automatically determines the entire palindrome.

## Takeaway
Sometimes the problem isn't asking us to search for every answer.
It's asking us to identify the one part that determines every answer.
