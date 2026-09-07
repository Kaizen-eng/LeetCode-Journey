# ✦ Notes – LeetCode 16: 3Sum Closest

## Key Concept

Unlike 3Sum, we don't necessarily need an exact target.

We need to find the sum that has the smallest absolute difference from
the target.

```text
difference = |sum - target|
```
The smaller the difference, the closer the sum is.

## Two Pointer Logic:
### After sorting:
1. sum < target
→ We need a larger sum
→ Move left pointer right

2. sum > target
→ We need a smaller sum
→ Move right pointer left

3. sum == target
→ Exact match
→ Return immediately

## Important Learning:
The main new concept is maintaining the best answer found so far.
```java
if (Math.abs(sum - target) < Math.abs(closest_sum - target)) {
    closest_sum = sum;
}
```
```text
So instead of only asking:
"Did I find the target?"

we ask:
"Is this the closest value to the target I've found so far?"
```

##Example
nums = [-1, 2, 1, -4]
target = 1

-1 + 2 + 1 = 2
|2 - 1| = 1

Therefore, the closest sum is 2.
```
Pattern
Sort
  ↓
Fix one element
  ↓
Two pointers
  ↓
Calculate sum
  ↓
Update closest answer
  ↓
Move pointers according to target
```
