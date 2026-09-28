# Notes — Kth Missing Positive Number

## 🔑 Core Idea

The array contains positive integers in strictly increasing order.

Instead of generating the missing numbers one by one, count how many
numbers are missing inside each gap.

---

## 1️⃣ Missing Numbers Before the First Element

If:

arr[0] = 4

Then:

`1, 2, 3`

are missing.

So we first check all positive integers before `arr[0]`.

---

## 2️⃣ Missing Numbers Between Elements

For two consecutive elements:

`arr[i]` and `arr[i + 1]`

the number of missing integers is:

`arr[i + 1] - arr[i] - 1`

### Example

`[2,3,4,7]`

Between `4` and `7`:

`7 - 4 - 1 = 2`

Missing numbers:

`5, 6`

---

## 3️⃣ Finding the kth Missing Number Inside a Gap

Suppose:

`count`

is the number of missing values found before the current gap.

If:

`count + missing >= k`

then the kth missing number lies inside this gap.

Its value is:

`arr[i] + (k - count)`

---

## 4️⃣ Missing Numbers After the Last Element

The missing sequence continues forever after the last array element.

For example:

`[1,2,3,4]`

Missing:

`5,6,7,8,...`

If the kth missing number has not been found inside the array,
we calculate it directly:

`arr[arr.length - 1] + (k - count)`

---

## 🐛 Important Bug I Fixed

My first attempt treated an entire gap as only one missing number.

For example:

`4 → 7`

was counted as:

`1 missing`

But actually:

`5,6`

are missing.

Therefore:

`missing = arr[i + 1] - arr[i] - 1`

is required.

I also initially forgot that missing numbers can continue after
the last element of the array.

---

## 🚀 Complexity

### Current Approach

Time: `O(n)`

Space: `O(1)`

### Follow-Up

Because the array is sorted, this problem can also be solved using
binary search in `O(log n)` time.

The key observation for binary search is:

`missing before arr[i] = arr[i] - (i + 1)`

This gives the number of missing positive integers before each
array element.

---

## 🎯 Takeaway

When working with a sorted array:

✦ Look at the gaps between consecutive elements.

✦ Calculate the size of each gap instead of iterating through it.

✦ Remember that the answer may exist before the first element
  or after the last element.

✦ Sorted data often provides an opportunity for binary search.
