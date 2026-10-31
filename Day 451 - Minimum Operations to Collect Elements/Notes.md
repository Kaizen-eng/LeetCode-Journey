# ✦ Day 451 — Notes: Minimum Operations to Collect Elements

## ✦ Core Idea

The problem asks us to collect all numbers from `1` to `k` by removing elements from the end of the array.

**Important observation:**

Removing elements from the end is equivalent to traversing the array backwards.

We only need to track distinct elements within the required range.

## ✦ Algorithm

1. Create a Boolean array of size `k + 1`.
2. Initialize `count = 0` and `operations = 0`.
3. Traverse `nums` from the last index to the first.
4. Increment `operations` for each visited element.
5. If the current number is between `1` and `k` and hasn't been collected:
   - Mark it as collected.
   - Increment `count`.
6. If `count == k`, return `operations`.

## ✦ Dry Run

**Input:**
```text
nums = [3,1,5,4,2]
k = 2
```

| Step | Element | Collected Elements | Count | Operations |
|---:|---:|---|---:|---:|
| 1 | 2 | {2} | 1 | 1 |
| 2 | 4 | {2} | 1 | 2 |
| 3 | 5 | {2} | 1 | 3 |
| 4 | 1 | {1, 2} | 2 | 4 |

Since `count == k`, we return `4`.

## ✦ Important Observations

- Reverse traversal directly simulates the required operations.
- Elements greater than `k` can be ignored.
- Duplicate elements must not increase the collection count.
- We can stop immediately after collecting all required elements.
- No actual array modification is necessary.

## ✦ Java Notes

- `boolean[]` provides constant-time element lookup.
- `List<Integer>` allows accessing elements using `get(i)`.
- The counter tracks only distinct required elements.

## ✦ Python Notes

- A Boolean list can be used for the same tracking mechanism.
- `range(len(nums) - 1, -1, -1)` traverses backwards.
- The same early termination condition applies.

## ✦ Complexity

- **Time:** O(n + k)
- **Space:** O(k)

## ✦ Revision Reminder

**Think backwards when the operation always removes elements from the end!**

A simple observation can eliminate unnecessary simulation.

---

*Day 451 — Another problem solved, another concept learned.* ✦
