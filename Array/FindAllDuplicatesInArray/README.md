# Find All Duplicates in an Array

## Problem
Given an array `nums` of length `n` where:
- Values are in the range `[1, n]`
- Each element appears once or twice

Return all elements that appear twice.

---

## Approach
- Traverse the array
- For each number `x`, use index `x - 1`
- Mark the number at that index as negative
- If already negative, then `x` is a duplicate

This works because values are restricted to `1..n`.

---

## Time Complexity
- **O(n)**

## Space Complexity
- **O(1)** (excluding output list)

---

## Language
- Java