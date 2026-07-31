# Notes - Sort Colors

## What I Practiced

- Nested loop sorting
- Swapping elements
- Comparison operators
- Dry running arrays
- Debugging logic

## Mistake I Made

I accidentally used:

```java
nums[i - 1] <= nums[j]
```

instead of

```java
nums[i - 1] >= nums[j]
```

As a result, the array was sorted in reverse order.

My ma'am helped me identify the issue, which reminded me that even a single comparison operator can completely change the algorithm's behavior.

## Takeaway

Debugging isn't always about fixing complex logic.

Sometimes the entire bug is hiding in just one character.
