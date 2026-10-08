# ✦ Notes — LeetCode 1710

## ✦ Pattern

**Greedy + Sorting**

## ✦ Key Observation

The truck has a limited number of box slots.

Every box consumes exactly **1 slot**, so we should always prioritize the box with the greatest:

`unitsPerBox`

Therefore:

```text
Sort by unitsPerBox ↓
        ↓
Take the most valuable boxes first
        ↓
Fill the truck
```

## ✦ Important Java Trick

For a 2D array:

```java
Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
```

`box[0]` → number of boxes  
`box[1]` → units per box

## ✦ Loading Logic

```java
int boxes = Math.min(truckSize, box[0]);

units += boxes * box[1];
truckSize -= boxes;
```

Why `Math.min()`?

Because we cannot take more boxes than:

- the current box type contains, or
- the truck can still carry.

## ✦ Example

```text
boxTypes = [[5,10], [2,20], [4,5]]
truckSize = 6
```

After sorting:

```text
[[2,20], [5,10], [4,5]]
```

Load:

```text
2 × 20 = 40
4 × 10 = 40
```

Total:

```text
80 units
```

Truck capacity becomes `0`, so we stop.

## ✦ No Binary Search

Binary search is unnecessary here.

We are not searching for a target value. We only need to determine the **best order** in which to load the boxes.

**Sort → Greedily Load → Finish.** ✦

## ✦ Takeaway

> **When every item has the same cost in terms of capacity, prioritize the item with the highest value.**

That is the greedy heart of this problem.
