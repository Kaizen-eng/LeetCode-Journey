# ✦ Notes — LeetCode 1773

## Rule-key mapping
- `type` → index `0`
- `color` → index `1`
- `name` → index `2`

Each item is represented as `[type, color, name]`.

## Algorithm
1. Find the index associated with `ruleKey`.
2. Initialize `count = 0`.
3. For each item, compare `item[index]` with `ruleValue`.
4. Increment `count` for every match.
5. Return `count`.

## Complexity
- **Time:** `O(n)` — every item is checked once.
- **Auxiliary space:** `O(1)` — only a fixed number of variables are used.

## Common mistakes
- Using the wrong attribute index.
- Comparing the whole item instead of `item[index]`.
- Using `==` to compare Java strings; use `.equals()` instead.
- Forgetting that the required result is a count, not the matching items themselves.

## Recall
Why is the time complexity linear? Because the algorithm visits each item once, doing constant work per item.
