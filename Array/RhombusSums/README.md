# Get Biggest Three Rhombus Sums in a Grid

---

## Problem
Given an m × n grid, find the three largest distinct rhombus border sums.

A rhombus border consists of four diagonal edges forming a diamond shape.

Return the three largest distinct sums in descending order.

If fewer than three exist, return all.

---

## Approach
For every cell:

1 Treat it as center.
2 Add size 0 rhombus (single cell).
3 Expand rhombus size.
4 Traverse the 4 borders:
   - Top → Right
   - Right → Bottom
   - Bottom → Left
   - Left → Top
5 Store sums in TreeSet to keep unique sorted values.
6 Extract top 3 largest sums.

---

## Time Complexity
O(m × n × min(m,n))

Grid size ≤ 50 so brute force works.

---

## Space Complexity
O(m × n)

For storing rhombus sums.

---

## Language

Java