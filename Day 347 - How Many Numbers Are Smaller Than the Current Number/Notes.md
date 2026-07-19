# Notes - Day 347

## Initial Thought

The first idea was simple:
For every element, compare it with every other element and count how many numbers are smaller.

```java
for (int i = 0; i < nums.length; i++) {
    int count = 0;

    for (int j = 0; j < nums.length; j++) {
        if (nums[i] > nums[j]) {
            count++;
        }
    }

    ans[i] = count;
}
```

It is easy to understand but takes **O(n²)** time.

---

## Optimization

The constraint:

```
0 <= nums[i] <= 100
```

means there are only **101 possible values**.

Instead of comparing every pair:

1. Count the frequency of each value.
2. Convert the frequency array into a prefix sum array.
3. Use `freq[value - 1]` to find how many values are smaller.

---

## Why Prefix Sum?

After building the prefix array:

```
freq[x]
```

stores:

> Number of elements **≤ x**

So for a value `x`, the number of elements **< x** is simply:

```
freq[x - 1]
```

---

## Key Takeaways

- Read the constraints before choosing an algorithm.
- Small value ranges often suggest frequency counting.
- Prefix sums can transform repeated counting into constant-time lookups.
- Understanding the implementation is more valuable than memorizing the code.
