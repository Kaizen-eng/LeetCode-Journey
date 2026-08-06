# Day 364 - Calculate Amount Paid in Taxes

## 📝 Problem
**LeetCode 2303 - Calculate Amount Paid in Taxes**

## 💡 Approach

This problem is based on simulating tax calculations across different tax brackets.

Instead of modifying the input array, we keep track of the previous tax bracket's upper limit. For each bracket:

1. Calculate the size of the current tax bracket.
2. Determine how much of the income belongs to that bracket using `Math.min()`.
3. Calculate the tax for that portion.
4. Move to the next bracket by updating the previous upper limit.
5. Stop once the income no longer reaches the current bracket.

## ⏱️ Complexity

- **Time:** O(n)
- **Space:** O(1)

## 🌱 Key Learning

- Working with 2D arrays.
- Simulating real-world tax brackets.
- Using `Math.min()` to calculate taxable income.
- Managing previous state using a variable instead of modifying the input.
