# Day 361 - Final Prices With a Special Discount in a Shop

## 🔗 Problem
https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/

## 🧩 Problem Statement
Given an array `prices`, for each item find the first item to its right whose price is less than or equal to the current item's price. If such an item exists, subtract it as a discount; otherwise, keep the original price.

## 💡 Approach
- Traverse each element in the array.
- For every price, search to its right for the first price that is less than or equal to it.
- If found, subtract that value as the discount.
- Otherwise, store the original price.
- Return the final prices array.

## ⏱️ Complexity
- **Time Complexity:** O(n²)
- **Space Complexity:** O(n)

## 📚 Concepts Practiced
- Arrays
- Nested Loops
- Brute Force
- Conditional Logic
