# 3517. Smallest Palindromic Rearrangement I

## 🧩 Problem
Given a palindromic string `s`, return the lexicographically smallest palindromic permutation.

## 💡 Approach
- Count the frequency of each character.
- Build the left half using `frequency / 2` in lexicographical order.
- Store the odd-frequency character (if any) as the middle.
- Mirror the left half to complete the palindrome.

## ⏱️ Complexity
- Time: O(n)
- Space: O(26)

## 📚 Concepts Learned
- Frequency Array
- Greedy Construction
- Palindrome Properties
- Lexicographical Ordering
