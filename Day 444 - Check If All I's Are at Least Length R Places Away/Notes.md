
# ✦ Notes — Day 444

## ✧ Intuition
We need to ensure that no two consecutive 1's are closer than the allowed distance.

Instead of counting zeros manually, we can use their indices to calculate the distance.

## ✧ Algorithm
1. Initialize `previousIndex = -1`.
2. Traverse the array using an index `i`.
3. If `nums[i] == 1`:
   - If `previousIndex != -1`, calculate `i - previousIndex - 1`.
   - If this value is less than `k`, return `false`.
   - Update `previousIndex = i`.
4. Return `true` if no violation is found.

## ✧ Why subtract 1?
The distance between the indices includes both 1's.

For example, indices 2 and 6 have:
- Index difference = 6 - 2 = 4
- Number of elements between them = 4 - 1 = 3

Therefore, the number of places between two 1's is:

`currentIndex - previousIndex - 1`

## ✧ Complexity Analysis
- **Time Complexity:** O(n), because we traverse the array once.
- **Space Complexity:** O(1), because we use only a fixed number of variables.

## ✧ Key Learning
Index-based distance calculations are often simpler and more efficient than explicitly counting the elements between positions.

✦ One scan. One previous index. Constant space. ✦
