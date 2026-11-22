# 𝗡𝗼𝘁𝗲𝘀 — 𝗟𝗲𝗲𝘁𝗖𝗼𝗱𝗲 𝟮𝟭𝟮𝟰

## ✦ 𝗞𝗲𝘆 𝗜𝗱𝗲𝗮

The string must never contain a `'b'` immediately followed by an `'a'`.

The forbidden transition is:

`b → a`

If this transition occurs, the string is invalid.

## ✦ 𝗘𝘅𝗮𝗺𝗽𝗹𝗲𝘀

| Input | Output | Reason |
|---|---|---|
| `"aaabbb"` | `true` | All a's appear before b's |
| `"abab"` | `false` | Contains the forbidden ba transition |
| `"bbb"` | `true` | No a appears after b |
| `"aaa"` | `true` | No b appears before a |

## ✦ 𝗗𝗿𝘆 𝗥𝘂𝗻

Input:

` s = "aababb" `

| Index | Current | Next | Condition |
|---:|:---:|:---:|:---:|
| 0 | a | a | False |
| 1 | a | b | False |
| 2 | b | a | True |

At index 2, the forbidden `"ba"` transition is detected.

Result: `false`

## ✦ 𝗝𝗮𝘃𝗮 𝘃𝘀 𝗣𝘆𝘁𝗵𝗼𝗻

| Operation | Java | Python |
|---|---|---|
| String length | `s.length()` | `len(s)` |
| Character access | `s.charAt(i)` | `s[i]` |
| Logical AND | `&&` | `and` |
| Boolean true | `true` | `True` |
| Boolean false | `false` | `False` |
| Loop | `for (int i = 0; ...)` | `for i in range(...)` |

## ✦ 𝗣𝘆𝘁𝗵𝗼𝗻 𝗙𝘂𝗻𝗱𝗮𝗺𝗲𝗻𝘁𝗮𝗹𝘀 𝗟𝗲𝗮𝗿𝗻𝗲𝗱

✦ `len(s)` — Returns the length of a string.

✦ `range(n)` — Generates indices from `0` to `n - 1`.

✦ `s[i]` — Accesses a character using its index.

✦ `and` — Checks whether both conditions are true.

✦ `return False` — Immediately exits the function with a false result.

✦ Indentation — Defines code blocks in Python.

## ✦ 𝗜𝗺𝗽𝗼𝗿𝘁𝗮𝗻𝘁 𝗢𝗯𝘀𝗲𝗿𝘃𝗮𝘁𝗶𝗼𝗻

We use:

`range(len(s) - 1)`

because every character is compared with its next character. The last character has no next character, so it must not be used as the current index.

## ✦ 𝗖𝗼𝗺𝗽𝗹𝗲𝘅𝗶𝘁𝘆

✦ Time: O(n)

✦ Auxiliary Space: O(1)

---

⭐ **Remember:** Detect the first forbidden transition and return immediately.
