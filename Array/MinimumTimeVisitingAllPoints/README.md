# Minimum Time Visiting All Points

## Problem
You are given a list of points on a 2D plane.
Starting from the first point, you must visit all points in order.

In one second, you can:
- Move vertically by 1 unit
- Move horizontally by 1 unit
- Move diagonally by 1 unit horizontally and vertically

Return the minimum time required to visit all points.

---

## Approach
- For each consecutive pair of points:
  - Calculate the horizontal distance `dx`
  - Calculate the vertical distance `dy`
- The minimum time to move between two points is `max(dx, dy)`
  because diagonal moves can cover both directions at once.
- Sum this value for all consecutive point pairs.

---

## Time Complexity
- **O(n)**

## Space Complexity
- **O(1)**

---

## Language
- Java