# ✦ DAY 464 — LEARNING NOTES

## 📚 Problem: 2383. Minimum Hours of Training to Win a Competition

### 🧠 Core Concept

The problem requires us to calculate the minimum training hours needed to defeat all opponents.

The interesting part is that energy and experience require two different strategies.

---

## ✦ 1. Understanding Energy

Energy decreases after every battle.

Therefore, instead of simulating every opponent, we calculate the total energy requirement.

**Observation:**

`Total Energy = sum(energy)`

We must have at least one additional energy point to successfully defeat the final opponent.

**Formula:**

`Energy Training = max(0, sum(energy) + 1 - initialEnergy)`

---

## ✦ 2. Understanding Experience

Experience increases after every victory.

Unlike energy, we cannot calculate the entire training requirement using a single sum.

We must process opponents sequentially.

**Steps:**

1. Compare current experience with opponent experience.
2. If current experience is insufficient, calculate the required training.
3. Update our experience after training.
4. Increase experience using the defeated opponent's experience.
5. Continue until every opponent is defeated.

**Formula:**

`Training = opponent - currentExperience + 1`

---

## ✦ 3. Important Python Concepts

| Concept | Purpose |
|:---|:---|
| `sum()` | Calculates total opponent energy |
| `max()` | Prevents negative training hours |
| `for` loop | Processes opponents sequentially |
| `if` condition | Checks whether training is necessary |
| Variable updates | Maintains current experience |

---

## ✦ 4. Dry Run Summary

**Initial Values:**

- Energy = 5
- Experience = 3

| Opponent | Opponent Experience | Experience Before Battle | Training | Experience After Victory |
|:---:|---:|---:|---:|---:|
| 1 | 2 | 3 | 0 | 5 |
| 2 | 6 | 5 | 2 | 13 |
| 3 | 3 | 13 | 0 | 16 |
| 4 | 1 | 16 | 0 | 17 |

**Final Calculation:**

Energy Training = 6

Experience Training = 2

Total = **8 hours**

---

## ⭐ Lessons Learned

✦ Not every problem requires the same approach for every variable.

✦ Mathematical observation can eliminate unnecessary simulation.

✦ Greedy decisions become easier when we understand how the state changes after every operation.

✦ Strict inequality (`>`) is different from non-strict inequality (`>=`).

---

**🚀 Day 464 — Learn. Understand. Implement. Repeat.**
