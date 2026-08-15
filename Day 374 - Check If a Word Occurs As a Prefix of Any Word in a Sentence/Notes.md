# Day 374 - Check If a Word Occurs As a Prefix of Any Word in a Sentence

## Problem Understanding

We are given:

- A sentence containing multiple words.
- A `searchWord`.

We need to find the **first word whose prefix matches `searchWord`**.

The answer must be **1-indexed**.

If there is no matching word, return `-1`.

---

## Approach 1 - String Splitting + Linear Search

This was the approach used in my final solution.

### Step 1 - Split the Sentence

```java
String[] words = sentence.split(" ");
```

For example:

```text
"i love eating burger"
```

becomes:

```text
["i", "love", "eating", "burger"]
```

### Step 2 - Traverse the Words

Check every word one by one.

### Step 3 - Check the Prefix

Java provides:

```java
words[i].startsWith(searchWord)
```

This directly checks whether `searchWord` is a prefix of the current word.

### Step 4 - Return the Position

Since arrays use **0-based indexing**, but the problem requires **1-based indexing**:

```java
return i + 1;
```

If no word matches:

```java
return -1;
```

---

## Approach 2 - Two-Pointer Exploration

I also explored a character-based Two-Pointer approach.

The basic idea is:

```text
L → beginning of the current word
R → character currently being compared
```

When `R` reaches a space, the current word has ended.

Then:

```java
L = R + 1;
```

moves `L` to the beginning of the next word.

While comparing characters:

```java
sentence.charAt(R) == searchWord.charAt(R - L)
```

Here, `R - L` converts the absolute sentence position into the corresponding index inside `searchWord`.

If all characters of `searchWord` match:

```java
matched == searchWord.length()
```

the current word is the required answer.

### Why I Didn't Use It

Although the Two-Pointer approach is useful for understanding the problem and its categorization, it requires more manual handling of:

- Word boundaries
- Character positions
- Pointer movement
- Prefix comparison

The `split()` + `startsWith()` solution is much cleaner for this particular problem.

---

## Important Java Methods

### `split()`

```java
sentence.split(" ")
```

Splits a string into an array using the given delimiter.

### `startsWith()`

```java
word.startsWith(searchWord)
```

Checks whether a string begins with another string.

### `substring()`

During exploration, I also revisited:

```java
string.substring(start, end)
```

Remember:

- `start` → inclusive
- `end` → exclusive

---

## Key Takeaways

- A problem tagged with a technique does not always require that technique in the final implementation.
- Understanding the underlying Two-Pointer approach is still valuable.
- Choosing the right built-in operation can significantly simplify the solution.
- Always pay attention to **0-based vs 1-based indexing**.

### Complexity

**Time:** O(n)

**Space:** O(n)

---

**Day 374 — Solved, explored, and understood. 🚀**
