# 1720. Decode XORed Array

**Day 450** of my LeetCode journey! 🚀

## 📝 Problem
Given an encoded array and the first element of the original array, reconstruct the original array using the XOR operation.

**Problem Link:** [1720. Decode XORed Array](https://leetcode.com/problems/decode-xored-array/)

## 💡 Approach
- Create a new array of size `encoded.length + 1`.
- Store `first` as the first element.
- Traverse the encoded array.
- Use XOR between the previous decoded element and the current encoded element.
- Return the reconstructed array.

## 💻 Languages
- Java
- Python

## ⏱️ Complexity Analysis

| Complexity | Value |
|---|---|
| Time | O(n) |
| Space | O(n) |

## 🔑 Key Concept
**XOR Reversibility:**

`a ^ b ^ a = b`

This property allows us to recover the original array elements efficiently.

---

**450 Days of Consistency. One Problem at a Time!** 🔥
