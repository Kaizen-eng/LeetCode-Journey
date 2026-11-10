# ✦ 𝗗𝗮𝘆 𝟰𝟲𝟭 – 𝗡𝗼𝘁𝗲𝘀

## 🔹 𝗣𝗿𝗼𝗯𝗹𝗲𝗺
**2114. Maximum Number of Words Found in Sentences**

Find the maximum number of words present in any individual sentence from the given string array.

## ✦ 𝗞𝗲𝘆 𝗢𝗯𝘀𝗲𝗿𝘃𝗮𝘁𝗶𝗼𝗻

✧ Every word is separated by exactly one space.

✧ Splitting a sentence using `" "` produces individual words.

✧ The number of words is equal to the length of the resulting array/list.

✧ We only need to maintain the maximum word count.

## ✦ 𝗔𝗹𝗴𝗼𝗿𝗶𝘁𝗵𝗺

1. Initialize `max_words = 0`.
2. Iterate through every sentence.
3. Split the current sentence using `" "`.
4. Calculate the number of words.
5. Update the maximum using `max()`.
6. Return the final maximum.

## ✦ 𝗘𝘅𝗮𝗺𝗽𝗹𝗲

**Input:**

`["alice and bob love leetcode", "i think so too", "this is great thanks very much"]`

**Word Counts:**

✧ Sentence 1 → 5 words.

✧ Sentence 2 → 4 words.

✧ Sentence 3 → 6 words.

**Output:** `6`

## ✦ 𝗝𝗮𝘃𝗮 𝘃𝘀 𝗣𝘆𝘁𝗵𝗼𝗻

| Operation | Java ☕ | Python 🐍 |
|---|---|---|
| Split | `split(" ")` | `split(" ")` |
| Length | `arr.length` | `len(arr)` |
| Maximum | `Math.max(a, b)` | `max(a, b)` |

## ✦ 𝗖𝗼𝗺𝗽𝗹𝗲𝘅𝗶𝘁𝘆

✧ Time: O(N), where N is the total number of characters.

✧ Space: O(M), where M is the maximum sentence length.

## ✦ 𝗧𝗮𝗸𝗲𝗮𝘄𝗮𝘆

✧ Java and Python provide convenient string-splitting methods.

✧ Python's built-in `len()` and `max()` make the implementation concise.

✧ Choosing the right built-in methods helps write cleaner and more readable code.

---

🌟 **Consistency is the real algorithm. Keep executing!** 🚀
