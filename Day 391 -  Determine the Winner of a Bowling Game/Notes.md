# ✦ Notes — LeetCode 2660

## ✦ Key Idea

For every turn `i`, check:

- `player[i - 1] == 10`
- OR
- `player[i - 2] == 10`

If either condition is true:

    current score = current score × 2

## ✦ Important Detail

The word **"either"** is important.

If both previous turns are strikes:

    [10, 10, 5]

The `5` is counted as:

    5 × 2 = 10

NOT:

    5 × 2 × 2 = 20

So both conditions must be combined using `||`.

## ✦ Logic

```java
if ((i > 0 && player[i - 1] == 10) ||
    (i > 1 && player[i - 2] == 10)) {

    current *= 2;
}
