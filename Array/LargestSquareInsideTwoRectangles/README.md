# Find the Largest Area of Square Inside Two Rectangles

## Problem
Given multiple rectangles on a 2D plane, find the maximum area of a square
that can fit inside the intersection of at least two rectangles.

Return `0` if no such square exists.

---

## Important Note
Coordinates can be as large as `10^7`, so the square area can exceed
`Integer.MAX_VALUE`.

**The result must be stored and returned as `long`.**

---

## Approach
- Compare every pair of rectangles.
- Compute intersection width and height.
- If intersection exists:
  - Square side = min(width, height)
- Track the maximum side length.
- Return side × side.

---

## Time Complexity
- **O(n²)**

## Space Complexity
- **O(1)**

---

## Language
- Java