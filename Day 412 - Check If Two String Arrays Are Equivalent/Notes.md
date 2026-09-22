Notes — LeetCode 1662

🔹 Core Idea

Two string arrays can have completely different partitions while still representing the same final string.

Example:

["ab", "c"]
["a", "bc"]

Both represent:

"abc"

So the easiest solution is to concatenate both arrays and compare the resulting strings.

---

🔹 Java Method

String.join("", word1);

The first argument is the delimiter.

Using an empty string means that the elements are joined directly without any separator.

Example:

String.join("", ["ab", "c"])
→ "abc"

---

🔹 String Comparison

In Java, strings should be compared using:

str1.equals(str2)

rather than:

str1 == str2

"equals()" compares the actual contents of the strings.

---

🔹 Alternative: Two Pointers

Instead of constructing complete strings, we can maintain:

- An index for the current string in "word1"
- A character index inside that string
- Equivalent pointers for "word2"

Compare characters one at a time and move to the next string whenever the current string is exhausted.

This reduces auxiliary space to "O(1)".

---

🧠 Lesson

The representation may differ, but the underlying sequence can still be identical.

This problem is a nice introduction to thinking about data independently from how it is partitioned.
