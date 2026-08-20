# Notes

## ✦ Key Idea

Use a `HashMap<Integer, Integer>` to store:

```text
Key   → Array element
Value → Frequency
```

Example:

```text
nums = [1,1,1,2,2,3]

Map:
1 → 3
2 → 2
3 → 1
```

## ✦ Frequency Pattern

```java
map.put(num, map.getOrDefault(num, 0) + 1);
```

This increases the frequency of `num` by `1`.

## ✦ Accessing Key and Frequency

```java
for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    int value = entry.getKey();
    int frequency = entry.getValue();
}
```

✦ `getKey()` → actual element

✦ `getValue()` → frequency

## ✦ Limiting Occurrences

For every element:

```java
int count = Math.min(frequency, k);
```

This ensures that no element appears more than `k` times.

Example:

```text
frequency = 5
k = 2

Math.min(5, 2) = 2
```

So only `2` copies are added.

## ✦ Steps

1. ✦ Count frequencies using `HashMap`.
2. ✦ Calculate the size of the result array.
3. ✦ Iterate through the map entries.
4. ✦ Add each element `min(frequency, k)` times.
5. ✦ Sort the result.
6. ✦ Return the result.

## ✦ Complexity

- **Time:** `O(n + r log r)`
- **Space:** `O(n)`

## ✦ Lesson

This problem was a good reminder that DSA isn't just about writing loops.

Recognizing patterns like **frequency counting + HashMap** is the real skill I'm building.
