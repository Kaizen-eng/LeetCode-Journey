## Notes.md

```markdown
# Notes - Day 371

## Core Idea

The key observation was:

```text
positive + negative = 0
```

So instead of separately checking whether `k` and `-k` exist, I can simply look for a pair whose sum is `0`.

## Two Pointer Logic

After sorting:

```text
[-7, -3, -1, 1, 3, 7]
  ↑                 ↑
  L                 R
```

### If:

```text
nums[L] + nums[R] == 0
```

We found a valid pair.

The positive value is:

```text
nums[R]
```

Since `R` starts from the largest element, the first valid pair gives the largest possible answer.

### If:

```text
nums[L] + nums[R] < 0
```

The sum is too small, so we need a larger value.

```text
L++
```

### If:

```text
nums[L] + nums[R] > 0
```

The sum is too large, so we need a smaller value.

```text
R--
```

## Important Mistake

Initially, I accidentally wrote:

```java
R++;
```

when the sum was positive.

That moves `R` outside the array.

The correct movement is:

```java
R--;
```

because we need a smaller value.

## Main Lesson

The problem initially looked like it needed a complicated condition to identify `k` and `-k`.

But the simpler relationship is:

```text
sum == 0
```

Then sorting + two pointers makes finding the largest valid pair straightforward.
```

---
