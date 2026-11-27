# 📝 Day 478 — Learning Notes
## LeetCode 925: Long Pressed Name

### 🌱 1. Core Concept

A long-pressed character can appear multiple consecutive times while typing.

The important conditions are:

- Character order must remain unchanged.
- Every original character must appear.
- Extra occurrences must be consecutive repetitions.
- No unexpected characters are allowed.

### 🔍 2. Approach 1 — Two Pointers

**Pointers:**
- `i` → Original string (`name`)
- `j` → Typed string (`typed`)

**Conditions:**

1. If `name[i] == typed[j]`:
   - Increment both pointers.

2. Otherwise, if `j > 0` and `typed[j] == typed[j-1]`:
   - This is a valid long press.
   - Increment only `j`.

3. Otherwise:
   - Return `False`.

**Final validation:**

```python
return i == len(name)
```

This ensures every original character has been matched.

### 🔍 3. Approach 2 — Character Group Comparison

Instead of comparing individual characters, compare consecutive groups.

**Steps:**

1. Select the current character from `name`.
2. Count its consecutive occurrences in `name`.
3. Count its consecutive occurrences in `typed`.
4. Verify that the typed group has at least as many occurrences.
5. Continue with the next group.

**Important validation:**

The typed group must start with the same character as the original group.

**Final validation:**

```python
return i == len(name) and j == len(typed)
```

This ensures neither string contains unmatched remaining characters.

### 🧮 4. Dry Run — Two Pointers

**Input:**

```text
name  = "alex"
typed = "aaleex"
```

| Step | name[i] | typed[j] | Operation |
|---|---|---|---|
| 1 | a | a | Move both |
| 2 | l | a | Long press, move j |
| 3 | l | l | Move both |
| 4 | e | e | Move both |
| 5 | x | e | Long press, move j |
| 6 | x | x | Move both |

**Output:** `True`

### 🧮 5. Dry Run — Group Comparison

**Input:**

```text
name  = "aabbc"
typed = "aaabbbcc"
```

| Group | Name Count | Typed Count | Result |
|---|---:|---:|---|
| a | 2 | 3 | Valid |
| b | 2 | 3 | Valid |
| c | 1 | 2 | Valid |

**Output:** `True`

### ⚠️ 6. Important Edge Cases

| Case | Input | Expected |
|---|---|---|
| Exact match | `"alex", "alex"` | True |
| Long press | `"alex", "aaleex"` | True |
| Missing repetition | `"saeed", "ssaaedd"` | False |
| Different order | `"ab", "ba"` | False |
| Extra character | `"alex", "alexz"` | False |
| Empty strings | `"", ""` | True |

### 📊 7. Complexity Analysis

| Approach | Time | Auxiliary Space |
|---|---|---|
| Two Pointers | O(n + m) | O(1) |
| Group Comparison | O(n + m) | O(1) |

Both approaches traverse the strings linearly and use only a constant number of variables.

### 💎 8. Key Learnings

✦ String matching requires preserving character order.

✦ A long-pressed character must repeat the immediately preceding typed character.

✦ Frequency comparison alone cannot guarantee a valid sequence.

✦ Consecutive character groups provide a useful alternative perspective.

✦ Two Pointers and Group Comparison both achieve optimal complexity.

### 🏆 Day 478 Conclusion

Successfully explored two optimal approaches to Long Pressed Name using Java and Python.

**Lesson of the day:** Sometimes the best optimization is not introducing another data structure, but understanding the structure of the input itself.

Keep learning. Keep building. Keep moving forward! 🚀
