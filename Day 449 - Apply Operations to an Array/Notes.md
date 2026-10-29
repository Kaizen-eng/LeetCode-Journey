# 📝 Notes — LeetCode 2460: Apply Operations to an Array

🔗 **Problem:** https://leetcode.com/problems/apply-operations-to-an-array/

📅 **Quest Day:** 449

🎯 **Topics:** Array, Simulation, Two Pointers

## 1. Understanding the Problem

We must perform two phases:

1. Apply the adjacent-element operations sequentially.
2. Move all zeros to the end without changing the relative order of nonzero elements.

If `nums[i] == nums[i + 1]`:

- Double `nums[i]`.
- Set `nums[i + 1] = 0`.

Otherwise, do nothing.

**Critical detail:** The operations are performed from left to right on the changing array, not on a separate copy of the original values.

## 2. Example Walkthrough

```text
Input:
[1, 2, 2, 1, 1, 0]
```

### Phase 1 — Apply Operations

| Index | Comparison | Action | Array |
|---|---|---|---|
| 0 | 1 == 2? No | Skip | `[1,2,2,1,1,0]` |
| 1 | 2 == 2? Yes | Double 2, zero next | `[1,4,0,1,1,0]` |
| 2 | 0 == 1? No | Skip | `[1,4,0,1,1,0]` |
| 3 | 1 == 1? Yes | Double 1, zero next | `[1,4,0,2,0,0]` |
| 4 | 0 == 0? Yes | Double zero, zero next | `[1,4,0,2,0,0]` |

After the operation pass:

```text
[1, 4, 0, 2, 0, 0]
```

Notice that comparing two zeros is valid. The result remains unchanged because `0 * 2 = 0`.

### Phase 2 — Move Nonzero Elements

Use a pointer called `write` to track the next position for a nonzero element.

| Read value | Action | Write pointer |
|---|---|---|
| 1 | Write at index 0 | 1 |
| 4 | Write at index 1 | 2 |
| 0 | Skip | 2 |
| 2 | Write at index 2 | 3 |
| 0 | Skip | 3 |
| 0 | Skip | 3 |

Fill the remaining positions with zeros.

```text
Final Output:
[1, 4, 2, 0, 0, 0]
```

## 3. Pointer Logic

```java
int write = 0;

for (int num : nums) {
    if (num != 0) {
        nums[write++] = num;
    }
}

while (write < nums.length) {
    nums[write++] = 0;
}
```

### Why does this work?

- `write` marks the next position to fill.
- Every nonzero element is copied forward in its original order.
- Zeros are skipped during compaction.
- The remaining positions are filled with zeros.

Since `write` never moves ahead of the current read position, the unread elements are not overwritten.

## 4. Edge Cases

### Case 1 — Leading Zero

```text
Input:  [0, 1]
Output: [1, 0]
```

No merge occurs; the zero moves to the end.

### Case 2 — Consecutive Equal Values

```text
Input:  [2, 2, 2, 2]
Output: [4, 4, 0, 0]
```

The first pair becomes `[4, 0]`. The third and fourth elements also become `[4, 0]`. We do not run the merge operation a second time.

### Case 3 — All Zeros

```text
Input:  [0, 0, 0]
Output: [0, 0, 0]
```

Comparisons between zeros leave the array unchanged.

### Case 4 — No Equal Neighbors

```text
Input:  [1, 2, 3]
Output: [1, 2, 3]
```

No merging or zero movement is required.

## 5. Complexity Analysis

**Time Complexity: `O(n)`**

- First pass: `O(n)` to apply operations.
- Second pass: `O(n)` to compact nonzero elements.
- Final pass: at most `O(n)` to fill zeros.

A constant number of linear passes is still `O(n)`.

**Auxiliary Space: `O(1)`**

The algorithm uses only a few variables and modifies the original array. No additional array is allocated.

## 6. Common Mistakes to Avoid

- Processing all pairs simultaneously instead of sequentially.
- Forgetting that newly created zeros participate in later comparisons.
- Reprocessing the array to merge newly adjacent equal values.
- Moving zeros before completing all operations.
- Changing the relative order of nonzero elements.
- Forgetting to fill the remaining positions with zeros.

## 7. Final Takeaways

- Follow the problem's operation order exactly.
- Separate simulation from zero compaction.
- Use a write pointer for stable in-place compaction.
- Think carefully about zeros and consecutive equal values.
- Prefer simple, readable solutions with optimal asymptotic complexity.

**Day 449 takeaway:** A clean simulation and a simple write pointer can turn a tricky-looking array transformation into a linear-time solution.

⚔️ *Quest completed. Knowledge acquired. Next challenge awaits!* 🚀
