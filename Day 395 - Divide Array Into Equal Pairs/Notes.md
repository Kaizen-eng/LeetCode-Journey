# Notes — 2206. Divide Array Into Equal Pairs

## ✦ **Core Idea**

Count how many times each number appears.

## ✦ **Why?**

Every pair must contain two equal elements.

Therefore, every distinct number must appear an even number of times.

## ✦ **HashMap**

```java
Map<Integer, Integer> map = new HashMap<>();
```
Use getOrDefault() to count frequencies:
map.put(num, map.getOrDefault(num, 0) + 1);

## ✦ Checking the frequencies
```java
for (int freq : map.values()) {
    if (freq % 2 != 0) {
        return false;
    }
}
```

If any frequency is odd → false.
If every frequency is even → true.

## ✦ Example
[3, 2, 3, 2, 2, 2]
3 → 2 → even ✓
2 → 4 → even ✓
Result → true

## ✦ Complexity:

Time: O(n)
Space: O(n)

## ✦ Key Learning:

When a problem asks whether elements can be grouped into equal pairs,
checking the frequency of each element is often the cleanest approach.
