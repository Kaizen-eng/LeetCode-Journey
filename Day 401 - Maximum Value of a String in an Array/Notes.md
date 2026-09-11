# ✦ Notes — Day 401

## ✦ Key Concepts

✦ `str.matches("\\d+")` → checks whether the string contains only digits.

✦ `Integer.parseInt(str)` → converts a numeric string into an integer.

✦ `str.length()` → gives the value of an alphanumeric string.

✦ `Math.max()` → keeps track of the maximum value.

## ✦ Logic

For every string:

1. Check whether it contains only digits.
2. If yes → convert it into an integer.
3. Otherwise → use its length.
4. Compare the value with the current maximum.
5. Return the maximum.

## ✦ Important Observation

The main trick is identifying the two possible definitions of **string value**.

Numeric string → **numeric value**

Alphanumeric string → **string length**

## ✦ Complexity

**Time Complexity:** O(n × k)

Where:
✦ `n` = number of strings
✦ `k` = average length of each string

**Space Complexity:** O(1)
