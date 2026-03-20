## Problem
Replace Consecutive Ones With Count (Linked List)

Given a linked list containing characters:
Replace every consecutive sequence of '1' with the count of that sequence.

---

## Approach

Traverse the linked list.

If current node contains '1':

1 Count consecutive ones.
2 Replace first '1' with count.
3 Skip remaining ones.
4 Connect to next non-one node.

---

## Time Complexity
O(n)
Single traversal.

---

## Space Complexity
O(1)
No extra memory.

---

## Language
Java