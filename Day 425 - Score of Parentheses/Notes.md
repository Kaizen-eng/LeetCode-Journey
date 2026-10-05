# ✦ Notes — LeetCode 856: Score of Parentheses

## 𝗣𝗿𝗼𝗯𝗹𝗲𝗺 𝗜𝗱𝗲𝗮

The important thing is to understand how parentheses affect the score.

### 𝗦𝗰𝗼𝗿𝗶𝗻𝗴 𝗥𝘂𝗹𝗲𝘀

✦ `()` → `1`

✦ `AB` → `A + B`

✦ `(A)` → `2 × A`

---

## 𝗦𝘁𝗮𝗰𝗸 𝗜𝗱𝗲𝗮

Each element in the stack represents the score accumulated at one nesting level.

Start with:

`[0]`

The initial `0` acts as the base level.

### When `(` appears

Push `0`.

This creates a fresh level for the parentheses we just entered.

### When `)` appears

Pop the current level.

Let the popped value be `inner`.

✦ If `inner == 0`, we found `()` → score `1`.

✦ Otherwise, we found `(A)` → score `2 × inner`.

Then add this score to the parent level.

---

## 𝗞𝗲𝘆 𝗟𝗶𝗻𝗲

```java
int score = (inner == 0) ? 1 : 2 * inner;
