# Day 353 - Create Target Array in the Given Order

## 🔹 Problem

Given two integer arrays `nums` and `index`, create a target array by inserting each element from `nums` into the position specified by `index`.

## 🔹 Approaches

### 1. ArrayList (Recommended)

* Use an `ArrayList`.
* Insert each element directly using `add(index, value)`.
* Convert the list back into an array.

**Time Complexity:** O(n²)

**Space Complexity:** O(n)

---

### 2. Manual Array Shifting

* Create a target array of size `n`.
* Before inserting a new element, shift all existing elements one position to the right.
* Insert the new element into the required index.

**Time Complexity:** O(n²)

**Space Complexity:** O(n)

---

## 🌱 What I Learned

This problem taught me the difference between **replacing** and **inserting** elements.

While replacing simply overwrites an existing value, insertion requires creating space first by shifting elements to the right. I also learned why shifting must always happen from **right to left** to prevent overwriting data.

This was a great exercise for strengthening my understanding of array manipulation.
