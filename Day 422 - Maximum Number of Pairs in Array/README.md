# ✦ 𝐋𝐞𝐞𝐭𝐂𝐨𝐝𝐞 𝟐𝟑𝟒𝟏 — 𝐌𝐚𝐱𝐢𝐦𝐮𝐦 𝐍𝐮𝐦𝐛𝐞𝐫 𝐨𝐟 𝐏𝐚𝐢𝐫𝐬 𝐢𝐧 𝐀𝐫𝐫𝐚𝐲

## ✦ 𝐏𝐫𝐨𝐛𝐥𝐞𝐦 𝐒𝐮𝐦𝐦𝐚𝐫𝐲
Given an integer array `nums`, pair equal elements to form as many pairs as possible. Return an array `answer` where:

✦ `answer[0]` is the number of pairs formed.
✦ `answer[1]` is the number of elements left unpaired.

## ✦ 𝐀𝐩𝐩𝐫𝐨𝐚𝐜𝐡 — 𝐇𝐚𝐬𝐡𝐒𝐞𝐭
Maintain a set containing values that currently have one unmatched occurrence.

✦ If the current value is already in the set, a pair is formed: remove it and increment `pairs`.
✦ Otherwise, add it to the set as an unmatched value.
✦ At the end, `pairs` is the number of pairs and `unmatched.size()` is the number of leftovers.

## ✦ 𝐄𝐱𝐚𝐦𝐩𝐥𝐞
**Input:** `nums = [1, 3, 2, 1, 3, 2, 2]`

**Output:** `[3, 1]`

✦ `1` forms one pair.
✦ `3` forms one pair.
✦ Two of the three `2`s form one pair, leaving one `2` unpaired.

## ✦ 𝐂𝐨𝐦𝐩𝐥𝐞𝐱𝐢𝐭𝐲
✦ **Time:** `O(n)` average, where `n` is the array length.
✦ **Space:** `O(n)` worst case for the set.

## ✦ 𝐊𝐞𝐲 𝐋𝐞𝐚𝐫𝐧𝐢𝐧𝐠
A `HashSet` can model pairing directly: each value is either waiting for a partner or has just been paired. Removing a value after forming a pair lets a later occurrence start a new pair.
