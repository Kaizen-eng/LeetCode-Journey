# 485. Max Consecutive Ones

## Problem Statement

Given a binary array `nums`, return the maximum number of consecutive `1`s in the array.

### Example

**Input:**

```
nums = [1,1,0,1,1,1]
```

**Output:**

```
3
```

---

## Approach 1 - Running Streak (Recommended)

### Intuition

Instead of comparing adjacent elements, maintain the current streak of consecutive `1`s.

* If the current element is `1`, increment the current streak.
* If it's `0`, reset the streak.
* Keep track of the maximum streak encountered.

### Time Complexity

**O(n)**

### Space Complexity

**O(1)**

---

## Approach 2 - Branchless Mathematical Trick

Since the array contains only `0`s and `1`s:

```java
count = nums[i] * (count + 1);
```

* `1 × (count + 1)` → continues the streak.
* `0 × anything` → resets the streak.

This removes the explicit `if-else`, but the classic approach is generally easier to read and explain during interviews.

### Time Complexity

**O(n)**

### Space Complexity

**O(1)**

---

## Learning Outcome

This problem taught me an important lesson:

Sometimes the solution isn't about comparing neighboring elements. Instead, it's about maintaining the right state while traversing the array.

Understanding the thought process behind the algorithm is far more valuable than simply memorizing the code.
