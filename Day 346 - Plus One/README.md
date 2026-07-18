# LeetCode 66 - Plus One

## 📌 Problem

Given an integer represented as an array of digits, increment the integer by one and return the resulting array.

---

## 💡 Approach

### Approach 1 – Carry Propagation (Optimal)

* Traverse the array from the last digit towards the beginning.
* If the current digit is less than `9`, increment it and return the array immediately.
* If the digit is `9`, set it to `0` and continue to the previous digit.
* If every digit becomes `0`, create a new array with one extra element and place `1` at the beginning.

---

## ⏱️ Complexity

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(1)` (or `O(n)` only when a new array is required)

---

## 🚀 Language

Java
