## Problem
Given a matrix and coordinates (x,y) with size k.

Flip the k×k square vertically.

---

## Approach
- Use two pointers:
  top row
  bottom row

- Swap them.

- Move inward.

---

## Algorithm
1 Set top = x
2 Set bottom = x+k-1
3 While top < bottom:
   Swap rows
   top++
   bottom--

---

## Time Complexity
O(k²)

---

## Space Complexity
O(1)

---

## Language
Java