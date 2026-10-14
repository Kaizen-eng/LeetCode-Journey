# ✦ Day 434 — LeetCode 1773: Count Items Matching a Rule

**Difficulty:** Easy  
**Topics:** Array, String, Simulation  
**Languages:** Java and Python

## ✦ Problem Summary
Given a list of items, where each item contains three strings in this order:

`[type, color, name]`

Count how many items match the supplied `ruleKey` and `ruleValue`.

## ✦ Approach
1. Map `type`, `color`, and `name` to indices `0`, `1`, and `2`.
2. Traverse each item once.
3. Compare the attribute at the selected index with `ruleValue`.
4. Count every match.

## ✦ Complexity
- **Time:** `O(n)`, where `n` is the number of items.
- **Auxiliary space:** `O(1)`.

## ✦ Files
- `Solution.java` — Java implementation for LeetCode.
- `Solution.py` — Python implementation.
- `Notes.md` — concise revision notes and complexity analysis.

## ✦ Key Takeaway
A single traversal is sufficient when each item can be checked independently. Correct index mapping keeps the solution simple and readable.
