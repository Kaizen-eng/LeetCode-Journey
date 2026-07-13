# Day 341 Notes

## 🌱 Key Learnings

- Learned how to use a **HashMap** to store element frequencies.
- Understood the importance of `getOrDefault()` while building a frequency map.
- Practiced using `keySet()` to retrieve the remaining elements.
- Learned how `Collections.sort()` can be used after converting keys into a List.
- Understood why removing processed elements from the map simplifies the remaining work.

---

## 💭 Mistakes I Made

- Compared `arr1[j]` with `arr2[j]` instead of `arr2[i]`.
- Tried to insert elements using the same index instead of maintaining a separate answer index.
- Forgot to create the answer array.
- Initially thought `getOrDefault(num + 1, 1)` was correct.
- Forgot that `Arrays.sort()` is used instead of `arr.sort()`.

---

## 🔄 Alternative Approach

This problem can also be solved using **Counting Sort**.

Since the constraints guarantee:

0 <= arr[i] <= 1000

we can use a frequency array instead of a `HashMap`, reducing both code complexity and overhead.

---

## ⭐ Pattern Learned

Frequency Counting (HashMap)

This pattern is commonly used in:

- Top K Frequent Elements
- Valid Anagram
- Majority Element
- Intersection of Arrays
- Counting Problems
