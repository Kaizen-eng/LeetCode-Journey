Notes.md

# Notes

## ✦ Key Idea

For every element `nums[i]`, compare it with:

```text
nums[i - k]
nums[i + k]
```

But these indices may not always exist.

So, we must handle boundaries carefully.

## ✦ Boundary Check Pattern

```java
boolean leftGood = i - k < 0 || nums[i] > nums[i - k];
boolean rightGood = i + k >= nums.length || nums[i] > nums[i + k];
```

This means:

✦ If `i - k` does not exist, the left condition is valid.

✦ If `i + k` does not exist, the right condition is valid.

✦ Otherwise, the current number must be strictly greater than that value.

## ✦ Steps

1. ✦ Initialize `sum = 0`.

2. ✦ Traverse the array from index `0` to `nums.length - 1`.

3. ✦ Check the left and right conditions.

4. ✦ If both conditions are true, add `nums[i]` to `sum`.

5. ✦ Return `sum`.

## ✦ Complexity

- Time: O(n)
- Space: O(1)

## ✦ Lesson

When working with arrays, edge elements often do not have every neighbour or comparison index available.

Using logical OR conditions makes boundary handling simple and clean.

