# Separate Squares II

## Problem
You are given multiple axis-aligned squares on a 2D plane.
Find the minimum y-coordinate of a horizontal line such that the
**union area** of squares above the line equals the union area below the line.

Overlapping regions are counted only once.

---

## Approach
- Use **binary search** on the y-coordinate.
- For each candidate y, compute the union area of squares below y.
- Union area is computed using:
  - Sweep line on the x-axis
  - Interval merging on the y-axis using an active set
- Stop binary search when precision reaches `1e-5`.

---

## Example
Input:
