# Day 375 - Count Common Words With One Occurrence

## Problem Understanding

We need to find how many words occur:

- Exactly once in `words1`
- Exactly once in `words2`

Both conditions must be satisfied.

---

## Main Idea

Use two `HashMap`s.

```text
words1 → map1
words2 → map2
Each map stores:
word → frequency
Step 1 - Build map1
for (String word : words1) {
    map1.put(word, map1.getOrDefault(word, 0) + 1);
}
For every word:
If it already exists → increase its frequency.
If it doesn't exist → start from 0, then add 1.
Example:
"is" → 1
"is" → 2
"is" → 3
Step 2 - Build map2
Do the exact same frequency counting for words2.
for (String word : words2) {
    map2.put(word, map2.getOrDefault(word, 0) + 1);
}
Step 3 - Compare Frequencies
We only need to examine the unique keys from map1.
for (String word : map1.keySet()) {
    if (map1.get(word) == 1 &&
        map2.getOrDefault(word, 0) == 1) {
        count++;
    }
}
Why keySet()?
The HashMap already contains each unique word once.
So there is no reason to scan duplicate words from words1 again.
We need the actual word because it acts as the key for checking its frequency in map2.
Why getOrDefault()?
Suppose:
map1 = {leetcode=1, amazing=1}
map2 = {leetcode=1}
When checking "amazing":
map2.get("amazing")
returns null.
Instead:
map2.getOrDefault("amazing", 0)
returns:
0
Therefore, the condition remains clean:
map1.get(word) == 1 &&
map2.getOrDefault(word, 0) == 1
Example Walkthrough
words1 = ["leetcode", "is", "amazing", "as", "is"]

map1:
leetcode → 1
is       → 2
amazing  → 1
as       → 1
words2 = ["amazing", "leetcode", "is"]

map2:
amazing  → 1
leetcode → 1
is       → 1
Now compare:
leetcode → 1 & 1 → ✅
amazing  → 1 & 1 → ✅
is       → 2 & 1 → ❌
as       → 1 & 0 → ❌
Therefore:
count = 2
Complexity
Let:
n = length of words1
m = length of words2
Time
O(n + m)
We build both frequency maps and then iterate through the unique keys of map1.
Space
O(n + m)
The two HashMaps store the frequencies of the words.
Key Takeaway
This problem is a classic Frequency Map pattern.
Whenever a problem asks:
"How many times does this element occur?"

Think:
HashMap
   ↓
element → frequency
Simple data structure. Clean condition. Efficient solution.
