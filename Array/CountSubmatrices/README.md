# Count Submatrices with Top-Left Element and Sum ≤ k

---

## Problem
Given a matrix, count submatrices:
- Must include (0,0)
- Sum ≤ k

---

## Key Observation
All valid submatrices must be:

(0,0) → (i,j)

So problem reduces to counting prefix sums ≤ k.

---

## Approach
1 Build prefix sum matrix.
2 For each cell check:

sum ≤ k

3 Count valid cases.

---

## Time Complexity
O(m × n)

---

## Space Complexity
O(m × n)

---

## Language
Java