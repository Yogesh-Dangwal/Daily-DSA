## Problem
Minimum Swaps to Arrange a Binary Grid

You are given an n x n binary grid.
In one step, you can swap two adjacent rows.

A grid is valid if all cells above the main diagonal are zeros.

Return the minimum swaps needed to make the grid valid, or -1 if impossible.

---

## Important Note
Row i must contain at least (n - 1 - i) trailing zeros.

---

## Approach
- Count trailing zeros for each row.
- For each row position:
  - Find a row below that satisfies required zeros.
  - Bubble it up using adjacent swaps.
- If no suitable row found → return -1.

---

## Time Complexity
- O(n²)

## Space Complexity
- O(n)

---

## Language
- Java