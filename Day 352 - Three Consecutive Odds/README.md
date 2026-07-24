# Day 352 - Three Consecutive Odds

## 🔹 Problem
Given an integer array, determine whether there exist three consecutive odd numbers.

## 💡 Approach

1. Return `false` immediately if the array has fewer than three elements.
2. Traverse the array while considering every consecutive group of three elements.
3. Check whether all three numbers are odd.
4. If such a group is found, return `true`.
5. Otherwise, return `false` after checking all possible groups.

## ✅ Time Complexity
- **O(n)**

## ✅ Space Complexity
- **O(1)**

## 📚 Key Takeaways
- Be careful with loop boundaries when checking fixed-size windows.
- Hidden test cases often reveal off-by-one mistakes.
- Simple problems still require careful attention to edge cases.

## 🚀 Reflection
A small off-by-one error caused three hidden test cases to fail. Debugging it reinforced how important loop boundaries are when traversing arrays with fixed-size windows.
