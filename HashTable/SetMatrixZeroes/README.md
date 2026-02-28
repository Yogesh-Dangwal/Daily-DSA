## Problem
Given an m x n matrix, if an element is 0, set its entire row and column to 0.  
You must do it in-place.

---

## Important Note
You must not use extra O(m × n) space.  
The optimal solution requires constant extra space.

---

## Approach
- Use first row and first column as markers.
- Track whether first row or first column originally had zero.
- Mark rows and columns.
- Zero rows and columns based on markers.
- Finally handle first row and column.

---

## Time Complexity
- **O(m × n)**

## Space Complexity
- **O(1)**

---

## Language
- Java