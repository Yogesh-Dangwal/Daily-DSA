# Largest Number

## Problem
Given a list of non-negative integers, arrange them such that they form the
largest possible number and return it as a string.

---

## Approach
- Convert all integers to strings.
- Sort the strings using a custom comparator:
  - Compare `a + b` and `b + a`.
- The order that forms the larger combined string comes first.
- If the largest element is `"0"`, return `"0"` to avoid leading zeros.

---

## Time Complexity
- **O(n log n)** due to sorting.

## Space Complexity
- **O(n)** for storing string representations.

---

## Language
- Java