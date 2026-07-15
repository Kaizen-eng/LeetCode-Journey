# LeetCode 1160 - Find Words That Can Be Formed by Characters

## Problem
Given an array of strings `words` and a string `chars`, return the sum of the lengths of all words that can be formed using the characters in `chars`.

Each character in `chars` can only be used once for each word.

## Approach

1. Create a frequency array for the characters in `chars`.
2. Traverse each word.
3. Clone the original frequency array.
4. Decrease the frequency while traversing the current word.
5. If any frequency becomes negative, the word cannot be formed.
6. Otherwise, add the length of the word to the answer.

## Time Complexity

- **O(chars.length() + total characters in all words)**

## Space Complexity

- **O(1)**

(Uses fixed-size frequency arrays of length 26.)

## Key Learning

- Frequency arrays are very useful when the character set is fixed.
- Cloning the original frequency array allows each word to be checked independently.
- Early termination (`break`) avoids unnecessary computations.
