# Notes

## Core Observation

The important part of this problem is handling **consecutive duplicates**.

For example:

```text
[2, 4, 4, 4, 1]
```

The repeated `4`s should be treated as a single section:

```text
[2, 4, 1]
```

So the `4` is a hill.

## Logic

For every element that has a different value on both sides:

```text
previous < current > next
```

→ Hill 🏔️

```text
previous > current < next
```

→ Valley 🏞️

If neither condition is true, it is not counted.

## Important Edge Case

Do not simply use `nums[i - 1]` as the left neighbor.

If there are duplicates:

```text
[5, 3, 3, 3, 5]
```

the `3`s must be compared with `5` on the left and `5` on the right.

Therefore, we maintain the previous **different** value.

## Complexity

- Time: `O(n)`
- Space: `O(1)`

## Takeaway

When an array problem talks about the **nearest different element**, consecutive duplicates can often be handled by skipping equal values rather than creating another array.
