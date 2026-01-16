# Maximum Square Area by Removing Fences From a Field

## Problem
You are given a rectangular field with removable horizontal and vertical fences.
By removing some fences, you can merge regions.

Return the **maximum area of a square field** that can be formed.
If no square can be formed, return `-1`.

---

## Approach
- Add boundary fences at positions `1` and `m` (horizontal) and `1` and `n` (vertical).
- Compute all possible distances between pairs of horizontal fences.
- Compute all possible distances between pairs of vertical fences.
- A square can be formed only if the same distance exists in both sets.
- Choose the maximum such distance.
- Return square of that distance modulo `10^9 + 7`.

---

## Time Complexity
- **O(h² + v²)**  
  where `h` and `v` are the number of fences.

## Space Complexity
- **O(h² + v²)**

---

## Language
- Java