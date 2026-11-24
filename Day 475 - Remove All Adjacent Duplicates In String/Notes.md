# 📝 LeetCode 1047 — Learning Notes

## 🌟 Problem
**Remove All Adjacent Duplicates In String**

Given a string, repeatedly remove adjacent identical characters until no more duplicate pairs exist.

## 🧠 Core Intuition

Use a **Stack** to maintain the characters that haven't been removed.

The top of the stack represents the most recently added character.

When the current character matches the top:

- Remove the top character.
- Do not insert the current character.

Otherwise, insert the current character.

This automatically handles cascading duplicate removals!

## ⚙️ Stack Operations

| Operation | Meaning | Java | Python |
|---|---|---|---|
| Push | Insert | `append(ch)` | `append(ch)` |
| Peek | Access top | `charAt(n-1)` | `stack[-1]` |
| Pop | Remove top | `deleteCharAt(n-1)` | `pop()` |

## 🔍 Complete Dry Run

Input: `azxxzy`

| Step | Character | Action | Stack |
|---|---|---|---|
| 1 | a | Push | a |
| 2 | z | Push | az |
| 3 | x | Push | azx |
| 4 | x | Pop | az |
| 5 | z | Pop | a |
| 6 | y | Push | ay |

Output: `ay`

### 💡 Important Observation

After removing `xx`, the two `z` characters become adjacent.

The stack automatically detects and removes them without another traversal.

This is the biggest advantage of this approach!

## ☕ Java Implementation Details

We use `StringBuilder` as our stack.

```java
StringBuilder stack = new StringBuilder();

for (char ch : s.toCharArray()) {
    int n = stack.length();

    if (n > 0 && stack.charAt(n - 1) == ch) {
        stack.deleteCharAt(n - 1);
    } else {
        stack.append(ch);
    }
}

return stack.toString();
```

### Why `length() - 1`?

Java uses zero-based indexing.

For a string of length 3, valid indices are 0, 1 and 2.

Therefore:

`Last Index = Length - 1`

## 🐍 Python Implementation Details

```python
stack = []

for ch in s:
    if stack and stack[-1] == ch:
        stack.pop()
    else:
        stack.append(ch)

return "".join(stack)
```

### Python Concepts

✦ `stack[-1]` accesses the last element.

✦ `stack.pop()` removes the last element.

✦ `stack.append(ch)` inserts an element.

✦ `"".join(stack)` combines the characters into a string.

## 📊 Complexity

- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

Each character is pushed at most once and popped at most once.

## ⚠️ Common Mistakes

1
