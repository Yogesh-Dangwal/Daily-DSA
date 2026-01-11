# Maximal Rectangle

## Problem
Given a binary matrix filled with `0`s and `1`s, find the largest rectangle
containing only `1`s and return its area.

---

## Approach
- Treat each row as the base of a histogram.
- Build a `heights` array where each element represents consecutive `1`s above it.
- For each row, calculate the largest rectangle area in the histogram.
- Use a stack-based algorithm to compute the largest rectangle in histogram efficiently.

---
