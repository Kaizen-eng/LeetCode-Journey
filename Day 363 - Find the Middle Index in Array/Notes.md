# Notes

## Initial Thoughts
- First idea was using nested loops.
- Time Complexity would be O(n²).
- Then explored whether a two-pointer approach could work.
- Learned that this problem doesn't satisfy the properties required for two pointers.

## Final Approach
1. Find the total sum.
2. Initialize `leftSum = 0`.
3. For every index:
   - Calculate
     ```java
     rightSum = totalSum - leftSum - nums[i];
     ```
   - Compare left and right sums.
   - Update `leftSum += nums[i]`.

## Dry Run

Declarations

```java
int totalSum = 0;
int leftSum = 0;
int rightSum;
```

Loop 1
- Calculate totalSum.

Loop 2
- Calculate rightSum.
- Compare leftSum and rightSum.
- Update leftSum.

## Key Takeaway
The equation

```
Total Sum = Left Sum + Current Element + Right Sum
```

can be rearranged as

```
Right Sum = Total Sum - Left Sum - Current Element
```

This converts the brute-force solution into an O(n) solution.
