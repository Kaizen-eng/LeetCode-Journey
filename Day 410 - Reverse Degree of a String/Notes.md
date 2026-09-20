# Notes — LeetCode 3498: Reverse Degree of a String

## Core Idea

The problem sounds like we need to create a reversed alphabet:

```text
z y x ... c b a
1 2 3 ... 24 25 26
```

But we can calculate every value directly.

### Normal alphabet

Characters are represented by numeric values, so:

```java
ch - 'a'
```

produces:

```text
a → 0
b → 1
c → 2
...
z → 25
```

### Reverse position

The reverse alphabet uses:

```text
a → 26
b → 25
c → 24
...
z → 1
```

Therefore:

```java
26 - (ch - 'a')
```

### String position

The problem uses a **1-indexed** position, while Java string indexes are **0-indexed**.

So:

```java
i + 1
```

is the required position.

### Complete contribution

```java
int reversePosition = 26 - (s.charAt(i) - 'a');
rev_deg += reversePosition * (i + 1);
```

---

## Dry Run — `"abc"`

### `i = 0`

```text
ch = 'a'
reversePosition = 26 - 0 = 26
position = 1
contribution = 26 × 1 = 26
```

### `i = 1`

```text
ch = 'b'
reversePosition = 26 - 1 = 25
position = 2
contribution = 25 × 2 = 50
```

### `i = 2`

```text
ch = 'c'
reversePosition = 26 - 2 = 24
position = 3
contribution = 24 × 3 = 72
```

Final:

```text
26 + 50 + 72 = 148
```

---

## Why No Array or HashMap?

A possible approach would be to manually store:

```text
a → 26
b → 25
...
z → 1
```

But that is unnecessary.

The relationship between the normal and reversed positions is mathematical, so the value can be computed in `O(1)` for every character.

---

## Complexity

```text
Time  : O(n)
Space : O(1)
```

This is optimal because every character has to be inspected at least once.

---

## Java Pattern to Remember

```java
26 - (character - 'a')
```

This is a useful character-arithmetic pattern for converting a lowercase English letter into its reverse alphabet position.
