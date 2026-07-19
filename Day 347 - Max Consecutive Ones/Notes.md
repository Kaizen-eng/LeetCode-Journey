# Notes

## Initial Mistake

My first instinct was to compare the current element with the next element.

```java
if (nums[i] == 1 && nums[i] == nums[i + 1])
```

This counts matching pairs instead of counting the actual length of a consecutive streak.

---

## Correct Observation

A streak depends only on the current element.

* If it's `1`, continue the streak.
* If it's `0`, reset the streak.

---

## Key Pattern

```java
if (nums[i] == 1)
    count++;
else
    count = 0;

max = Math.max(max, count);
```

This is a common pattern for many consecutive-element problems.

---

## Interesting Trick

Because the array contains only `0` and `1`:

```java
count = nums[i] * (count + 1);
```

works perfectly.

However, this trick only works for binary arrays.

---

## Takeaways

* Don't compare adjacent elements unless the problem specifically requires it.
* Think in terms of maintaining the current state.
* Readability is usually more valuable than clever one-liners.
* A lower "Runtime Beats %" doesn't necessarily mean the algorithm is worse; server conditions can affect those numbers.
