## Problem
Sort the given array without using built-in sort.

Time complexity must be O(n log n).

---

## Approach
Use Merge Sort.

Steps:

1 Divide array into halves.
2 Sort recursively.
3 Merge sorted parts.

---

## Algorithm
Divide:
[5,2,3,1]

Split:

[5,2] [3,1]

Split again:

[5] [2]
[3] [1]

Merge:

[2,5]
[1,3]

Final merge:

[1,2,3,5]

---

## Time Complexity
O(n log n)
Because we divide log n times
and merge takes O(n).

---

## Space Complexity
O(n)
Temporary arrays used.

---

## Language
Java