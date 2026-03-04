## Problem
Given an m x n binary matrix, return the number of special positions.

A position (i, j) is special if:
- mat[i][j] == 1
- All other elements in row i are 0
- All other elements in column j are 0

---

## Approach
1. Count number of 1s in each row.
2. Count number of 1s in each column.
3. Traverse matrix again.
4. If mat[i][j] == 1 and row[i] == 1 and col[j] == 1 → special position.

---

## Time Complexity
O(m × n)

---

## Space Complexity
O(m + n)

---

## Language
Java