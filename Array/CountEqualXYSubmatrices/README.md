# Count Submatrices With Equal Frequency of X and Y

---

## Problem
Given a grid containing:
X, Y and .

Count submatrices that:
- Include (0,0)
- Have equal X and Y
- Have at least one X

---

## Approach
Since submatrix must contain (0,0),
only prefix rectangles exist.

Use prefix sums to count:
- Number of X
- Number of Y

For each cell:
If X == Y and X > 0 → valid.

---

## Time Complexity
O(m × n)

---

## Space Complexity
O(m × n)

---

## Language
Java