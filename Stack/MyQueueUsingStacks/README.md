# Implement Queue Using Stacks

---

## Problem
Implement a FIFO queue using only stack operations.

Supported operations:
- push(x)
- pop()
- peek()
- empty()

---

## Approach
Use two stacks:
- inStack for incoming elements
- outStack for removing elements in FIFO order

When outStack is empty, move all elements from inStack to outStack.

---

## Time Complexity
Push: O(1)  
Pop: Amortized O(1)  
Peek: Amortized O(1)  
Space: O(n)

---

## Language
Java