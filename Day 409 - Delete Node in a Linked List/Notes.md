# Notes

## Core Idea

In a normal singly linked list deletion, we usually need the **previous node** so that we can change its `next` pointer.

For example:

```text
Previous → Current → Next
```

Normally:

```text
Previous.next = Current.next
```

But in this problem, the previous node is not provided.

### Trick

Use the next node to replace the current node:

```java
node.val = node.next.val;
node.next = node.next.next;
```

This transforms:

```text
4 → 5 → 1 → 9
    ↑
   node
```

into:

```text
4 → 1 → 9
```

## Important Observation

The node itself is not literally removed from memory.

Instead, its value is replaced with the next node's value, and the next node is disconnected.

From the perspective of the linked list, the required node has effectively been deleted.

## Why No Traversal?

Unlike problems such as **LeetCode 203**, we are already given the node that needs to be deleted.

Therefore, there is:

- No need for `head`
- No need for a `while` loop
- No need to search for the target
- No need to maintain a previous pointer

## Complexity

**Time:** O(1)

**Space:** O(1)

## Pattern to Remember

> **Given the node but not its previous node → copy the next node's value and bypass the next node.**
