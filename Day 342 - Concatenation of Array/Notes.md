# Notes

## 💭 Initial Thought

I initially planned to solve this problem using two loops:
- First loop to copy the original array.
- Second loop to copy the same elements into the second half.

While implementing it, I made two mistakes:
- Created the answer array with size `n` instead of `2 * n`.
- Used `i < n` as the second loop condition, causing the loop to never execute.

After debugging, I fixed the implementation.

---

## 🚀 Cleaner Solution

I then realized the problem can be solved using a single loop.

The modulo operator:

nums[i % n]

automatically repeats the original array, making the code shorter and cleaner.

---

## 🌱 What I Learned

- Output array size matters.
- Loop boundaries should always be checked carefully.
- The modulo operator is useful for cyclic/repeating patterns.
- Even simple problems improve debugging and implementation skills.
