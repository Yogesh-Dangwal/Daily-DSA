# Insertion Sort List

## Problem
Given the head of a singly linked list, sort the list using the insertion sort
algorithm and return the sorted list.

---

## Approach
- Use a dummy node to build the sorted list.
- Traverse the original list one node at a time.
- For each node, find its correct position in the sorted list.
- Insert the node at the correct position.
- Continue until all nodes are processed.

---

## Time Complexity
- **O(n²)** in the worst case (when the list is in reverse order).

## Space Complexity
- **O(1)** (sorting is done in-place).

---

## Language
- Java