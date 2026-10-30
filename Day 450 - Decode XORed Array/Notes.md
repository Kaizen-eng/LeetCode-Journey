# Notes – Day 450

## Problem: Decode XORed Array

### 1. XOR Properties

- XOR returns `1` when two bits are different.
- XOR returns `0` when two bits are the same.
- `a ^ a = 0`
- `a ^ 0 = a`
- `a ^ b ^ a = b`

### 2. Main Formula

Given:

`encoded[i] = arr[i] ^ arr[i + 1]`

Therefore:

`arr[i + 1] = arr[i] ^ encoded[i]`

### 3. Algorithm

1. Create an array of size `encoded.length + 1`.
2. Initialize the first element with `first`.
3. Traverse the encoded array.
4. Calculate each next element using XOR.
5. Return the decoded array.

### 4. Complexity

- Time Complexity: O(n)
- Space Complexity: O(n)

### 5. Key Takeaway

XOR is reversible. Knowing one operand and the XOR result is enough to recover the other operand.

**Lesson:** Sometimes a simple bitwise property can eliminate unnecessary complexity!
