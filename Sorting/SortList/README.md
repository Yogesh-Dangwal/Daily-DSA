# Sort List

## Problem
Given the head of a singly linked list, sort the list in ascending order.

The solution should run in **O(n log n)** time.

---

## Approach
- Use **Merge Sort** for linked lists.
- Find the middle of the list using slow and fast pointers.
- Recursively sort the left and right halves.
- Merge the two sorted linked lists.

Merge sort is ideal for linked lists because it does not require random access.

---

## Time Complexity
- **O(n log n)**

## Space Complexity
- **O(log n)** due to recursion stack.

---

## Language
- Java