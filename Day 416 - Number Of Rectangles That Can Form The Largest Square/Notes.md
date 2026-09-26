# Notes — LeetCode 1725

## 🔑 Core Insight

A rectangle can form a square only up to the size of its **smaller dimension**.

For:

```text
[length, width]
```

the largest possible square has:

```text
side = min(length, width)
```

### Example

```text
[5, 3] → 3 × 3
[8, 6] → 6 × 6
[4, 4] → 4 × 4
[10, 2] → 2 × 2
```

So the problem becomes:

> Find the maximum value of `min(length, width)` and count how many rectangles produce that value.

---

## 🚀 One-Pass Strategy

Maintain two variables:

```java
int maxSquare = 0;
int count = 0;
```

For each rectangle:

```java
int squareSide = Math.min(rectangle[0], rectangle[1]);
```

### Case 1 — New largest square

```text
squareSide > maxSquare
```

We found a new maximum.

```java
maxSquare = squareSide;
count = 1;
```

### Case 2 — Same largest square

```text
squareSide == maxSquare
```

Another rectangle can form the same largest square.

```java
count++;
```

### Case 3 — Smaller square

```text
squareSide < maxSquare
```

Ignore it.

---

## 📌 Example Walkthrough

```text
rectangles = [
    [5, 3],
    [6, 4],
    [7, 2],
    [4, 4]
]
```

Largest square side for each:

```text
[5,3] → 3
[6,4] → 4
[7,2] → 2
[4,4] → 4
```

The largest square side is:

```text
4
```

Two rectangles can form a `4 × 4` square.

Therefore:

```text
Answer = 2
```

---

## ⚠️ Common Mistakes

### 1. Using the larger dimension

Wrong:

```java
Math.max(length, width)
```

The larger dimension does not determine the square size.

Correct:

```java
Math.min(length, width)
```

### 2. Comparing square areas

We don't need:

```text
side × side
```

Comparing side lengths is enough because a larger side always means a larger square.

### 3. Sorting the rectangles

Sorting is unnecessary.

A single pass is sufficient.

---

## 🧠 Pattern Learned

This problem is a simple example of **tracking a maximum and its frequency**.

General pattern:

```text
if current > maximum:
    maximum = current
    count = 1

else if current == maximum:
    count++
```

This pattern appears frequently in array and counting problems.
