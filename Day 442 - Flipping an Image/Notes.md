✦ Notes — LeetCode 832

✦ Key Concept

Flip + Invert = Reverse + Toggle

✦ Important Trick

"bit ^ 1" toggles a binary bit.

- "0 ^ 1 = 1"
- "1 ^ 1 = 0"

✦ Two-Pointer Technique

✦ Start from both ends of a row.

✦ Swap and invert the elements simultaneously.

✦ For an odd-length row, the middle element is inverted once.

✦ For an even-length row, the pointers eventually cross.

✦ Complexity

- Time: "O(m × n)"
- Extra Space: "O(1)"

✦ Takeaway

A separate reversal and inversion pass is unnecessary. Both operations can be completed in a single traversal using two pointers.
