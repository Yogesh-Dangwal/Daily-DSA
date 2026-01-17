# Find the Largest Area of Square Inside Two Rectangles

## Problem
You are given multiple rectangles on a 2D plane.
Each rectangle is defined by its bottom-left and top-right coordinates.

Find the maximum area of a square that can fit inside the intersection
of at least two rectangles.
If no such square exists, return 0.

---

## Approach
- Check every pair of rectangles.
- Compute their intersection region.
- If the intersection exists:
  - Width = min(right edges) - max(left edges)
  - Height = min(top edges) - max(bottom edges)
- The largest square that can fit has side = min(width, height).
- Track the maximum side length across all pairs.
- Return side × side.

---

## Time Complexity
- **O(n²)**

## Space Complexity
- **O(1)**

---

## Language
- Java