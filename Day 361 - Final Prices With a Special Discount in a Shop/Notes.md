# Notes - Day 361

## What I Learned
- Always store the computed result at the correct index.
- Be careful while introducing extra variables like `idx` when the current loop index `i` already represents the correct position.
- Tiny indexing mistakes can produce completely different outputs even when the algorithm is correct.

## Mistake I Made
Initially, I stored the answer using:

```java
ans[idx++] = prices[i] - prices[j];
```

This shifted the results whenever an element had no discount.

The correct approach is:

```java
ans[i] = prices[i] - prices[j];
```

## Key Takeaway
Before assuming the algorithm is wrong, verify whether every computed value is being stored in the correct location.

Debugging is often about tracking where data goes, not just how it's calculated.
