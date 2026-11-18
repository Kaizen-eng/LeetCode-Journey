# ✦ 𝗡𝗼𝘁𝗲𝘀 — 2908. Minimum Sum of Mountain Triplets I

## ✦ 𝗞𝗲𝘆 𝗢𝗯𝘀𝗲𝗿𝘃𝗮𝘁𝗶𝗼𝗻𝘀

✦ The middle element `nums[j]` must be strictly greater than both selected outer elements.

✦ The three indices do not need to be consecutive.

✦ Every possible combination of three indices must be considered.

✦ Maintain the smallest valid triplet sum throughout the traversal.

## ✦ 𝗟𝗼𝗴𝗶𝗰

1. Initialize `min_sum` with positive infinity.
2. Use three nested loops to select indices `i`, `j`, and `k`.
3. Verify the mountain condition.
4. Calculate the triplet sum.
5. Update the minimum sum.
6. Return `-1` if no valid mountain exists.

## ✦ 𝗜𝗺𝗽𝗼𝗿𝘁𝗮𝗻𝘁 𝗟𝗲𝗮𝗿𝗻𝗶𝗻𝗴

✦ Java: `Integer.MAX_VALUE`

✦ Python: `float('inf')`

✦ Java: `Math.min(a, b)`

✦ Python: `min(a, b)`

✦ Number of possible triplets: `n × (n - 1) × (n - 2) / 6`

## ✦ 𝗖𝗼𝗺𝗽𝗹𝗲𝘅𝗶𝘁𝘆

- Time: `O(n³)`
- Auxiliary Space: `O(1)`

✦ **Takeaway:** Always read index constraints carefully before deciding whether elements must be adjacent.
