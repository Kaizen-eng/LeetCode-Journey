# Day 354 - LeetCode 717: 1-bit and 2-bit Characters

## 📝 Problem
We have two special characters:

- `0` → One-bit character
- `10` or `11` → Two-bit character

Given a binary array ending with `0`, determine whether the last character must be a one-bit character.

## 💡 Approach
Instead of trying to infer the answer from the last few bits, simulate the decoding process.

- If the current bit is `0`, move one position.
- If the current bit is `1`, move two positions.
- Track whether the final decoded character is one-bit or two-bit.

## 📊 Complexity
- **Time:** O(n)
- **Space:** O(1)

## 🎯 Key Learning
When a problem describes an encoding or decoding process, simulating the process is often simpler and more reliable than searching for patterns.
