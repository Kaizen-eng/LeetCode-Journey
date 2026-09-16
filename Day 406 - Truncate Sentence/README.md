# ✦ LeetCode 1816 — Truncate Sentence

**Day 406** of my LeetCode journey 🚀

## ✦ Problem

Given a sentence `s` and an integer `k`, truncate the sentence so that it contains only the **first `k` words**.

The words are separated by a single space with no leading or trailing spaces.

### Example

```text
Input:
s = "Hello how are you Contestant"
k = 4

Output:
"Hello how are you"
```

✦ Approach 1 — String Concatenation
The sentence is first split into an array of words using " ".
Then, starting from the first word, concatenate the first k words into the result.
Complexity
✦ Time: O(n)
✦ Space: O(n)

✦ Approach 2 — StringBuilder
The same splitting approach is used, but instead of repeatedly concatenating immutable String objects, a StringBuilder is used.
This is more efficient when repeatedly building a string inside a loop.
Complexity
✦ Time: O(n)
✦ Space: O(n)

✦ Key Takeaway
Both approaches solve the problem efficiently.
However, when repeatedly constructing a string inside a loop, StringBuilder is generally a better choice because String objects are immutable in Java.

✦ Solutions
Solution 1: String Concatenation
Solution 2: StringBuilder
