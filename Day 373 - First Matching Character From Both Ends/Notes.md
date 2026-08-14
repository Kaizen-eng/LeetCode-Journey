---

# 📝 Notes.md

## Notes — LeetCode 3884

## 🎯 Pattern

**Two Pointers**

This problem is based on comparing mirrored positions:


s[i] == s[n - i - 1]
That naturally suggests using pointers from both ends.

## 🧠 Intuition
Imagine two pointers moving toward each other.
L →                 ← R

a b c a c b d
At every step:
s[L] == s[R]
If they match:
return L
Otherwise:
L++
R--
The important detail is that L starts at 0.
Therefore, the first successful match is always the smallest possible index.

## 🔎 Dry Run
Given:
s = "abcacbd"
Step 1
L = 0
R = 6

s[0] = 'a'
s[6] = 'd'

'a' != 'd'
Move inward:
L++
R--
Step 2
L = 1
R = 5

s[1] = 'b'
s[5] = 'b'

'b' == 'b'
Therefore:
Answer = 1

## 🧩 Why L <= R?
We use:
while (L <= R)
because for an odd-length string, both pointers can meet at the middle.
Example:
s = "abc"

    L
    R
    ↓
a b c
At the middle:
s[1] == s[1]
So the middle position can also be a valid answer.

## ⚡ Complexity
Time
O(n)
Each pointer moves toward the center, so the string is traversed only once.
Space
O(1)
Only two integer pointers are used.

## 🔥 Pattern Recognition
Whenever you encounter:
arr[i] vs arr[n - i - 1]

think about:
1. Opposite ends.
2. Mirrored positions.
3. Left/right comparison.
4. Shrinking ranges.
5. Two Pointers.

## 💭 Takeaway
The cleanest solutions often come from recognizing the structure already hidden inside the problem.
Here:
Opposite ends
      ↓
Two Pointers
      ↓
O(n) Time
      ↓
O(1) Space
Another pattern learned. 🧱🔥
