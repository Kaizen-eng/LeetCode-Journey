# Notes

## 🔑 Key Idea

Insertion ≠ Replacement.

When inserting into an array:

1. Shift all existing elements from the insertion index one step to the right.
2. Perform shifting from **right to left**.
3. Insert the new element into the freed position.

---

## Manual Shifting

```java
for (int j = i; j > index[i]; j--) {
    target[j] = target[j - 1];
}

target[index[i]] = nums[i];
```

---

## Common Mistakes

❌ Replacing an existing value instead of inserting.

❌ Shifting from left to right, which overwrites values.

❌ Forgetting that only the first `i` positions contain valid elements during iteration.

---

## Takeaway

Think of shifting like making space for a new student in a classroom. Everyone from the insertion point onward moves one seat to the right before the new student sits down.
