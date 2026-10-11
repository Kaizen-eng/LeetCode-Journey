# ✦ 𝐍𝐨𝐭𝐞𝐬 — Day 431

## ✦ 𝐊𝐞𝐲 𝐈𝐝𝐞𝐚

An element is special when its **1-based position** divides the array length `n`.

Since Java's loop index starts at `0`, the actual position for `nums[i]` is `i + 1`.

**Condition:** `n % (i + 1) == 0`

When the condition is true, add `nums[i] * nums[i]` to the running sum.

## ✦ 𝐃𝐫𝐲 𝐑𝐮𝐧

Input: `nums = [1, 2, 3, 4]`, so `n = 4`.

| `i` (0-based) | Position (`i + 1`) | `4 % (i + 1)` | Special? | Contribution |
|---:|---:|---:|:---:|---:|
| 0 | 1 | 0 | Yes | `1² = 1` |
| 1 | 2 | 0 | Yes | `2² = 4` |
| 2 | 3 | 1 | No | `0` |
| 3 | 4 | 0 | Yes | `4² = 16` |

**Total:** `1 + 4 + 16 = 21`

## ✦ 𝐖𝐡𝐚𝐭 𝐖𝐞 𝐅𝐢𝐱𝐞𝐝

✦ The first attempt used `n % i`, but `i` is `0` on the first loop iteration.

✦ Modulo by zero throws `ArithmeticException: / by zero`.

✦ Using `n % (i + 1)` both avoids division by zero and matches the problem's 1-based indexing.

## ✦ 𝐂𝐨𝐦𝐩𝐥𝐞𝐱𝐢𝐭𝐲

✦ **Time:** `O(n)`  
✦ **Extra space:** `O(1)`

## ✦ 𝐌𝐢𝐧𝐢 𝐑𝐞𝐦𝐢𝐧𝐝𝐞𝐫

Always check whether the problem uses 0-based or 1-based indexing before writing an index-dependent condition.
