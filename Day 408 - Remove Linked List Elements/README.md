# LeetCode 203 - Remove Linked List Elements

## Problem

Given the head of a linked list and an integer `val`, remove all the nodes of the linked list that have `Node.val == val` and return the new head.

### Example

**Input:**

```text
head = [1,2,6,3,4,5,6]
val = 6
Output:
[1,2,3,4,5]
```
## Approach 1 - Head Handling + In-Place Traversal
The linked list is modified directly without using any additional data structure.
Steps

✦ First, remove all matching nodes from the beginning of the list.
✦ Create a temporary pointer temp starting from the updated head.
✦ Traverse the list while temp and temp.next are not null.
✦ Check whether temp.next.val matches the target value.
✦ If it matches, skip the node using:
temp.next = temp.next.next;
✦ Otherwise, move temp to the next node.
✦ Return the updated head.

### Why Check temp.next?
Since the node being removed is temp.next, checking it allows us to directly reconnect temp to the node after it.

```text
Before:

temp → 6 → 3

After:

temp ─────→ 3
```

This approach also handles consecutive target nodes correctly.

### Complexity Analysis
Time Complexity
O(n)
Each node is processed at most once.
Space Complexity
O(1)

The linked list is modified in-place and no additional data structure is used.

### Key Takeaway:
When deleting a node from a singly linked list, keeping a pointer to the node before the target node makes deletion simple.
temp.next = temp.next.next;
This effectively removes temp.next from the linked list.
