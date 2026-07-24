# Notes - Three Consecutive Odds

## 🧠 What I Learned

- Fixed-size window problems require precise loop limits.
- Arrays of length exactly three don't always need separate handling.
- Off-by-one errors are among the most common bugs in array problems.

## ⚠️ Mistake I Made

I initially used:

```java
for (int i = 0; i < arr.length - 3; i++)
```

This skipped the last possible window.

Correct version:

```java
for (int i = 0; i <= arr.length - 3; i++)
```

or

```java
for (int i = 0; i < arr.length - 2; i++)
```

## 🎯 Optimization

The special case for `arr.length == 3` isn't necessary because the loop naturally handles it.

## 📌 Overall

A simple implementation, but a great reminder that even one missing iteration can cause hidden test cases to fail.
