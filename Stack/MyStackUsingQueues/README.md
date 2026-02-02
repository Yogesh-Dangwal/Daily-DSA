# Implement Stack Using Queues

---

## Problem
Implement a stack (LIFO) using only queue operations.

Supported operations:
- push(x)
- pop()
- top()
- empty()

---

## Approach
We use one queue. After each push, we rotate previous elements so the newest element comes to the front.

---

## Time Complexity
Push: O(n)  
Pop: O(1)  
Top: O(1)  
Empty: O(1)

---

## Language
Java