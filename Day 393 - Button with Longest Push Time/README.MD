# ⭐ LeetCode 1629 – Slowest Key

## ⭐ Problem
Given a list of button press events, return the index of the button that took the longest time to press.

If multiple buttons have the same longest duration, return the button with the smallest index.

## ⭐ Approach
- The first button's duration is its timestamp.
- For every following event:
  - Calculate the duration using:
    `currentTime - previousTime`
- Track the maximum duration.
- If two durations are equal, keep the smaller button index.

## ⭐ Complexity
- Time: O(n)
- Space: O(1)

## ⭐ Key Learning
The important part of this problem is distinguishing between an absolute timestamp and the duration of an event.

`duration = current timestamp - previous timestamp`
