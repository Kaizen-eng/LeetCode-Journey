# Solutions.java — Day 475

**Problem:** 1047. Remove All Adjacent Duplicates In String

**Approach:** Stack

## 🐍 Python Solution

```python
class Solution:

    def removeDuplicates(self, s: str) -> str:

        stack = []

        for ch in s:

            if stack and stack[-1] == ch:

                stack.pop()

            else:

                stack.append(ch)

        return "".join(stack)
```

**Time Complexity:** O(n)

**Space Complexity:** O(n)

---

## 🧪 Test Cases

| Input | Expected Output |
|---|---|
| `"abbaca"` | `"ca"` |
| `"azxxzy"` | `"ay"` |
| `"aabbcc"` | `""` |
| `"abcd"` | `"abcd"` |
| `"aaaa"` | `""` |
| `"a"` | `"a"` |

**Status:** Accepted approach for both Java and Python implementations.

**Day:** 475
