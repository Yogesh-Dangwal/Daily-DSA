# Number of Ways to Paint N × 3 Grid

## Problem
You are given a grid of size `n × 3`.
Each cell must be painted using one of three colors: Red, Yellow, or Green.

Constraints:
- No two adjacent cells (horizontal or vertical) can have the same color.
- Return the total number of valid colorings.
- The result should be returned modulo `10^9 + 7`.

---

## Approach
For each row, there are only two valid pattern types:

1. **Same Pattern (ABA)**  
   - First and third cells have the same color.
   - Middle cell has a different color.

2. **Different Pattern (ABC)**  
   - All three cells have different colors.

For the first row:
- Same patterns = 6
- Different patterns = 6

For each next row:
- New same patterns depend on previous same and different patterns.
- New different patterns also depend on previous values.

We iterate row by row and update these two values.

---

## Time Complexity
- **O(n)**

## Space Complexity
- **O(1)**

---

## Language
- Java