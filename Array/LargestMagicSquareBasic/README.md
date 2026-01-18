# Largest Magic Square (Basic Solution)

## Problem
A magic square is a square grid where:
- All row sums are equal
- All column sums are equal
- Both diagonals have the same sum

Given a grid, find the size of the largest magic square.

---

## Approach
- Try every possible square in the grid.
- For each square:
  - Calculate the first row sum as target.
  - Check all row sums.
  - Check all column sums.
  - Check both diagonals.
- If all sums match, it is a magic square.
- Track the largest valid size.

---

## Time Complexity
- **O(m · n · k³)** (brute force)

## Space Complexity
- **O(1)**

---

## Language
- Java