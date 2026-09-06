# ✦ Notes — LeetCode 2951

## 🏔️ Find the Peaks

### ✦ Main Observation
The first and last elements cannot be peaks because they don't have two neighbors.

Therefore:

```text
i = 1 → n - 2
```

### ✦ Peak Condition

For every middle element:

```java
mountain[i] > mountain[i - 1] &&
mountain[i] > mountain[i + 1]
```

If the condition is satisfied:

```java
peaks.add(i);
```

### ✦ Why ArrayList?
We cannot predict the number of peaks beforehand.

So instead of creating an array with a fixed size, use:

```java
List<Integer> peaks = new ArrayList<>();
```

This allows us to dynamically add every peak index.

### ✦ Pattern Learned

**Unknown number of results → Dynamic List**

This is a useful pattern for problems where we need to collect all elements/indices satisfying a condition.

✦ **Scan → Check → Collect**

### ✦ Complexity
**Time:** O(n)  
**Space:** O(k)

where `k` is the number of peaks.
