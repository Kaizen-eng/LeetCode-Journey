# ✦ LeetCode 2164 — Sort Even and Odd Indices Independently

## ✦ Problem

Given a 0-indexed integer array `nums`, rearrange its values according to these rules:

✦ Values at **even indices** must be sorted in **non-decreasing order**.

✦ Values at **odd indices** must be sorted in **non-increasing order**.

✦ The values must remain within their respective index parity.

---

## ✦ Example

### Input

```text
nums = [4,1,2,3]
```

### Process

✦ Even indices → `0, 2`

```text
[4, 2] → [2, 4]
```

✦ Odd indices → `1, 3`

```text
[1, 3] → [3, 1]
```

### Output

```text
[2,3,4,1]
```

---

## ✦ Approach

✦ Create two separate lists:

```text
even → values from even indices
odd  → values from odd indices
```

✦ Sort `even` in **ascending order**.

✦ Sort `odd` in **descending order**.

✦ Traverse the original array again and place the sorted values back according to the index parity.

---

## ✦ Complexity

✦ **Time Complexity:** `O(n log n)`

✦ **Space Complexity:** `O(n)`

---

## ✦ Key Insight

The important part is that **index parity is preserved**.

Even-indexed positions can only receive values from the `even` list, while odd-indexed positions can only receive values from the `odd` list.

---

## ✦ Language

**Java**
