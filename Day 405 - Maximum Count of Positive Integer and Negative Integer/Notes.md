# ✦ Notes — LeetCode 2529

## ✦ Problem Understanding

We need to find the maximum count between:

✦ Positive integers  
✦ Negative integers

`0` must not be counted because it is neither positive nor negative.

---

## ✦ Important Observation

The array is sorted in **non-decreasing order**.

Therefore, all values appear in this structure:

`Negative → Zero → Positive`

For example:

```text
[-3, -2, -1, 0, 0, 1, 2]
  ← Negative →   ← Positive →
```
This sorted structure allows us to use Binary Search.

## ✦ Approach 1 — Linear Search
Traverse every element.
if num > 0
    positive_count++

else if num < 0
    negative_count++
We must use else if num < 0 instead of simply using else.

### ✦ Why?
Because:
num > 0 → Positive
num < 0 → Negative
num == 0 → Neither
Using only else would incorrectly count zero as a negative number.

## ✦ Approach 2 — Binary Search
We can find the boundaries using a lowerBound() function.

### ✦ lowerBound(nums, 0)
Finds the first index where:
nums[i] >= 0
Everything before that index is negative.
Therefore:
negative_count = lowerBound(nums, 0)

### ✦ lowerBound(nums, 1)
Finds the first index where:
nums[i] >= 1
Since the array contains integers, this is equivalent to finding the first positive integer.
Therefore:
positive_count = nums.length - lowerBound(nums, 1)
Finally:
answer = Math.max(negative_count, positive_count)

### ✦ Example
nums = [-3, -2, -1, 0, 0, 1, 2]
Negative count
lowerBound(nums, 0) = 3
So:
negative_count = 3
Positive count
lowerBound(nums, 1) = 5
So:
positive_count = 7 - 5 = 2
Final answer
max(3, 2) = 3

### ✦ Complexity
Linear Search
Time  → O(n)
Space → O(1)
Binary Search
We perform two binary searches:
O(log n) + O(log n)

which simplifies to:
Time  → O(log n)
Space → O(1)

## ✦ Key Learning
The biggest optimization here comes from recognizing that the array is sorted.
✦ Unsorted data → Linear Search is straightforward.
✦ Sorted data → Look for Binary Search opportunities.

A useful habit:
Don't just solve the problem. Study the properties of the input.
