# ✦ LeetCode 2678 — Number of Senior Citizens

**Day 391 of my LeetCode Journey**

## ✦ Problem

You are given an array of strings where each string contains information
about a passenger.

Each string has a fixed length of 15 characters:

- First 10 characters → Phone number
- 11th character → Gender
- Next 2 characters → Age
- Last 2 characters → Seat number

The task is to count the number of passengers who are older than 60.

---

## ✦ Approach

The age is stored at indices `11` and `12`.

So, we extract the age using:

```java
str.substring(11, 13)
