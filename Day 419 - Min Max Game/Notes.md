# Notes — LeetCode 2293

## Core Idea

The array is repeatedly reduced to half its size.

Every two adjacent elements produce one new element:

```text
newNums[i] =

MIN(nums[2 * i], nums[2 * i + 1])   → i is even

MAX(nums[2 * i], nums[2 * i + 1])   → i is odd
```

## Pattern

The entire problem can be remembered with one simple rule:

```text
Even index → MIN
Odd index  → MAX
```

## Why Simulation Works

The problem explicitly defines how each new array is constructed. There is no need for a complicated data structure or special mathematical transformation.

We simply:

```text
while length > 1
    create array of half the size
    process every pair
    replace current array
return remaining element
```

## Example

For:

```text
[1, 3, 5, 2, 4, 8, 2, 2]
```

First reduction:

```text
min(1,3) = 1
max(5,2) = 5
min(4,8) = 4
max(2,2) = 2

→ [1,5,4,2]
```

Second reduction:

```text
min(1,5) = 1
max(4,2) = 4

→ [1,4]
```

Final reduction:

```text
min(1,4) = 1

→ [1]
```

Therefore:

```text
Answer = 1
```

## Complexity

For an array of size `n`, the amount of work across all rounds is:

```text
n/2 + n/4 + n/8 + ... < n
```

Therefore:

- Time: `O(n)`
- Space: `O(n)`

## Common Mistake

Do not decide between `min` and `max` based on the original array index.

The condition is based on the **index `i` in `newNums`**.

```text
i % 2 == 0 → MIN
i % 2 != 0 → MAX
```
