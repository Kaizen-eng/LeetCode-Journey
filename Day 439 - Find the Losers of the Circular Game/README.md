
# ✦ 2682. Find the Losers of the Circular Game

✦ **Difficulty:** Easy

✦ **Topics:** Array, Hash Table, Simulation

✦ **Languages:** Java ☕ | Python 🐍

---

## ✦ Problem Summary

Given `n` friends sitting in a circle and a step multiplier `k`, simulate a ball-passing game.

The ball starts with friend `1`. On each turn, the distance increases by a multiple of `k`. The game ends when a friend receives the ball for the second time.

Return the friends who never received the ball, in ascending order.

## ✦ Approach

✦ Maintain a Boolean array to track visited friends.

✦ Start at index `0` with turn `1`.

✦ Mark the current friend as visited.

✦ Calculate the next position using:

`next = (current + turn * k) % n`

✦ Stop when a visited position is encountered.

✦ Collect the unvisited friends and convert their indices to one-based numbering.

## ✦ Example

**Input:** `n = 5, k = 2`

**Output:** `[4, 5]`

## ✦ Complexity Analysis

✦ **Time Complexity:** `O(n)`

✦ **Space Complexity:** `O(n)`

## ✦ Key Takeaway

Circular simulation becomes simple with modulo arithmetic
and a visited array.
