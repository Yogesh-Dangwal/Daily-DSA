# Linked List Cycle II

## Problem
Given the head of a linked list, return the node where the cycle begins.
If there is no cycle, return `null`.

The linked list must not be modified.

---

## Approach (Floyd’s Cycle Detection)
1. Use two pointers:
   - `slow` moves one step
   - `fast` moves two steps
2. If they meet, a cycle exists.
3. Move `slow` back to head.
4. Move both pointers one step at a time.
5. The node where they meet again is the start of the cycle.

---

## Time Complexity
- **O(n)**

## Space Complexity
- **O(1)** (constant space)

---

## Language
- Java