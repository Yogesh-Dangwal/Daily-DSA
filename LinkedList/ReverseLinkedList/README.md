## Problem
Given the head of a singly linked list, reverse the list and return the new head.

---

## Approach
Use three pointers:

prev → previous node  
curr → current node  
next → store next node  

Steps:

1 Store next node
2 Reverse current pointer
3 Move prev forward
4 Move curr forward

---

## Visualization
Original:
1 → 2 → 3 → 4 → 5

Step by step:
1 ← 2 ← 3 ← 4 ← 5

Result:
5 → 4 → 3 → 2 → 1

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