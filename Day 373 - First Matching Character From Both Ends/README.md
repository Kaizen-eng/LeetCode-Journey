# 3884. First Matching Character From Both Ends

## 🧩 Problem

You are given a string `s` consisting of lowercase English letters.

Return the smallest index `i` such that:

```text
s[i] == s[n - i - 1]
where n is the length of the string.
If no such index exists, return -1.
💡 Approach
Two Pointers
The condition compares characters from both ends of the string.
So we can use two pointers:
L = 0
R = n - 1
At every step:
Compare s[L] and s[R].
If they are equal, return L.
Otherwise, move both pointers inward.
Continue while L <= R.
If no matching pair is found, return -1.
Because L moves from the smallest index toward the center, the first match is guaranteed to be the smallest valid index.

##🔍 Example
Input
s = "abcacbd"
Comparisons:
s[0] = 'a'    s[6] = 'd'    ❌

s[1] = 'b'    s[5] = 'b'    ✅
Therefore:
Output = 1

##🧠 Visual Representation
a b c a c b d
↑           ↑
L           R

a != d

  ↑       ↑
  L       R

b == b
Return:
1

##⚙️ Complexity
Complexity	Value
Time	O(n)
Space	O(1)


##🏆 Submission
Status: Accepted ✅
Test Cases: 673 / 673
Runtime: 1 ms

##🔥 Key Takeaway
When a problem compares elements from opposite ends, immediately consider:
Two Pointers

The solution directly mirrors the symmetry of the problem.
Problem symmetry → Two Pointers → O(n) → O(1)
