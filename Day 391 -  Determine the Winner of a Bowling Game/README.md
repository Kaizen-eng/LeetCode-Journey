# ✦ LeetCode 2660: Determine the Winner of a Bowling Game 🎳

**Day 391** of my #100DaysOfCode journey 🚀

## ✦ Problem

Given the scores of two players in a bowling game, determine the winner based on the scoring rules.

If a player scores 10 pins in either of the previous two turns, the current turn's score is counted as **2×**.

Return:

- `1` → Player 1 wins
- `2` → Player 2 wins
- `0` → Draw

## ✦ Approach

1. Traverse each player's score array.
2. Check whether either of the previous two turns was a strike (`10`).
3. If yes, double the current score.
4. Add the score to the total.
5. Compare both players' final scores.

## ✦ Complexity

- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

## ✦ Language

Java ☕
