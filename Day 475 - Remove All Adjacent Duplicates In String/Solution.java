# Solutions.java — Day 475

**Problem:** 1047. Remove All Adjacent Duplicates In String

**Approach:** Stack

```java
class Solution {

    public String removeDuplicates(String s) {

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
    }
}
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
