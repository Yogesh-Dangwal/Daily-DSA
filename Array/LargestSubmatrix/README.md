# Largest Submatrix With Rearrangements

## Problem
Given a binary matrix, you may rearrange columns.

Find the largest submatrix containing only 1s.

---

## Key Idea
We can rearrange columns, so only heights matter, not positions.

Convert rows into histograms of consecutive 1s.

Sort heights to maximize width.

---

## Approach
1 Build height matrix
2 Sort each row
3 Compute area:
height x width
4 Track maximum.

---

## Time Complexity
O(m × n log n)

---

## Space Complexity
O(n)

---

## Language
Java