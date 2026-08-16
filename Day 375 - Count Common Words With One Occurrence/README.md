# Day 375 - Count Common Words With One Occurrence

## Problem

Given two string arrays `words1` and `words2`, return the number of strings that appear **exactly once in both arrays**.

## Approach

I used **HashMap + Frequency Counting**.

The idea is to store the frequency of every word in both arrays.

### Steps

1. Create `map1` for frequencies of `words1`.
2. Create `map2` for frequencies of `words2`.
3. Iterate through `words1` and count each word.
4. Iterate through `words2` and count each word.
5. Iterate through the keys of `map1`.
6. Check whether the word occurs exactly once in both maps.
7. If yes, increment `count`.
8. Return `count`.

## Key Condition

```java
map1.get(word) == 1 && map2.getOrDefault(word, 0) == 1
