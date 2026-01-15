# Maximize Area of Square Hole in Grid

## Problem
You are given a grid formed by horizontal and vertical bars.
Some bars can be removed, merging adjacent cells.

Your task is to find the **maximum possible area of a square-shaped hole**
after removing some allowed bars.

---

## Approach
- Removing consecutive bars merges adjacent cells.
- The side length of the largest square hole is determined by:
  - the maximum number of consecutive removable horizontal bars + 1
  - the maximum number of consecutive removable vertical bars + 1
- The square’s side length is the minimum of the two.
- Area = side × side.

---

## Time Complexity
- **O(k log k)** where `k` is the number of removable bars.

## Space Complexity
- **O(1)**

---

## Language
- Java