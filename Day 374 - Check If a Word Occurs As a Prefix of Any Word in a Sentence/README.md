# Day 374 - Check If a Word Occurs As a Prefix of Any Word in a Sentence

## Problem

Given a sentence and a search word, return the **1-indexed position of the first word in the sentence that starts with `searchWord`**.

If no word starts with `searchWord`, return `-1`.

## Approach

I used **String Splitting + Linear Search**.

- Split the sentence into individual words using `split(" ")`.
- Traverse each word one by one.
- Use `startsWith(searchWord)` to check whether the current word begins with the given prefix.
- Return `i + 1` because the required answer is **1-indexed**.
- If no matching word is found, return `-1`.

I also explored a **Two-Pointer approach** to understand why this problem can be categorized under Two Pointers. In that approach, one pointer tracks the beginning of a word while another pointer compares characters with `searchWord`.

For the final solution, however, the string-based approach is simpler and more readable.

## Complexity

### Time Complexity
**O(n)** — where `n` is the length of the sentence.

### Space Complexity
**O(n)** — because the sentence is split into an array of words.

## Key Learning

This problem reminded me that choosing the right abstraction can make a solution much simpler.

Instead of manually traversing characters and managing word boundaries, splitting the sentence into words allows us to work directly with the actual structure of the problem.

**LeetCode may categorize a problem under a particular technique, but understanding alternative approaches helps us recognize when a simpler solution is available.** 🚀

---

**Day 374 completed!** 💻🔥
