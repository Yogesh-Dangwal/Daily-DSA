# Intersection of Two Arrays

## Problem
Given two integer arrays, return their intersection.
Each element in the result must be **unique**.
The order of the result does not matter.

---

## Approach
- Store all elements of the first array in a HashSet.
- Traverse the second array:
  - If the element exists in the set, add it to the result set.
- Convert the result set into an array.

---
