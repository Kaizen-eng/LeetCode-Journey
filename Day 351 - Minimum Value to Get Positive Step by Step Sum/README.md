# 1413. Minimum Value to Get Positive Step by Step Sum

## 📝 Problem Statement

Given an integer array `nums`, find the minimum positive start value such that the step-by-step sum is never less than `1`.

### Example

```text
Input: nums = [-3,2,-3,4,2]
Output: 5
```

---

## 💡 Approach 1: Brute Force

### Idea

- Try every possible starting value beginning from `1`.
- Simulate the running sum for each start value.
- If the running sum becomes less than `1`, try the next starting value.
- Return the first valid start value.

### Time Complexity

- **O(n × answer)**

### Space Complexity

- **O(1)**

---

## 🚀 Approach 2: Prefix Sum (Optimal)

### Idea

- Calculate the running (prefix) sum while traversing the array.
- Keep track of the minimum prefix sum encountered.
- If the minimum prefix sum is negative, increase the initial value just enough so every running sum stays at least `1`.

Formula:

```text
Minimum Start Value = 1 - (Minimum Prefix Sum)
```

---

### Time Complexity

- **O(n)**

### Space Complexity

- **O(1)**

---

## ✨ Key Learning

- Prefix sums can solve problems without trying every possibility.
- Tracking only the minimum prefix sum is enough to determine the answer.
- Sometimes the optimal solution comes from observing the running state instead of simulating every starting value.
