# Notes – Day 355

## Key Observation

The answer only depends on the two largest numbers in the array.

Instead of sorting the entire array, we can find them in a single traversal.

---

## Algorithm

1. Initialize:
   - max1 = Integer.MIN_VALUE
   - max2 = Integer.MIN_VALUE

2. Traverse the array:
   - If current number > max1
     - max2 = max1
     - max1 = current number
   - Else if current number > max2
     - max2 = current number

3. Return:

(max1 - 1) * (max2 - 1)

---

## Dry Run

nums = [3,4,5,2]

Initially

max1 = -∞
max2 = -∞

3

max1 = 3
max2 = -∞

4

max1 = 4
max2 = 3

5

max1 = 5
max2 = 4

2

Ignored because it is smaller than max2.

Answer

(5 - 1) × (4 - 1)
= 4 × 3
= 12

---

## Mistake I Made

Initially, I wrote:

else {
    max2 = num;
}

This replaced the second largest element with every smaller element.

Correct approach:

else if (num > max2)

Only update max2 when the current element is actually larger than the existing second largest.

---

## Learning

Keeping track of the largest and second largest values in one pass is a common interview pattern.

This technique is useful in many array problems where only the top two values matter.
