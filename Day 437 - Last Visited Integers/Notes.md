
# Notes — LeetCode 2899
## Last Visited Integers

✦ **Core Concept**
Track previously visited integers and retrieve them
according to consecutive `-1` commands.

✦ **Important Variables**
- `seen`: visited integers, newest first.
- `ans`: result list.
- `consecutivePrev`: consecutive `-1` counter.

✦ **Important Logic**
1. If `num == -1`, increment the counter.
2. If the counter is within `seen.size()`, retrieve
   `seen.get(consecutivePrev - 1)`.
3. Otherwise, append `-1`.
4. If `num > 0`, insert it at index 0 and reset
   the counter to 0.

✦ **Example**
Input: `[1, 2, -1, -1, -1]`

- `seen = [1]`
- `seen = [2, 1]`
- First `-1` → `2`
- Second `-1` → `1`
- Third `-1` → `-1`

Output: `[2, 1, -1]`

✦ **Complexity**
- Time: O(n²) worst case
- Auxiliary Space: O(n)

✦ **Pattern**
Recent-first ordering + consecutive counter.
