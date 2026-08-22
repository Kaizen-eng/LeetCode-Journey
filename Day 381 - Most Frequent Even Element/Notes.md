Notes.md

# Notes

## ✦ Key Idea

Use a `HashMap<Integer, Integer>` to store:

```text
Key   → Number
Value → Frequency
```

Example:

```text
nums = [0,1,2,2,4,4,1]

Map:
0 → 1
1 → 2
2 → 2
4 → 2
```

## ✦ Frequency Pattern

```java
map.put(num, map.getOrDefault(num, 0) + 1);
```

This increases the frequency of `num` by `1`.

## ✦ Accessing Map Entries

```java
for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    int num = entry.getKey();
    int count = entry.getValue();
}
```

✦ `getKey()` gives the number.

✦ `getValue()` gives its frequency.

## ✦ Tie-Break Rule

```java
count > maxFreq || (count == maxFreq && (answer == -1 || num < answer))
```

This means:

✦ Choose `num` if it appears more often.

✦ If the frequency is equal, choose the smaller even number.

## ✦ Steps

1. ✦ Count each number using a HashMap.
2. ✦ Set `maxFreq = 0` and `answer = -1`.
3. ✦ Iterate through the map entries.
4. ✦ Skip odd numbers.
5. ✦ Update the answer based on frequency and the tie-break rule.
6. ✦ Return `answer`.

## ✦ Complexity

- Time: O(n)
- Space: O(n)

## ✦ Lesson

Frequency counting with a HashMap is powerful, but reading the tie-break condition carefully is equally important.
