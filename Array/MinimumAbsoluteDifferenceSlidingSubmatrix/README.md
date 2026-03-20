## Problem
Given a matrix grid and integer k.

For every k × k submatrix find:
Minimum absolute difference between any two distinct values.

Return result matrix.

---

## Important Note
If all values are same:
Answer = 0

Duplicates must be ignored because only distinct values are considered.

---

## Approach
For each k×k window:

- Extract values
- Sort values
- Compare adjacent distinct values
- Store minimum difference

---

## Time Complexity
O((m−k+1)(n−k+1) × k² log(k²))
Since max grid = 30 × 30 → efficient.

---

## Space Complexity
O(k²)

---

## Language
Java