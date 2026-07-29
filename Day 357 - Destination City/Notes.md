# 📝 Notes

## 🔍 Observation

The destination city is the only city that **never appears as a source city**.

Instead of tracking every path, we only need to know which cities have appeared as **starting cities**.

---

## 💭 Why HashSet?

A `HashSet` is perfect here because it provides:

- Fast insertion → `O(1)` (average)
- Fast lookup → `O(1)` (average)
- Stores only unique values

This allows us to efficiently check whether a destination city has ever appeared as a source city.

---

## ⚠️ Common Mistake

Trying to solve the problem in a single traversal.

Example:

A → B

B → C

After reading the first path, `B` looks like the destination.

However, the next path reveals that `B` is actually a source city.

Therefore, we must first collect **all source cities** before checking the destinations.

---

## 🌱 What I Learned

- Identifying the right data structure often simplifies the entire problem.
- A `HashSet` is the go-to choice whenever fast existence checking is required.
- Sometimes, the simplest `O(n)` solution is already the optimal one.
