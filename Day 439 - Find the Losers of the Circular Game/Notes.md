
# ✦ Notes — Day 439

## ✦ Core Concept

Simulation + Visited Array

## ✦ Important Formula

`next = (current + turn * k) % n`

## ✦ Why Modulo?

✦ Keeps the index within the circular boundary.

✦ Wraps around to the beginning after reaching the end.

## ✦ Algorithm

✦ Initialize `visited[n]` with `false`.

✦ Start with `current = 0` and `turn = 1`.

✦ While the current friend is unvisited:

  ✧ Mark the friend as visited.

  ✧ Move using `(current + turn * k) % n`.

  ✧ Increment `turn`.

✦ Collect all unvisited friends in ascending order.

✦ Add `1` to each index to obtain the actual friend number.

## ✦ Edge Cases

✦ `n = 1, k = 1` → `[]`

✦ `n = 4, k = 4` → `[2, 3, 4]`

✦ `n = 5, k = 2` → `[4, 5]`

## ✦ Complexity

✦ Time: `O(n)`

✦ Space: `O(n)`

## ✦ Lesson Learned

A Boolean array prevents repeated processing,
while modulo arithmetic handles circular movement.
