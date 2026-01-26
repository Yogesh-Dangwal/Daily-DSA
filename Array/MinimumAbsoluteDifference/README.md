# Minimum Absolute Difference

## Problem
Given an array of distinct integers, find all pairs of elements
with the minimum absolute difference.

Each pair must be in ascending order and the final list should
also be sorted.

---

## Approach
1. Sort the array.
2. The minimum absolute difference must occur between adjacent elements.
3. First pass: Find the minimum difference.
4. Second pass: Collect all pairs with that difference.

---

## Example
Input:
[4,2,1,3]

Output:
[[1,2],[2,3],[3,4]]

---

## Time Complexity
O(n log n) — sorting dominates

## Space Complexity
O(1) extra space (excluding output)

---

## Language
Java