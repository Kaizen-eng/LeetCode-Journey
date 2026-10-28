# 🍬 2144. Minimum Cost of Buying Candies With Discount

<div align="center">

**Day 448 · LeetCode Daily Challenge**

*Greedy Algorithm · Sorting · Easy*

</div>

## 📌 Problem

Given an integer array `prices`, every time you buy three candies,
the cheapest candy among those three is free.

Return the minimum total cost required to buy all the candies.

## 💡 Approach — Greedy

To minimize the total cost:

1. Sort candy prices in descending order.
2. Pay for the first two candies in every group of three.
3. Skip the third candy because it is free.
4. Add the prices of all candies that must be paid for.

By arranging candies from most expensive to cheapest, the free candy
is always the cheapest possible within each group.

## 🧪 Example

**Input**
```text
prices = [6, 5, 7, 9, 2, 2]
```

**Sorted**
```text
[9, 7, 6, 5, 2, 2]
```

**Calculation**
```text
9 + 7 + 0 + 5 + 2 + 0 = 23
```

**Output**
```text
23
```

## 💻 Implementations

- `Solutions.java` — Java implementation
- `Solutions.py` — Python implementation

## 📊 Complexity

Let `n` be the number of candies.

- **Time:** `O(n log n)` — sorting
- **Auxiliary Space:** `O(1)` for Java's in-place sorting
  apart from sorting implementation details; Python's sorting
  requires `O(n)` additional space.

## 🧠 Key Takeaway

**Sort strategically. Pay for the expensive candies and let the
discount handle the cheapest ones.**

---

*Day 448 — Consistency over excuses. One problem at a time.* 🚀

[LeetCode Problem](https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount/)
