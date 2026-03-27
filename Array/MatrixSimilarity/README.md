## Problem
Check if matrix remains same after performing k cyclic shifts.

Even rows shift left.
Odd rows shift right.

---

## Key Observation
After n shifts row becomes original.

So effective shifts = k % n.

---

## Approach
1 Reduce k using modulo.
2 Check cyclic index mapping.
3 Compare with original matrix.

---

## Time Complexity
O(m × n)

---

## Space Complexity
O(1)

---

## Example
Input

[[1,2,1,2],
 [5,5,5,5],
 [6,3,6,3]]

k = 2

Output

true

---

## Language
Java