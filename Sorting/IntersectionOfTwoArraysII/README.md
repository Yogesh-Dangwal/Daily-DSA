# Intersection of Two Arrays II

## Problem
Given two integer arrays, return their intersection.
Each element in the result should appear as many times as it appears
in both arrays.

The order of elements does not matter.

---

## Approach
- Use a HashMap to store the frequency of elements in the first array.
- Traverse the second array:
  - If the element exists in the map and its count is greater than 0,
    add it to the result and decrease the count.
- Convert the result list into an array.

---

## Time Complexity
- **O(n + m)**

## Space Complexity
- **O(min(n, m))**

---

## Language
- Java