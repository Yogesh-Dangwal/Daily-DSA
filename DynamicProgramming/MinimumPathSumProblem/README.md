# Minimum Path Sum

## Problem
Given an `m × n` grid filled with non-negative numbers, find a path from the
top-left corner to the bottom-right corner that minimizes the sum of all numbers
along the path.

You can only move either **right** or **down**.

---

## Approach
- Use Dynamic Programming.
- Each cell stores the minimum path sum to reach that cell.
- The value of each cell is updated by adding the minimum of:
  - the value from the top cell
  - the value from the left cell
- The answer is stored in the bottom-right cell.

---

## Time Complexity
- **O(m × n)**

## Space Complexity
- **O(1)** (grid is modified in place)

---

## Language
- Java