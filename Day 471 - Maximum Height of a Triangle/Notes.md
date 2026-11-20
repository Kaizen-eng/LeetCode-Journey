# ✦ Notes — 3200. Maximum Height of a Triangle

## ✦ Core Observation

The triangle requires progressively more balls in every new row.

The required number of balls follows this sequence:

`1 → 2 → 3 → 4 → 5 → ...`

Each row alternates between Red and Blue.

Since either colour can be used first, both possibilities must be evaluated.

## ✦ Step-by-Step Algorithm

1. Create a helper function to calculate the maximum height for a given starting colour.
2. Initialize `ballsNeeded = 1`.
3. Initialize `count = 0`.
4. Select the colour for the current row.
5. Check whether that colour has enough balls.
6. If insufficient, stop the simulation.
7. Otherwise, deduct `ballsNeeded` from that colour.
8. Increment `ballsNeeded`.
9. Switch to the other colour.
10. Increment the completed row count.
11. Run the simulation with both starting colours.
12. Return the larger result.

## ✦ Dry Run

**Input:**

`red = 7, blue = 3`

**Starting with Red:**

| Row | Colour | Required | Red Left | Blue Left |
|---|---|---:|---:|---:|
| 1 | Red | 1 | 6 | 3 |
| 2 | Blue | 2 | 6 | 1 |
| 3 | Red | 3 | 3 | 1 |
| 4 | Blue | 4 | 3 | 1 |

Row 4 cannot be completed.

**Height = 3**

**Starting with Blue:**

| Row | Colour | Required | Red Left | Blue Left |
|---|---|---:|---:|---:|
| 1 | Blue | 1 | 7 | 2 |
| 2 | Red | 2 | 5 | 2 |
| 3 | Blue | 3 | 5 | 2 |

Row 3 cannot be completed.

**Height = 2**

**Final Answer:**

`max(3, 2) = 3`

## ✦ Important Code Concepts

**Java:**

- `boolean` — Tracks the currently selected colour.
- `!useRed` — Toggles between Red and Blue.
- `Math.max()` — Returns the larger height.
- `break` — Stops the simulation when the current row cannot be completed.

**Python:**

- `bool` — Tracks the selected colour.
- `not use_red` — Alternates between colours.
- `max()` — Returns the larger height.
- `break` — Exits the loop when insufficient balls are available.

## ✦ Common Mistakes

✗ Checking whether both colours have balls instead of checking the selected colour.

✗ Deducting a fixed number of balls in every iteration.

✗ Forgetting to increase `ballsNeeded`.

✗ Considering only one starting colour.

✦ Always check the selected colour against the current row requirement before deducting balls.

## ✦ Complexity

- **Time:** `O(√(red + blue))`
- **Auxiliary Space:** `O(1)`

## ✦ Final Learning

The problem is a good example of greedy simulation.

**Check → Deduct → Increment → Alternate → Repeat**

Always simulate both starting possibilities and choose the maximum result.

✦ Day 471 completed! 🚀
