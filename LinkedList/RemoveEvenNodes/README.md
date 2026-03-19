## Problem
Remove Even Nodes from Linked List.

---

## Approach
We handle this in two steps:

 Step 1 — Remove even nodes from the beginning

If the head contains even values, move the head forward until an odd value is found.

 Step 2 — Traverse remaining list

For each node:
- If next node is even → skip it.
- Otherwise move forward.

---

## Time Complexity
O(n)
Single traversal.

---

## Space Complexity
O(1)
No extra memory used.

---

## Language
Java