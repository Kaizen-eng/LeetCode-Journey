# Notes — Smallest Missing Multiple of K

## 1. Main Idea

The problem asks for the smallest positive multiple of `k` that is not present in the array.

Instead of repeatedly searching the array, I used a `HashSet`.

```java
HashSet<Integer> set = new HashSet<>();
```

Then every number from the array is added to the set.

```java
for (int num : nums) {
    set.add(num);
}
```

Now we can efficiently check whether a number exists using:

```java
set.contains(value)
```

---

## 2. Understanding `.contains()`

```java
set.contains(k)
```

means:

> Does the set contain `k`?

It returns either:

```text
true  → element exists
false → element does not exist
```

Therefore:

```java
if (!set.contains(prd))
```

means:

> If `prd` does NOT exist in the set...

The `!` operator reverses the boolean value.

```text
set.contains(prd) → false
!false             → true
```

---

## 3. Generating Multiples

The positive multiples of `k` are:

```text
k
2k
3k
4k
...
```

So we can generate them using:

```java
int prd = k * i;
```

Starting with:

```java
i = 1
```

is important because:

```java
k * 0 = 0
```

and the problem asks for a **positive** multiple.

---

## 4. Important Edge Case — Loop Boundary

My first attempt used:

```java
for (int i = 1; i < nums.length; i++)
```

This caused an edge-case failure.

For:

```text
nums = [3]
k = 1
```

`nums.length` is `1`.

Therefore:

```text
i = 1
1 < 1 → false
```

The loop never executes.

This taught me to carefully check loop boundaries, especially when the array contains only one element.

---

## 5. Why `n + 1` Multiples Are Enough

Suppose the array contains `n` elements.

We check:

```text
1st multiple
2nd multiple
3rd multiple
...
(n + 1)th multiple
```

There are `n + 1` different multiples but only `n` array elements.

Therefore, the array cannot contain all `n + 1` multiples.

At least one must be missing.

So this loop is sufficient:

```java
for (int i = 1; i <= nums.length + 1; i++)
```

---

## 6. Why Sorting Is Unnecessary

Initially, I considered sorting the array:

```java
Arrays.sort(nums);
```

But sorting is unnecessary because the `HashSet` is only being used for existence checks.

We don't care about the order of the elements.

Therefore:

```java
HashSet.contains()
```

is enough.

Removing sorting also keeps the solution simpler and avoids unnecessary `O(n log n)` work.

---

## 7. Final Pattern

The general pattern is:

```java
HashSet → Store values

Loop → Generate candidates

contains() → Check existence

!contains() → Found missing value

return → Stop immediately
```

This is a useful pattern for many problems where the main question is:

> "Does this value already exist?"
