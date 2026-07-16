# Notes

## Journey

### Initial Thought ❌

My first idea was to compare adjacent elements, assuming different neighbors meant the current element was unique.

I soon realized this doesn't work because duplicate elements may appear anywhere in the array.

---

### Brute Force

The first correct solution was to count the frequency of each element using two nested loops.

Although it works, it repeatedly counts the same values, leading to `O(n²)` time complexity.

---

### Optimization 1 – HashMap

Instead of counting every time, store each element's frequency once using a `HashMap`.

This reduces the time complexity to `O(n)`.

Pattern to remember:

```java
map.put(num, map.getOrDefault(num, 0) + 1);
```

---

### Optimization 2 – Frequency Array

The constraints (`1 <= nums[i] <= 100`) reveal an even simpler solution.

A frequency array can directly store the count of each number:

```java
int[] frequency = new int[101];
```

This avoids hashing overhead while maintaining `O(n)` time complexity.

---

## Key Learning

Before choosing a data structure, always inspect the constraints.

* Small fixed range → Frequency Array
* Large or unknown range → HashMap

Recognizing these patterns is just as important as solving the problem itself.
