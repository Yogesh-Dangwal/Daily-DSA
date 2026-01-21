# Linked List Cycle

## Problem
Given the head of a linked list, determine if the list contains a cycle.

A cycle exists if a node can be visited again by continuously following
the `next` pointer.

---

## Approach (Floyd’s Cycle Detection)
- Use two pointers:
  - `slow` moves one step at a time
  - `fast` moves two steps at a time
- If there is a cycle, the two pointers will eventually meet.
- If `fast` reaches null, there is no cycle.

---

## Time Complexity
- **O(n)**

## Space Complexity
- **O(1)** (constant extra space)

---

## Language
- Java