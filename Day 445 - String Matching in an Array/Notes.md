# Notes — 1408. String Matching in an Array

✦ **Core idea:** A word belongs in the answer if it occurs inside at least one *different array element*.

✦ **Java:** `other.contains(word)` checks whether `other` contains `word`.

✦ **Python:** `word in other` checks whether `other` contains `word`.

✦ **Avoid duplicates:** Once a match is found for a candidate word, use `break`.

✦ **Compare indices, not just values:** Use `i != j` so a word is not matched against its own array position. This also handles duplicate values correctly: two equal strings at different indices can match each other.

✦ **Complexity:** Checking all pairs takes `O(n² · L)` as a practical upper bound, where `n` is the number of words and `L` is the maximum word length. The result list uses up to `O(n)` space.
