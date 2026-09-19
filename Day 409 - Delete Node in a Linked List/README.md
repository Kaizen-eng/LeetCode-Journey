# 237. Delete Node in a Linked List

## Problem

You are given a node in a singly linked list and are asked to delete that node.

The node to be deleted is **not the tail node**, and only the given node is accessible.

### Example

```text
Input:
4 → 5 → 1 → 9
    ↑
   node

Output:
4 → 1 → 9
```

## Approach

Since the previous node is not available, we cannot directly modify its `next` pointer.

Instead:

1. Copy the value of the next node into the current node.
2. Make the current node point to the node after the next node.

### Example

```text
Before:

4 → 5 → 1 → 9
    ↑
   node


After copying the next value:

4 → 1 → 1 → 9
    ↑
   node


After bypassing the next node:

4 → 1 → 9
```

## Algorithm

```text
1. Copy node.next.val into node.val.
2. Set node.next to node.next.next.
```

## Complexity

- **Time Complexity:** O(1)
- **Space Complexity:** O(1)

## Key Insight

When the previous node is unavailable, we can effectively delete the current node by **copying the next node's data and bypassing the next node**.

## Java

See [`Solutions.java`](Solutions.java).
