# ✦ DAY 423 — CONCEPT NOTES
## 𝟏𝟔𝟖𝟒. 𝐂𝐨𝐮𝐧𝐭 𝐭𝐡𝐞 𝐍𝐮𝐦𝐛𝐞𝐫 𝐨𝐟 𝐂𝐨𝐧𝐬𝐢𝐬𝐭𝐞𝐧𝐭 𝐒𝐭𝐫𝐢𝐧𝐠𝐬

### ✦ 𝐊𝐄𝐘 𝐈𝐍𝐒𝐈𝐆𝐇𝐓

A word is consistent only when **every character belongs to the allowed set**.

For example:

✦ `allowed = "abc"`

✦ `"cab"` → Consistent

✦ `"aaa"` → Consistent

✦ `"abx"` → Inconsistent because `x` is forbidden.

A word does not need to contain every character in `allowed`.

### ✦ 𝐖𝐇𝐘 𝐇𝐀𝐒𝐇𝐒𝐄𝐓?

A `HashSet<Character>` lets us check whether a character is allowed without repeatedly scanning the entire `allowed` string.

```java
Set<Character> allowedSet = new HashSet<>();

for (char ch : allowed.toCharArray()) {
    allowedSet.add(ch);
}
```

### ✦ 𝐍𝐄𝐒𝐓𝐄𝐃 𝐋𝐎𝐎𝐏 𝐒𝐓𝐑𝐔𝐂𝐓𝐔𝐑𝐄

```java
for (String word : words) {
    boolean consistent = true;

    for (char ch : word.toCharArray()) {
        if (!allowedSet.contains(ch)) {
            consistent = false;
            break;
        }
    }

    if (consistent) {
        count++;
    }
}
```

✦ **Outer loop:** Selects each word.

✦ **Inner loop:** Checks each character in the selected word.

✦ **Boolean flag:** Tracks whether the current word remains consistent.

✦ **`break`:** Stops checking the current word as soon as a forbidden character is found. The outer loop continues with the next word.

### ✦ 𝐀 𝐂𝐎𝐌𝐌𝐎𝐍 𝐌𝐈𝐒𝐓𝐀𝐊𝐄

Incorrect:

```java
if (allowedSet.contains(ch)) {
    count++;
}
```

This counts individual allowed characters instead of consistent words.

Correct:

```java
if (consistent) {
    count++;
}
```

Count only after the entire word has been checked.

### ✦ 𝐂𝐎𝐌𝐏𝐋𝐄𝐗𝐈𝐓𝐘

Let `A` be the length of `allowed`, `C` the total number of characters across all words, and `W` the number of words.

✦ **Time:** `O(A + C)` average.

✦ **Auxiliary Space:** `O(A)` for the HashSet, excluding the input.

### ✦ 𝐓𝐀𝐊𝐄𝐀𝐖𝐀𝐘

**Validate the whole word before counting it.**

HashSet membership checks + nested loops + early termination = a clean and efficient solution.
