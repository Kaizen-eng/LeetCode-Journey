# Notes – Day 453

## 2451. Odd String Difference

### 1. Core Concept

Instead of comparing the actual strings, compare the differences between their adjacent characters.

**Formula:**

`difference = nextCharacter - currentCharacter`

### 2. Example

For the string `"abc"`:

| Character Pair | Calculation | Difference |
|---|---|---|
| a → b | 98 - 97 | 1 |
| b → c | 99 - 98 | 1 |

Difference pattern: `[1, 1]`

For the string `"adc"`:

| Character Pair | Calculation | Difference |
|---|---|---|
| a → d | 100 - 97 | 3 |
| d → c | 99 - 100 | -1 |

Difference pattern: `[3, -1]`

### 3. Important Java Concepts

- `charAt()` – Access a character at a particular index.
- Character arithmetic – Calculate the difference between character values.
- Arrays – Store and compare difference patterns.

### 4. Important Python Concepts

- `ord()` – Convert a character into its Unicode code point.
- `range()` – Iterate through adjacent character positions.
- `tuple()` – Create an immutable representation of a difference pattern.
- `dict` – Group strings based on their difference patterns.

### 5. Key Observation

Strings with identical adjacent character difference patterns belong to the same group.

The odd string is the one whose pattern occurs only once.

### 6. Complexity

For `n` strings of length `m`:

- **Time Complexity:** O(n × m)
- **Space Complexity:** O(n × m) when storing all difference patterns.

### 7. Takeaway

Understanding character arithmetic and pattern recognition helps solve string manipulation problems efficiently.
