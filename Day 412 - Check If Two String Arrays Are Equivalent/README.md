LeetCode 1662 — Check If Two String Arrays are Equivalent

🧩 Problem

Given two string arrays "word1" and "word2", determine whether they represent the same string when all their elements are concatenated in order.

Example

Input:
word1 = ["ab", "c"]
word2 = ["a", "bc"]

Output:
true

Both arrays form the string:

"abc"

Therefore, they are equivalent.

---

💡 Approach

The simplest approach is to concatenate all elements of both arrays and compare the resulting strings.

Java's "String.join()" can combine all elements without inserting a separator.

String str1 = String.join("", word1);
String str2 = String.join("", word2);

Then compare them using:

str1.equals(str2)

🔄 Alternative Approach

A two-pointer solution can compare characters directly across the two arrays without constructing the complete strings.

---

⚙️ Complexity

String Join Approach

- Time: "O(N + M)"
- Space: "O(N + M)"

Where "N" and "M" represent the total number of characters in "word1" and "word2".

Two-Pointer Approach

- Time: "O(N + M)"
- Space: "O(1)" auxiliary space.

---

🧠 Key Takeaway

The individual strings inside the arrays are only fragments.

The important thing is the final concatenated sequence of characters.

«Different partitions can still represent the same string.»

---

🏷️ Tags

"Array" "String" "Two Pointers" "LeetCode" "Java"
