# ✦ Day 472 — Problem Notes

## ✦ Core Concept

**HashSet + Membership Checking**

A HashSet stores only unique elements. We use it to check whether an element exists in another array.

## ✦ Step-by-Step Logic

**Step 1:** Create a HashSet.

**Step 2:** Insert every element of `arr2` into the set.

**Step 3:** Traverse `arr1`.

**Step 4:** Check each element using:

```java
set.contains(num)
```

**Step 5:** If the element exists, increment the counter.

**Step 6:** Return the counter.

**Step 7:** Repeat with the arrays swapped.

## ✦ Dry Run

**Input:**
```java
nums1 = [4, 3, 2, 3]
nums2 = [3, 2, 5, 4]
```

**First Direction:**

HashSet = `{3, 2, 5, 4}`

| Element | Exists? | Count |
|---|---|---:|
| 4 | Yes | 1 |
| 3 | Yes | 2 |
| 2 | Yes | 3 |
| 3 | Yes | 4 |

First count = **4**

**Second Direction:**

HashSet = `{4, 3, 2}`

| Element | Exists? | Count |
|---|---|---:|
| 3 | Yes | 1 |
| 2 | Yes | 2 |
| 5 | No | 2 |
| 4 | Yes | 3 |

Second count = **3**

**Final Output:**
```java
[4, 3]
```

## ✦ Important Observations

✦ HashSet removes duplicate values when storing elements.

✦ `contains()` checks existence without removing the element.

✦ Duplicate values in the original array are counted separately.

✦ We must perform the checking in both directions.

✦ We don't need HashMap or `getOrDefault()` because frequency storage is unnecessary.

## ✦ Complexity Analysis

Let `n` = length of `nums1` and `m` = length of `nums2`.

✦ **Time:** O(n + m), assuming average O(1) HashSet operations.

✦ **Auxiliary Space:** O(max(n, m)).

## ✦ What I Learned

✦ Using HashSet for efficient element-existence checking.

✦ Understanding the difference between unique storage and duplicate counting.

✦ Breaking a problem into a reusable helper method.

✦ Performing bidirectional comparisons between arrays.

---

**✦ Consistency beats intensity. Day 472 — Done!**
