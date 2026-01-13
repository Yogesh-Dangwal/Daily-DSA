# Separate Squares I

## Problem
You are given several axis-aligned squares on a 2D plane.
Each square is defined by its bottom-left corner `(x, y)` and side length `l`.

Find the minimum y-coordinate of a horizontal line such that the total area
of squares above the line equals the total area below the line.

Overlapping areas are counted multiple times.

---

## Approach
- Compute the total area of all squares.
- Use Binary Search on the y-coordinate.
- For a candidate y:
  - Calculate how much area of each square lies below the line.
- Adjust the search space until the area below equals half of the total area.
- Run binary search for enough iterations to ensure precision.

---

## Time Complexity
- **O(n × log C)**  where `n` is number of squares and `C` is coordinate range.

## Space Complexity
- **O(1)**

---

## Language
- Java