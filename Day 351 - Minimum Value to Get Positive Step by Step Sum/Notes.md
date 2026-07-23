# Notes

## 🔍 Observation

The problem does **not** ask us to simulate every possible starting value.

Instead, it asks:

> What is the minimum starting value so that every running sum stays positive?

---

## 🧠 Intuition

Calculate the running (prefix) sum.

Example:

```text
nums = [-3, 2, -3, 4, 2]

Running Sum:
-3
-1
-4
0
2
```

The minimum prefix sum is:

```text
-4
```

To make this become at least `1`:

```text
Start Value + (-4) = 1

Start Value = 5
```

---

## ✅ Formula

```text
Answer = 1 - (Minimum Prefix Sum)
```

---

## 💭 Takeaway

- Prefix sums are useful whenever cumulative values matter.
- Tracking the minimum running sum is enough to determine the required initial value.
- This reduces the solution from repeated simulation to a single pass through the array.
