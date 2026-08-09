# Notes

### Key Learning

The important observation was that letters and special characters
must be reversed independently.

The positions themselves remain fixed.

So instead of swapping every character from both ends:

1. Find the next letter from the left.
2. Find the next letter from the right.
3. Swap them.
4. Repeat for all letters.

Then perform the same process for special characters.

### Main Idea

> Same category swaps with the same category.

This makes the two-pointer approach work cleanly.
