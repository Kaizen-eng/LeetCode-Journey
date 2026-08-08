# Day 367 - Maximum Population Year

## 🧩 Problem
LeetCode 1854 - Maximum Population Year

## 💡 Approach

Each person is represented by:

[Birth Year, Death Year]

A person's population contribution is:

- +1 at their birth year
- -1 at their death year

Since the valid years range only from 1950 to 2050, we use an array of size 101.

We map each year to an array index using:

year - 1950

After recording all population changes, we traverse the array while maintaining the current population.

Whenever the current population becomes greater than the previous maximum, we update the answer.

Using `>` instead of `>=` ensures that when multiple years have the same maximum population, the earliest year is selected.

## ⏱️ Complexity

- Time: O(n)
- Space: O(1)

## 🧠 Key Takeaway

Instead of tracking every person's presence year-by-year, track only the events that change the population.

Birth → +1  
Death → -1

This turns the problem into a simple prefix-sum style traversal.
