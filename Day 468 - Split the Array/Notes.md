# ✦ Notes — LeetCode 3046: Split the Array

## 𝗞𝗲𝘆 𝗢𝗯𝘀𝗲𝗿𝘃𝗮𝘁𝗶𝗼𝗻

The original array has an even length, and we need two equally sized arrays containing distinct elements.

The most important condition:

**No element can appear more than twice.**

Why?

- Frequency = 1 → Can be placed in either array.
- Frequency = 2 → One occurrence must be placed in each array.
- Frequency > 2 → Impossible to distribute without duplicates.

## 𝗔𝗹𝗴𝗼𝗿𝗶𝘁𝗵𝗺

1. Initialize an empty HashMap.
2. Traverse every element in `nums`.
3. Increment its frequency in the HashMap.
4. If its frequency exceeds `2`, immediately return `false`.
5. If traversal completes, return `true`.

## 𝗗𝗿𝘆 𝗥𝘂𝗻

**Input:**
```text
nums = [5, 5, 7, 7, 8, 8, 9, 9]
```

| Element | Frequency | Result |
|---|---:|---|
| 5 | 1 | Continue |
| 5 | 2 | Continue |
| 7 | 1 | Continue |
| 7 | 2 | Continue |
| 8 | 1 | Continue |
| 8 | 2 | Continue |
| 9 | 1 | Continue |
| 9 | 2 | Continue |

No frequency exceeds `2`.

**Output:** `true`

One valid split:

```text
nums1 = [5, 7, 8, 9]
nums2 = [5, 7, 8, 9]
```

## 𝗘𝗱𝗴𝗲 𝗖𝗮𝘀𝗲𝘀

**Case 1: All elements are identical**

```text
nums = [1, 1, 1, 1]
Output = false
```

**Case 2: Every element is unique**

```text
nums = [1, 2, 3, 4]
Output = true
```

**Case 3: Every element appears exactly twice**

```text
nums = [1, 1, 2, 2]
Output = true
```

## 𝗖𝗼𝗺𝗽𝗹𝗲𝘅𝗶𝘁𝘆

- Time Complexity: O(n)
- Space Complexity: O(n)

## ✦ 𝗟𝗲𝗮𝗿𝗻𝗶𝗻𝗴

A problem that appears to require constructing multiple arrays can sometimes be solved by identifying a simple frequency constraint.

**Count first. Construct only when necessary.** ✦
