## Problem
Exclusive Time of Functions

You are given logs describing when functions start and end execution.
Return the exclusive execution time of each function.

---

## Approach
Use a stack to simulate the function call stack.

- Push function when "start" occurs
- Pop function when "end" occurs
- Track time differences using a previous timestamp variable

---

## Time Complexity
O(m)

## Space Complexity
O(n)

---

## Language
Java