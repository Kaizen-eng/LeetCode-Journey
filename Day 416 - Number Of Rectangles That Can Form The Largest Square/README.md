# LeetCode 1725 — Number Of Rectangles That Can Form The Largest Square

## 🧩 Problem

You are given an array of rectangles where `rectangles[i] = [length, width]`.

For each rectangle, determine the largest square that can be formed from it. Return the number of rectangles that can form a square with the **largest possible side length**.

### Example

```text
Input:
rectangles = [[5,8],[3,9],[5,12],[16,5]]

Output:
3
```

The largest square side that can be formed is `5`, and three rectangles can form a `5 × 5` square.

---

## 💡 Approach

For any rectangle:

```text
[length, width]
```

the largest square that can be formed has a side length equal to:

```text
min(length, width)
```

We scan all rectangles once while maintaining:

- `maxSquare` → the largest square side found so far.
- `count` → number of rectangles that can form that square.

If the current square is larger than `maxSquare`, update the maximum and reset the count.

If it is equal to `maxSquare`, increment the count.

---

## 🔄 Algorithm

1. Initialize `maxSquare = 0` and `count = 0`.
2. For every rectangle:
   - Calculate `squareSide = min(length, width)`.
   - If `squareSide > maxSquare`:
     - Update `maxSquare`.
     - Reset `count` to `1`.
   - Else if `squareSide == maxSquare`:
     - Increment `count`.
3. Return `count`.

---

## ⏱️ Complexity

- **Time:** `O(n)`
- **Space:** `O(1)`

Only one pass through the rectangles is required.

---

## 💻 Java Solution

See [`Solution.java`](Solution.java).

---

## 🧠 Key Takeaway

The smaller dimension of a rectangle determines the largest square it can form.

```text
Largest square side = min(length, width)
```

No cutting simulation or area calculation is necessary.
