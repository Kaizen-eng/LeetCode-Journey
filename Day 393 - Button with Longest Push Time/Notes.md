# ⭐ Notes

## ⭐ Core Idea

Each event contains:

[index, time]

The `time` represents when the button was pressed.

So, for every button after the first one:

duration = current time - previous time

### ⭐ Example

events = [[10,4], [1,6], [7,14]]

Button 10:
duration = 4

Button 1:
duration = 6 - 4 = 2

Button 7:
duration = 14 - 6 = 8

Therefore, the answer is:

7

## ⭐ Important Bug to Avoid

Do NOT compare:

maxDuration == currentTime

because `maxDuration` is a duration while `currentTime` is an absolute timestamp.

Instead, calculate the current duration first:

duration = events[i][1] - events[i-1][1]

Then compare:

duration > maxDuration

or

duration == maxDuration

## ⭐ Tie Condition

If two buttons have the same longest duration, return the smaller index.

For example:

Button 5 → 4 seconds
Button 2 → 4 seconds

Answer = 2

## ⭐ Complexity

Time: O(n)

Space: O(1)
