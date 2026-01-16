# Maximum Square Area by Removing Fences From a Field

## Problem
You are given a rectangular field with horizontal and vertical fences.
Some fences can be removed to merge regions.

Return the maximum possible area of a square field.
If it is not possible, return -1.

---

## Approach
- Add boundary fences at positions 1 and m (horizontal) and 1 and n (vertical).
- Calculate all possible distances between pairs of horizontal fences.
- Calculate all possible distances between pairs of vertical fences.
- A square is possible only if the same distance exists in both directions.
- Choose the maximum valid distance.
- Return the square of that distance modulo `10^9 + 7`.

---

## Time Complexity
- **O(h² + v²)**

## Space Complexity
- **O(h² + v²)**

---

## Language
- Java