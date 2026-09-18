### `Notes.md`

# Notes - LeetCode 203

# Core Idea

To remove a node from a singly linked list, we need access to the node before it.

Instead of checking:

```java
temp.val == val
```

we check:
temp.next.val == val
This allows us to remove temp.next directly.
Handling the Head Node
The head has no previous node, so matching head nodes must be handled separately.

```java
while (head != null && head.val == val) {
    head = head.next;
}
```

This continues moving head forward until:
✦ The list becomes empty.
✦ The head contains a value different from val.
Main Traversal:

```java
while (temp != null && temp.next != null) {

    if (temp.next.val == val) {
        temp.next = temp.next.next;
    } else {
        temp = temp.next;
    }
}
```

If temp.next contains the target value, we skip that node.
Before:

temp → 6 → 3

After:

temp ─────→ 3

Why Don't We Move temp After Deletion?
Consider consecutive target nodes:

1 → 6 → 6 → 6 → 2
    ↑
   temp

After deleting the first 6:
1 → 6 → 6 → 2
    ↑
   temp

There may still be another target node immediately after temp.
Therefore, we keep temp at the same position and check temp.next again.

### Edge Cases:

Empty List
[]
Since head == null, the method returns null.

Head Contains the Target
6 → 1 → 2

The head is moved forward:
1 → 2

All Nodes Contain the Target
7 → 7 → 7 → 7

Repeatedly moving head eventually results in:
null

Consecutive Target Nodes
1 → 6 → 6 → 6 → 2

Keeping temp at the same node after deletion allows all consecutive target nodes to be removed.
Important Linked List Operation

### The key deletion operation is:
temp.next = temp.next.next;

It changes:
temp → target → next
into:
temp → next
The target node is therefore removed from the linked list.

### Complexity
Time Complexity
O(n)
Space Complexity
O(1)

The solution uses only a temporary pointer and modifies the original linked list in-place.

### Key Lesson:

When working with singly linked lists, always think about:
✦ Which node am I currently pointing to?
✦ Which node am I trying to remove?
✦ Do I need access to the previous node?
For deletion, the previous-node approach is often the cleanest solution.
