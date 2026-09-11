# ✦ Day 401 — Maximum Value of a String

**LeetCode:** Maximum Value of a String  
**Difficulty:** Easy  
**Language:** Java  
**Topic:** Array | String

## ✦ Problem Statement

Given an array of alphanumeric strings, return the maximum value of any string in the array.

The value of a string is defined as:

✦ If the string contains only digits, its value is its numeric representation.

✦ Otherwise, its value is the length of the string.

## ✦ Approach

Traverse through every string in the array.

✦ Check whether the string contains only digits using a regular expression.

✦ If it contains only digits, convert it into an integer and compare it with the current maximum.

✦ Otherwise, use the length of the string as its value.

✦ Return the maximum value found.

## ✦ Result

**Solved Successfully ✅**

**Language:** Java

**Time Complexity:** O(n × k)

**Space Complexity:** O(1)

> "Keep moving. One problem at a time."
