# Notes — LeetCode 2089

## 🧠 Core Idea

The problem asks for the indices where `target` would appear **after sorting**.

Initially, sorting seems necessary.

But we only care about the target's final positions.

---

## 🔹 Solution 1 — Sorting

```java
Arrays.sort(nums);
```
Once sorted, all occurrences of the target become consecutive.

Example:

nums = [1, 2, 5, 2, 3]

After sorting:

[1, 2, 2, 3, 5]

For target = 2:

[1, 2, 2, 3, 5]
↑ ↑
1 2

Answer:

[1, 2]

Complexity
Time: O(n log n)

🔹 Solution 2 — Avoid Sorting
Ask:

Where would the first target appear after sorting?

The answer is:

The number of elements smaller than the target.

For:

[1, 2, 5, 2, 3]

and:

target = 2

Only 1 is smaller than 2.

Therefore:

first target index = 1

There are two occurrences of 2, so the indices are:

1, 2

### 🔢 Two Counters
We maintain:

int smaller = 0;
int equal = 0;

For every number:

✦ If num < target, increment smaller.

✦ If num == target, increment equal.

Then:

for (int i = 0; i < equal; i++) {
    list.add(smaller + i);
}

This generates the consecutive target indices.

### ⚡ Why It Works
After sorting:

[ smaller elements ][ target elements ][ larger elements ]
                    ↑
                    |
             first target index
The number of smaller elements determines where the target block starts.

The number of equal elements determines how long that block is.

Therefore:

Start = number of elements < target
End   = Start + number of elements == target - 1
### 📊 Complexity Comparison
Solution 1
O(n log n)

because sorting is required.

Solution 2
O(n)

because the array is traversed only once to gather the required counts.

The result itself requires O(k) space, where k is the number of target occurrences.

### 🔥 Takeaway
The important optimization was not improving the sorting operation.

It was recognizing that sorting itself was unnecessary.

Always ask:

"Do I really need to perform this operation, or do I only need the information that operation would give me?"

### Solution1.java
✦ Complexity
Time: O(n log n)
Space: O(log n) auxiliary space

### Solution2.java
✦ Complexity
Time: O(n)
Space: O(k) for the returned list
