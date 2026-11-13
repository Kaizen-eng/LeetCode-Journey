# ✦ 2383. Minimum Hours of Training to Win a Competition

### 🟢 Difficulty: Easy
### 🧠 Topic: Greedy | Arrays | Simulation
### 💻 Languages: Python | Java

---

## 📌 Problem Overview

We are given our initial energy and experience along with two arrays representing the energy and experience of our opponents.

To defeat an opponent, we must have:

✦ Energy strictly greater than the opponent's energy.

✦ Experience strictly greater than the opponent's experience.

After defeating an opponent:

- Our energy decreases by the opponent's energy.
- Our experience increases by the opponent's experience.

Each hour of training increases either energy or experience by exactly 1.

Our objective is to determine the **minimum number of training hours** required to defeat every opponent in the given order.

---

## 💡 Approach: Greedy + Simulation

We handle energy and experience separately because their behaviours are different.

### ✦ 1. Energy Training

Since energy decreases after every battle, we calculate the total energy required to defeat all opponents.

**Formula:**

`Required Energy = sum(energy) + 1`

`Energy Training = max(0, Required Energy - initialEnergy)`

The additional 1 ensures that our energy remains strictly greater than the opponent's energy before the final battle.

### ✦ 2. Experience Training

Experience increases after every successful battle.

Therefore, we simulate the battles sequentially.

For each opponent:

- Check whether our current experience is greater than the opponent's experience.
- If not, calculate the required training hours.
- Increase our experience after training.
- Add the opponent's experience after winning.

**Formula:**

`Training = opponentExperience - currentExperience + 1`

---

## 🧪 Example

**Input:**

```python
initialEnergy = 5
initialExperience = 3
energy = [1, 4, 3, 2]
experience = [2, 6, 3, 1]
```

**Output:**

```python
8
```

**Explanation:**

✦ Energy Training = 6 hours

✦ Experience Training = 2 hours

✦ Total Training = 6 + 2 = **8 hours**

---

## ⚡ Complexity Analysis

| Complexity | Value | Explanation |
|:---|:---|:---|
| Time | O(n) | Traversing the opponent arrays |
| Space | O(1) | Constant auxiliary space |

---

## 🎯 Key Takeaways

✦ Use mathematical calculation when a cumulative requirement can be determined directly.

✦ Use sequential simulation when previous results influence subsequent operations.

✦ Remember that strictly greater requires an additional 1.

---

**✨ Day 464 — Another problem solved, another step forward!**

*Consistency builds the logic. Practice builds the confidence.*
