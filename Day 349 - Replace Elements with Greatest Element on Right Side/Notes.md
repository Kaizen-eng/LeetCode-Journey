# Notes - Day 349

## 🧠 Observation

Every element only depends on the greatest element to its right.

Instead of finding that maximum repeatedly, we can maintain it while traversing from right to left.

---

## 💭 My First Thought

Use two loops.

For every index:
- Traverse all elements on its right.
- Find the maximum.
- Replace the current element.

Simple, but inefficient.

Time Complexity: **O(n²)**.

---

## ✨ Better Idea

Traverse from the last element towards the beginning.

Maintain a variable:

max = Greatest element seen so far.

For every index:
- Save the current value.
- Replace it with `max`.
- Update `max` if the saved value is greater.

Only one traversal is required.

---

## 📚 Pattern Learned

**Right-to-Left Traversal**

When each element depends on information from its right side, traversing backwards often leads to an optimal solution.

---

## ⏱ Complexity

### Brute Force
- Time: O(n²)
- Space: O(1)

### Optimal
- Time: O(n)
- Space: O(1)
