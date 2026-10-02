# ✦ 𝐍𝐨𝐭𝐞𝐬 — 𝐋𝐞𝐞𝐭𝐂𝐨𝐝𝐞 𝟐𝟑𝟒𝟏

## ✦ 𝐈𝐝𝐞𝐚
We only need to know whether the current value has an unmatched occurrence waiting for a partner. A `HashSet<Integer>` is enough; we do not need to store full frequencies.

## ✦ 𝐀𝐥𝐠𝐨𝐫𝐢𝐭𝐡𝐦
1. Create an empty `HashSet<Integer>` called `unmatched` and set `pairs = 0`.
2. For every `num` in `nums`:
   ✦ If `unmatched` contains `num`, remove it and increment `pairs`.
   ✦ Otherwise, add `num` to `unmatched`.
3. Return `{pairs, unmatched.size()}`.

## ✦ 𝐃𝐫𝐲 𝐑𝐮𝐧
Input: `[1, 1, 2, 2, 2, 3]`

| Value | Set after processing | Pairs |
|---:|---|---:|
| 1 | `{1}` | 0 |
| 1 | `{}` | 1 |
| 2 | `{2}` | 1 |
| 2 | `{}` | 2 |
| 2 | `{2}` | 2 |
| 3 | `{2, 3}` | 2 |

Result: `[2, 2]`.

## ✦ 𝐅𝐫𝐞𝐪𝐮𝐞𝐧𝐜𝐲 𝐂𝐨𝐧𝐧𝐞𝐜𝐭𝐢𝐨𝐧
For a value with frequency `f`:
✦ Pairs contributed = `f / 2` using integer division.
✦ Leftovers contributed = `f % 2`.

The HashMap approach can count frequencies and apply these formulas. The HashSet approach reaches the same result while forming pairs during the traversal.

## ✦ 𝐂𝐨𝐦𝐩𝐥𝐞𝐱𝐢𝐭𝐲
✦ Time: `O(n)` average.
✦ Space: `O(n)` worst case.

## ✦ 𝐉𝐚𝐯𝐚 𝐍𝐨𝐭𝐞
`HashSet.contains`, `add`, and `remove` take expected constant time on average. The overall expected time complexity is therefore `O(n)`.
