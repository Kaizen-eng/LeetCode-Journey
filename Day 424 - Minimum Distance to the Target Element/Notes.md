# ✦ Notes — Minimum Distance to the Target Element

## ✦ 1. Core Concept

The required distance is:

`Math.abs(i - start)`

✦ `i` → current array index.

✦ `start` → given starting index.

✦ `Math.abs()` → returns the absolute value, eliminating negative distances.

## ✦ 2. Useful Java Methods

✦ `Math.abs(x)` — calculates the absolute value of `x`.

✦ `Math.min(a, b)` — returns the smaller of two values.

✦ `Integer.MAX_VALUE` — provides a large initial value for minimum tracking.

## ✦ 3. Why Minimum Tracking Works

Initialize:

`int min = Integer.MAX_VALUE;`

Whenever `nums[i] == target`, calculate the distance and update:

`min = Math.min(min, Math.abs(i - start));`

This keeps the smallest distance encountered so far.

## ✦ 4. Edge Cases

✦ **Target at the starting index:** Distance is `0`.

✦ **Multiple target occurrences:** Keep the smallest distance.

✦ **Target before the starting index:** `Math.abs()` handles the negative difference.

✦ **Target after the starting index:** The absolute difference gives the correct distance.

✦ **Target at index zero:** Works without a special condition.

The problem guarantees that `target` exists in `nums`, so a valid answer will always be found.

## ✦ 5. Optimization Insight

If `nums[i] == target` and `i == start`, return `0` immediately. No distance can be smaller than zero.

## ✦ 6. Complexity

✦ Time: `O(n)`

✦ Auxiliary space: `O(1)`

## ✦ Lesson Learned

Never confuse an array element's value with its index. First identify the exact quantity the problem asks you to minimize.
