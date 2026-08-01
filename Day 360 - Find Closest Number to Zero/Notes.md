# Notes

## ✅ What I Learned

- Compare absolute values instead of the actual values when finding the closest number to zero.
- Keep the original number instead of storing its absolute value.
- Handle tie cases separately by selecting the larger number.

---

## ❌ My Mistake

I initially wrote:

```java
res = Math.abs(num);
```

This removed the sign of the number, causing incorrect answers on edge cases.

I also compared:

```java
num <= res
```

instead of comparing their absolute values.

---

## 🚀 Takeaway

Sometimes the smallest implementation detail—like preserving the sign of a number—makes the difference between a Wrong Answer and an Accepted solution.
