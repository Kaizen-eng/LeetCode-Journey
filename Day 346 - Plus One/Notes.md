# Notes

## 🧠 Initial Thought

My first idea was to convert the array into an integer, add one, and convert it back into an array.

### Why this fails

* Integer overflow occurs for very large numbers.
* The problem intentionally represents the number as an array because it may contain more digits than any primitive data type can store.

---

## ✅ Key Learning

Instead of treating the input as a number, treat it as a sequence of digits.

The carry naturally propagates while traversing from right to left.

* If digit < 9 → Increment and return.
* If digit == 9 → Set it to 0 and continue.
* If all digits are 9 → Create a new array with one extra digit.

---

## ⭐ Pattern Learned

Working with digits directly is often safer than converting them into numeric data types.

This is a common pattern for array-based arithmetic problems.

---

Built as part of my daily LeetCode journey to strengthen problem-solving skills and prepare for software engineering interviews.
